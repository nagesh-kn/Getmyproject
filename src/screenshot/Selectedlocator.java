package screenshot;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Selectedlocator {
	WebDriver driver;
	
  @Test
  public void screenshot() throws InterruptedException, IOException {
	  driver.get("https://www.flipkart.com/");
	  Thread.sleep(2000);
	  WebElement sr =driver.findElement(By.xpath("//img[@alt=\"Grocery\"]"));
	  
	  File f=sr.getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(f,new File("C:\\Users\\Home\\Documents\\lib\\Practice\\Screenshots\\impsr.png"));
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
