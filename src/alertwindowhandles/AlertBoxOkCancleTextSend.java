package alertwindowhandles;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class AlertBoxOkCancleTextSend {
	WebDriver driver;
  @Test(enabled=false)
  public void alertokbutton() throws InterruptedException {
	  driver.get("https://demo.automationtesting.in/Alerts.html");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//*[contains(text(),\"alert box\")])[1]")).click();
	  Thread.sleep(2000);
	  driver.switchTo().alert().accept();
  }
  @Test(enabled=false)
  public void alertcanclebutton() throws InterruptedException {
	  driver.get("https://demo.automationtesting.in/Alerts.html");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//*[@class=\"analystic\"])[2]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@class=\"btn btn-primary\"]")).click();
	  Thread.sleep(2000);
	  driver.switchTo().alert().dismiss();
  }
  @Test
  public void alertsendtextokbutton() throws InterruptedException {
	  driver.get("https://demo.automationtesting.in/Alerts.html");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[contains(text(),\"Textbox\")]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@class=\"btn btn-info\"]")).click();
	  Thread.sleep(2000);
	  driver.switchTo().alert().sendKeys("nani");
	  Thread.sleep(2000);
	  driver.switchTo().alert().dismiss();
	//  driver.switchTo().alert().accept();
	  
  }
  
  @Test
  public void alertsendtextokbutton2() throws InterruptedException {
	  driver.get("https://demo.automationtesting.in/Alerts.html");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[contains(text(),\"Textbox\")]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@class=\"btn btn-info\"]")).click();
	  Thread.sleep(2000);
	  Alert cl = driver.switchTo().alert();	  
	  cl.sendKeys("vnkm");
	  cl.accept();
	  
  }
  
  
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
