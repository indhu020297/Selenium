//This script shows the execution of the sign_up page with invalid details


import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class sign_up_invalid {
	
	WebDriver driver;
  @Test
  public void signupinvalid() throws InterruptedException {
	  
	  driver.findElement(By.xpath("//input[@value='Submit'and@type='button']")).click();
	  driver.findElement(By.name("member(user).username")).sendKeys("Indhu");
	  driver.findElement(By.name("member(name)")).sendKeys("Indhumathi G");
	  driver.findElement(By.name("member(email)")).sendKeys("abc@123@gmail.com");
	  driver.findElement(By.name("member(user).password")).sendKeys("indhu123");
	  driver.findElement(By.name("confirmPassword")).sendKeys("indhu123");
	  Thread.sleep(15000);
	  driver.findElement(By.xpath("//input[@value='Submit']")).click();
      String expected ="E-Mail is invalid";
       Alert alert = driver.switchTo().alert();
       String actualres = alert.getText();
       System.out.println(actualres);
       Assert.assertTrue(actualres.contains(expected));
       alert.accept();
	  
	  
  }


  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://localhost:8585/do/login");
  }

  @AfterTest
  public void afterTest() {
	  
	  driver.quit();
  }

}
