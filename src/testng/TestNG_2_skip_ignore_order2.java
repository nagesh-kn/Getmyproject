package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_2_skip_ignore_order2 {
	WebDriver driver;
	
  @Test(priority=0)
  public void google() {
	  	driver.get("https://www.google.com");
  }
  
  @Test(priority=1,enabled=false)
  public void twitter() {
	  	driver.get("https://x.com/");
  }
  @Test(priority=2, enabled=true)
  public void facebook() {
	  	driver.get("https://www.facebook.com");
  }
  @Test(enabled=false,priority=3)
  public void selenium() {
	  	driver.get("https://www.selenium.dev");
  }
  @Test(priority=4)
  public void redmine() {
	  	driver.get("https://www.redmine.org");
  }
  @Test(priority=5)
  public void gmail() {
	  
	  	driver.get("https://www.gmail.com");
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
