package dropdownfeatures;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Droupdownfeatures {
	WebDriver driver;
	 
  @Test(enabled=false)
  public void dropDown() {
	  driver.get("https://schoolinnovationmarathon.org/lp/");
	  driver.findElement(By.xpath("(//*[contains(text(),\"Road Map\")])[1]")).click();
	  new Select(driver.findElement(By.xpath("//select[@class=\"form-select p-1\"]"))).selectByContainsVisibleText("हिंदी");
	  new Select(driver.findElement(By.xpath("//select[@class=\\\"form-select p-1\\\"]"))).deSelectByContainsVisibleText("हिंदी");
	  
  }
  
  @Test(enabled=false)
  public void dropDown1() {
	  driver.get("https://www.facebook.com/");
	  driver.findElement(By.xpath("//*[contains(text(),\"Create ne\")]")).click();
	  driver.findElement(By.xpath("(//*[@type=\"text\"])[1]")).sendKeys("nagesh");
	  new Select(driver.findElement(By.xpath("//select[@id='day']"))).selectByContainsVisibleText("26");
	  Select mo = new Select(driver.findElement(By.xpath("//*[@id='month']")));
	  mo.selectByIndex(1);
	  Select year = new Select(driver.findElement(By.xpath("//*[@name='birthday_year']")));
	  year.selectByValue("2000");
	  driver.findElement(By.xpath("(//*[@class=\"_58mt\"])[2]")).click();
	  
  }
  
  @Test
  public void dropDown3() {
	  driver.get("https://practice.expandtesting.com/dropdown");
	  new Select(driver.findElement(By.xpath("//*[@id=\"dropdown\"]"))).selectByIndex(1);
	  Select ele =new Select(driver.findElement(By.xpath("//*[@id=\"elementsPerPageSelect\"]")));
	  ele.selectByValue("50");
	  new Select(driver.findElement(By.xpath("//*[@name=\"country\"]"))).selectByContainsVisibleText("Denmark");
	//  new Select(driver.findElement(By.xpath("//*[@id=\\\"elementsPerPageSelect\\\"]"))).deselectByValue("50");
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver= new ChromeDriver();
	  driver.manage().window().maximize();
	 
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
