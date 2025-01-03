package isdisplayedisenabledisselected;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class VerifyImageTextCheckboxFieldboxes {
	WebDriver driver;

	@Test(enabled=false)
	public void isDisplayedMethod() throws InterruptedException {
		driver.get("https://www.redmine.org/");
		Thread.sleep(3000);
		boolean help = driver.findElement(By.xpath("//a[@class='help']")).isDisplayed();
		
		if(help==true)
		{
			System.out.println("Help menu item is displayed in the top bar menu");
			driver.findElement(By.xpath("//a[@class='help']")).click();
		}
		else
		{
			System.out.println("Help menu item is not displayed in the top bar menu");
		}
	}
	
	@Test(enabled=false)
	public void isEnabledMethod() throws InterruptedException {
		driver.get("https://www.redmine.org/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='login']")).click();
		boolean user=driver.findElement(By.xpath("//*[@name=\"username\"]")).isEnabled();
		
		if(user==true)
		{
			System.out.println("Login username Text box is enabled to enter username");
			driver.findElement(By.xpath("//*[@name=\"username\"]")).sendKeys("nani");
		}
		else
		{
			System.out.println("Login username Text box is not enabled to enter username");
		}
		
	}
	@Test(enabled=false)
	public void isSelectedMethod() throws InterruptedException {
		driver.get("https://www.redmine.org/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='login']")).click();
		
		driver.findElement(By.xpath("//input[@name='autologin']")).click();
		boolean sclt = driver.findElement(By.xpath("//input[@name='autologin']")).isSelected();
		
		if(sclt==true)
		{
			System.out.println("staylogged in check box is selected");
		}
		else
		{
			System.out.println("stay logged in check box is not selected");
		}
	}
	@Test
	public void isSelectedMethod2() throws InterruptedException {
		driver.get("https://www.redmine.org/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[3]/a")).click();
		boolean slt = driver.findElement(By.xpath("//*[@id=\"show_issues\"]")).isSelected();
		boolean show = driver.findElement(By.xpath("//*[@id=\"show_changesets\"]")).isSelected();
		boolean wiki = driver.findElement(By.xpath("//*[@id=\"show_wiki_edits\"]")).isSelected();
		if(slt==true)
		{
			System.out.println("yes show issues Selected");
		}
		else
		{
			System.out.println("No show issues not Selected");
		}
		if(show==true)
		{
			System.out.println("yes show_changesets Selected");
		}
		else
		{
			System.out.println("No show_changesets not Selected");
		}
		if(wiki==true)
		{
			System.out.println("yes show_wiki_edits Selected");
		}
		else
		{
			System.out.println("No show_wiki_edits not Selected");
		}
		
	}
		

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

}


