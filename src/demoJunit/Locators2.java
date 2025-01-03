package demoJunit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class Locators2 {
	
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
@Disabled
//	@AfterAll
	static void tearDownAfterClass() throws Exception {
	driver.quit();
	}
@Disabled
	@Test
	void idname() throws InterruptedException {
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("hjk");
		Thread.sleep(2000);
		driver.findElement(By.name("pass")).sendKeys("bnm");
		Thread.sleep(2000);
		
		
	}
@Disabled
	@Test
	void tclass() throws InterruptedException {
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.className("gLFyf")).sendKeys("yui");
		Thread.sleep(4000);
	//	driver.findElement(By.linkText("Gmail")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Gma")).click();
		
	}
@Disabled
	@Test
	void cssSelector() throws InterruptedException {
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("nani");
		Thread.sleep(3000);
		driver.findElement(By.name("pass")).sendKeys("hut");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#u_0_5_tq")).click();
		
}
@Disabled
@Test
void cssSelector2() throws InterruptedException {
	driver.get("https://passbook.epfindia.gov.in/MemberPassBook/login");
	Thread.sleep(2000);
	driver.findElement(By.id("username")).sendKeys("123546875");
	Thread.sleep(2000);
	driver.findElement(By.id("password")).sendKeys("sdhfi");
	Thread.sleep(2000);
/*	driver.findElement(By.id("password")).clear();
	Thread.sleep(2000);
	driver.findElement(By.id("password")).sendKeys("nnk");
	Thread.sleep(2000); */
	driver.findElement(By.cssSelector("button#login")).click();
	
}
@Disabled
@Test
void linkPartialLinkText() throws InterruptedException {
	driver.get("https://www.google.com/");
	Thread.sleep(2000);
		driver.findElement(By.linkText("తెలుగు")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Engl")).click();		
	//	driver.navigate().refresh();
	//	Thread.sleep(2000);
	//	driver.findElement(By.linkText("Become a Seller")).click();
		
}

@Disabled
@Test
void tagName() throws InterruptedException {
	driver.get("https://www.ndtv.com/");
	Thread.sleep(2000);
//	List<WebElement> linkslist = driver.findElements(By.tagName("a"));
	
//	System.out.println("total no of links in Ndtv :"+linkslist.size());
	
// List<WebElement> totalparagraph = driver.findElements(By.tagName("p"));
	
//	System.out.println("total no of paragraph in Ndtv :"+totalparagraph.size());
	
	List<WebElement> jdklkjh = driver.findElements(By.tagName("input"));
	System.out.println(jdklkjh.size());
	

	
	
	/*	driver.findElement(By.linkText("Latest")).click();
	Thread.sleep(2000);
	List<WebElement> totalimages = driver.findElements(By.tagName("input"));
	List<WebElement> totallts = driver.findElements(By.tagName("div"));
	
	System.out.println("total no of Leters in Ndtv :"+totallts.size());
	driver.findElement(By.partialLinkText("Behind R Ashw")).click();*/
	
}

@Disabled
@Test
void Xpath() throws InterruptedException {
	Thread.sleep(2000);
/*	driver.get("https://biolinelab.org/slims/forms/fm_login.aspx");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"txtUserName\"]")).sendKeys("nhj");
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/form/div[3]/div/div/div[2]/div/div[2]/div[1]/div/div/p[3]/input")).sendKeys("kjh");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type=\"submit\"]")).click(); */
	
	driver.get("https://www.ndtv.com/lifestyle");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@alt='FOOD']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[normalize-space(text())='MOVIES']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div/div/nav/ul/li[8]/a")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@class='vj_icn vj_menu']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"snav_search_q_new\"]")).click();
	
}
@Disabled
@Test
void Xpath2() throws InterruptedException {
	Thread.sleep(2000);
	driver.get("https://www.w3schools.com/html/html_comments.asp");
	driver.findElement(By.xpath("//*[@id=\"subtopnav\"]/a[5]")).click();
	
}

@Test
void Xpath3() throws InterruptedException {
	Thread.sleep(2000);
	driver.get("https://schoolinnovationmarathon.org/lp/");
	driver.findElement(By.xpath("//*[contains(text(),'Testi')]")).click();
	Thread.sleep(2000);
	
	
	}

}
