package waitcommands;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class WaitCommands {
	WebDriver driver;
  @Test
  public void implicitywait() {
	  driver.get("https://github.com/openhab/openhab-docs/tree/main/.github/workflows");
		 
	  Actions act = new Actions(driver);
	  act.moveToElement(driver.findElement(By.xpath("//button[normalize-space()='Product']"))).build().perform();
	  act.moveToElement(driver.findElement(By.xpath("//div[normalize-space()='Code Review']"))).click().build().perform();
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
