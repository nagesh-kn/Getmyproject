package sikuli;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Screen;
import org.testng.annotations.AfterTest;

public class SikuliWebAutomation {
	WebDriver driver;
	
	Screen sc = new Screen();
  @Test
  public void websikuliautomation() throws Exception {
	  driver.get("https://www.w3schools.com/html/");
	  Thread.sleep(5000);
	  sc.type("C:\\Users\\Home\\Desktop\\nani\\feb\\Search.PNG", "html");
	  Thread.sleep(5000);
	  
	
	//  sc.click("C:\\Users\\Home\\Desktop\\nani\\feb\\Tuto.PNG");
	  
	
	  
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
