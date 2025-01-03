package demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Programe1 {
	
	  static WebDriver driver;

	public static void main(String[] args) throws Exception {

		// System.out.println("hello");
		
	//WebDriver driver = new ChromeDriver();
		
	//	ChromeDriver driver = new ChromeDriver();
		
	//	driver = new EdgeDriver();
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();		
	Thread.sleep(3000);	
		driver.manage().window().minimize();
		
	//	driver.close();
		
	//	driver.quit();
		
	
	}

}
