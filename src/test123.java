import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test123 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("http://localhost:8585/do/login");
		  driver.findElement(By.xpath("//input[@value='Submit' and @onclick='publicRegisterUser()']")).click();
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  js.executeScript("prompt('This is a simple alert')");
		  
		  Alert alert=driver.switchTo().alert();
		  alert.sendKeys("manipal");
		  Thread.sleep(3000);
		  
		  System.out.println(alert.getText());
		  //alert.accept();
		  
		 driver.findElement(By.name("member(user).username")).sendKeys("mmmm");
		  //driver.close();
		  

	}

}
