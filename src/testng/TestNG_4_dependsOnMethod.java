package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_4_dependsOnMethod {
	WebDriver driver;
	
  @Test(priority=1,enabled=false)
  public void selenium() {
	  	driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("selenium"+Keys.ENTER);
	  	driver.findElement(By.xpath("//div[contains(text(),'Images')]")).click();
  }  
  @Test (priority=2,enabled=false)
  public void html() {
	  driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("html");
	  driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys(Keys.ENTER);
	  driver.findElement(By.xpath("//div[contains(text(),'Images')]")).click();
	  
} 
  @Test (priority=0,enabled=false)
  public void zip() {
	  driver.get("https://www.google.com");
	 
  }
  
  @Test(dependsOnMethods="method3")
  public void method1() {
	  	driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("selenium"+Keys.ENTER);
	  	driver.findElement(By.xpath("//div[contains(text(),'Images')]")).click();
	  	driver.findElement(By.xpath("//textarea[@id='APjFqb']")).clear();
	  	
  }  
  @Test (dependsOnMethods="method3")
  public void method2() {
	  driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("html");
	  driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys(Keys.ENTER);
	  driver.findElement(By.xpath("//div[contains(text(),'Images')]")).click();
	  
} 
  @Test 
  public void method3() {
	  driver.get("https://www.google.com");	 

  }
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() { 
	  driver.quit();
	  
  }

}
