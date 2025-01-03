package log4jtutorials;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Log4jDemo {
	WebDriver driver;
	
  @Test
  public void googlesearch() {
	  Logger kn =Logger.getLogger("search");
	  PropertyConfigurator.configure("Log4jkn");
	  driver =new ChromeDriver();
	  kn.info("Chrome Browser Launched ");
	  driver.manage().window().maximize();
	  kn.info("Browser window maximized");
	  
	 
	  
  }
}
