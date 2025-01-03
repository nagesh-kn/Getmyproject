package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_3_timeout {
	WebDriver driver;
	
  @Test (timeOut=20000)
  public void selenium() {
	  	driver.get("https://www.google.com");
	  	driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("selenium"+Keys.ENTER);
	  	driver.findElement(By.xpath("//div[contains(text(),'Images')]")).click();
  }
  
  @Test(timeOut=15000)
  public void html() {
	  driver.get("https://www.google.com");
	  driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("html");
	  driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys(Keys.ENTER);
	  driver.findElement(By.xpath("//div[contains(text(),'Images')]")).click();

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
