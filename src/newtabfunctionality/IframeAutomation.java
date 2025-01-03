package newtabfunctionality;

import org.testng.annotations.Test;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class IframeAutomation {
	WebDriver driver;
	
  @Test(enabled=false)
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
	  Thread.sleep(2000);
	  ArrayList<String>tab =new ArrayList<String>(driver.getWindowHandles());
	  driver.switchTo().window(tab.get(1));
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//*[@title=\"MySQL Tutorial\"])[3]")).click();
	  Thread.sleep(2000);
	  driver.switchTo().window(tab.get(0));
	  driver.close();
  }
	  
	  @Test
	  public void newtabcode() throws InterruptedException {
		  driver.get("https://www.google.com/");
		  Thread.sleep(3000);
		  driver.switchTo().newWindow(WindowType.TAB);
		  driver.get("https://www.facebook.com/");		  
		  driver.switchTo().newWindow(WindowType.WINDOW);
		  driver.get("https://www.w3schools.com/");
		  Thread.sleep(2000);
		  driver.close();
		  
	  }
	  
  
  @BeforeTest
  public void beforeTest() {
	  driver =new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
