package pagescrolldownup;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.interactions.Locatable;
import org.testng.annotations.AfterTest;

public class PageScrollDownUp {
	WebDriver driver;
	
  @Test(enabled=false)
  public void scrolldown() throws InterruptedException {
	  driver.get("https://www.selenium.dev/");
	  driver.findElement(By.xpath("//*[contains(text(),\"Download\")]")).click();	  
	  JavascriptExecutor sc = (JavascriptExecutor)driver;
	  sc.executeScript("scroll(0,3400)");	  
	  Thread.sleep(2000);	  
	 
	 // driver.findElement(By.xpath("//*[contains(text(),\"Ecosystem p\")]")).click();   
  }
  @Test(enabled=false)
  public void scrollup() throws InterruptedException {
	  Thread.sleep(2000);
	  JavascriptExecutor sc = (JavascriptExecutor)driver;
	  sc.executeScript("scroll (3000,0)");
	  Thread.sleep(2000);
  }
  @Test
  public void identifylocatorelement() throws InterruptedException {
	  driver.get("https://www.selenium.dev/");
	  driver.findElement(By.xpath("//*[contains(text(),\"Download\")]")).click();
	  WebElement el=(WebElement)driver.findElement(By.xpath("//*[contains(text(),\"Ecosystem page\")]"));
	  Coordinates co=((Locatable)el).getCoordinates();	  
	  co.onPage();
	  co.inViewPort();
	  driver.findElement(By.xpath("//*[contains(text(),\"Ecosystem page\")]")).click();
	  
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  driver =new ChromeDriver();
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
