package framefeature;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class IframeAutomation {
	WebDriver driver;
	
  @Test
  public void framesapplication() throws InterruptedException {
	  driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
	  Thread.sleep(2000);
	  WebElement frm = driver.findElement(By.xpath("//*[@id=\"iframeResult\"]"));
	  driver.switchTo().frame(frm);
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@onclick=\"myFunction()\"]")).click();
	  Thread.sleep(2000);
	  driver.switchTo().alert().accept();
	  Thread.sleep(2000);
	  driver.switchTo().defaultContent();
	  driver.findElement(By.xpath("//*[@id=\"getwebsitebtn\"]")).click();
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver =new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
