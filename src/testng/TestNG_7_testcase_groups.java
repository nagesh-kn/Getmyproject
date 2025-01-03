package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_7_testcase_groups {
	WebDriver driver;
	
  @Test(groups="Search")
  public void google() {
	  	driver.get("https://www.google.com");
  }
  @Test(groups="Food")
  public void swiggy() {
	  	driver.get("https://www.swiggy.com");
  }
  
  @Test(groups="Social")
  public void twitter() {
	  	driver.get("https://x.com/");
  }
  @Test(groups="Social")
  public void facebook() {
	  	driver.get("https://www.facebook.com");
 }
  @Test(groups="Food")
  public void zomato() {
	  	driver.get("https://www.zomato.com");

  }
  @Test(groups="Tech")
  public void selenium() {
	  	driver.get("https://www.selenium.dev");
  }
  @Test(groups="Tech")
  public void redmine() {
	  	driver.get("https://www.redmine.org");
  }
  @Test(groups="Social")
  public void gmail() {
	  
	  	driver.get("https://www.gmail.com");
  }
  
  @BeforeTest(groups="Social,Food")
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

  @AfterTest(groups="Social")
  public void afterTest() { 
	  driver.quit();
  }

}
