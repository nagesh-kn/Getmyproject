package verifytabtitleurltext;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class VerifyTabURLText {
	WebDriver driver;
	  @Test
	  public void tabTitle() {
		  driver.get("https://www.google.com");
		  String expected = "google";
		  System.out.println("Expected tab title : "+expected);
		  
		  String actual = driver.getTitle();
		  System.out.println("Actual tab title : "+actual);
		  
		  Assert.assertEquals(actual, expected);
	  }
	  @Test
	  public void tabTitle2() {
		  driver.get("https://www.w3schools.com/html/default.asp");
		  String expected = "HTML Tutorial";
		  
		  String actual = driver.getTitle();
		  
		  Assert.assertEquals(actual, expected);
	  }
	  @Test
	  public void verifyURL() {
		  driver.get("https://www.google.com");
		  String expectedURL = "https://www.google.com";
	//	  System.out.println("Expected tab title : "+expectedURL);
		  
		  String actualURL = driver.getCurrentUrl();
	//	  System.out.println("Actual tab title : "+actualURL);
		  
		  Assert.assertEquals(actualURL, expectedURL);
	  }
	  @Test
	  public void verifyText() {
		  driver.get("https://www.google.com");
		  
		  String expectedText = "gmail";
		  String actualText = driver.findElement(By.xpath("(//*[contains(text(),\"Gmail\")])[1]")).getText();
		  Assert.assertEquals(actualText, expectedText);  
	  }
	  @Test
	  public void pageSource() {
		  driver.get("https://www.google.com");
		  
		  String pagesource = driver.getPageSource();
		  System.out.println("Page Source: "+pagesource);
	  }
	  @Test
	  public void getAttr() {
		  driver.get("https://www.google.com");
		  WebElement att=driver.findElement(By.className("gb_Z"));
		  String attribute = att.getAttribute("data-pid");
		  System.out.println("Value: "+attribute);
	  }
	  @Test
	  public void getAttr2() {
		  driver.get("https://www.google.com/");
		  WebElement attr=driver.findElement(By.className("gNO89b"));
		  String attribute = attr.getAttribute("name");
		  System.out.println("Value:"+attribute);
		  
	  
	  }


	  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
