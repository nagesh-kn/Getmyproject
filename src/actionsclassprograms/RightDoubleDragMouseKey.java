package actionsclassprograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class RightDoubleDragMouseKey {
	WebDriver driver;
	
  @Test(enabled = false)
  public void rightClick() throws InterruptedException {
	  driver.get("https://github.com/openhab/openhab-docs/tree/main/.github/workflows");
	  Thread.sleep(3000);
	  Actions act = new Actions(driver);
	  act.contextClick(driver.findElement(By.xpath("//a[text()=\"Pricing\"]"))).build().perform();
	  }
  @Test(enabled = false)
  public void doubleClickonwebelement() throws InterruptedException {
	  driver.get("https://github.com/openhab/openhab-docs/tree/main/.github/workflows");
	  Thread.sleep(3000);
	  Actions act = new Actions(driver);
	  act.moveToElement(driver.findElement(By.xpath("(//*[contains(text(),\"fetch_docs_openhab-android\")])[4]"))).doubleClick().build().perform();
	  
  }
  @Test
  public void mouseHover() throws InterruptedException {
	  driver.get("https://github.com/openhab/openhab-docs/tree/main/.github/workflows");
	 
	  Actions act = new Actions(driver);
	  act.moveToElement(driver.findElement(By.xpath("(//*[contains(text(),\"Enterprise\")])[2]"))).build().perform();
	  act.moveToElement(driver.findElement(By.xpath("(//*[contains(text(),\"GitHub Copilot\")])[2]"))).click().build().perform();
	  }
  @Test(enabled =false)
  public void keyboardkeys() throws InterruptedException {
	  driver.get("https://github.com/openhab/openhab-docs/tree/main/.github/workflows");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("(//*[contains(text(),\"Sign in\")])[2]")).click();
	  Thread.sleep(4000);
	  Actions act = new Actions(driver);
	  act.sendKeys(Keys.TAB).build().perform();
	   }
  
  @Test
  public void draganddrop() throws InterruptedException {
	  driver.get("https://demo.automationtesting.in/Static.html");
	  Thread.sleep(3000);
	  Actions at = new Actions(driver);
	  
	  WebElement src = driver.findElement(By.xpath("//*[@src=\"logo.png\"]"));
	  WebElement tgt = driver.findElement(By.xpath("//*[@id=\"droparea\"]"));
	  
	  at.dragAndDrop(src, tgt).build().perform();
	 
	 
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
