package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_5_Description {
	WebDriver driver;


  @Test(description="logo module",enabled=false)
  public void dm2() {
	  driver.findElement(By.xpath("//*[@class=\"logo\"]/img")).click();
  }

  @Test(description="logo module",enabled=false)
  public void dm4() {
	  driver.findElement(By.xpath("//*[@class=\"logo\"]/img")).click();
  }

@Test(description="logo module")
public void dm5() {
	driver.findElement(By.xpath("//i[@class='fa fa-logo ws-hover-text-green']")).click();
}

@Test(description="search funcationality")
public void dm6() {
	driver.findElement(By.xpath("(//*[@type=\"text\"])[1]")).sendKeys("java");
}
@Test(description="menu1",enabled=false)
public void dm7() {
	driver.findElement(By.xpath("//*[normalize-space(text())=\"Jav\"]")).click();
}

   
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	//  driver.get("https://schoolinnovationmarathon.org/lp/index.html");
	  driver.get("https://www.w3schools.com/");
  }
  

  @AfterTest
  public void afterTest() { 
	  driver.quit();
	  
  }

}
