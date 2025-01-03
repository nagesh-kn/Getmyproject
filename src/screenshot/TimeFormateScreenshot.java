package screenshot;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TimeFormateScreenshot {
	WebDriver driver;
	public void bugScreenshot() throws IOException {
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\Users\\Home\\Documents\\lib\\Practice\\Screenshots\\bugimg.png"));
		
	}
  @Test
  public void Screenshort() throws IOException, InterruptedException {
	  driver.get("https://www.redmine.org/");
	  Thread.sleep(3000);
	  
	  try
	  {
		  driver.findElement(By.xpath("//*[@class='login']")).click();
		  driver.findElement(By.xpath("//*[@id='username']")).sendKeys("nani");
		  driver.findElement(By.xpath("//*[@id='password']")).sendKeys("123");
		  driver.findElement(By.xpath("//*[@id='autologin']")).click();
		  driver.findElement(By.xpath("//*[@id='login-submit']")).click();
		  driver.findElement(By.xpath("//*[@class='registerl']")).click();
		  
	  }
	  catch(Exception e)
	  {
		  System.out.println("faild part"+e);
		  bugScreenshot();
	  }
	  
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver =new ChromeDriver();
	  driver.manage().window().maximize();
	  
  }

}
