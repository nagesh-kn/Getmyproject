package screenshot;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.hotkey.Keys;
import org.testng.annotations.BeforeTest;

public class Bugscreenshot {
	WebDriver driver;
	public void Screenshot() throws IOException {
		SimpleDateFormat dateFormate=new SimpleDateFormat("yyyy_MMM_dd HH_mm_ss");
		Date date =new Date();
		String time = dateFormate.format(date);
		
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\Users\\Home\\Documents\\lib\\Practice\\Screenshots\\pic.png"));
	}
  @Test(enabled=false)
  public void errorscreenshot() throws IOException {
	  File f =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(f, new File("C:\\Users\\Home\\Documents\\lib\\Practice\\Screenshots\\pic.png"));
  }
  
  @Test
  public void google() throws InterruptedException, IOException {
	  driver.get("https://www.google.com/");
	  Thread.sleep(3000);
	  Screenshot();
	  driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Chittoor"+Keys.ENTER);
	  Thread.sleep(2000);
	  Screenshot();
	  driver.findElement(By.xpath("//div[contains(text(),'Images')]")).click();
	  Screenshot();
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
