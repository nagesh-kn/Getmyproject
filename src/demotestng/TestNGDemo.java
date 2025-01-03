package demotestng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNGDemo {
	WebDriver driver;
	
  @Test
  public void zomato() {
	  driver.get("https://www.zomato.com");
	  
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
