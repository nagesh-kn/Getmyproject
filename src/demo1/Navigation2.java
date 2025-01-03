package demo1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation2 {
	
	static WebDriver driver;
	

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();	
	driver.get("https://www.google.com/");
	Thread.sleep(2000);
	driver.get("https://github.com/login");
	driver.findElement(By.id("password"));
	Thread.sleep(2000);
	driver.findElement(By.name("login"));
	Thread.sleep(2000);
	driver.findElement(By.className("header-logo"));
	Thread.sleep(2000);
	driver.findElement(By.linkText("Create an account"));
	Thread.sleep(2000);
	driver.findElement(By.partialLinkText("Forgot"));
	Thread.sleep(2000);
	driver.findElement(By.tagName("h1"));
	Thread.sleep(2000);
	driver.findElement(By.xpath("//label[contains(text(),'Username or email address')]"));
	Thread.sleep(2000);
	
		
		
	}


	
	private static void highlight(WebDriver driver2, WebElement webElement) {
		// TODO Auto-generated method stub
		
	}

}




