package screenshot;

import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v129.page.model.Screenshot;
import org.testng.annotations.BeforeTest;

public class FullpageScreenshor {
	WebDriver driver;
	
  @Test
  public void completePageScreenshot() throws InterruptedException {
	  driver.get("https://dictionary.cambridge.org/dictionary/english/command");
	  Thread.sleep(2000);
	  Screenshot fp=new AShot().ShootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
	  ImageIO.write(fp.getImage(), "PNG", new File("C:\\Users\\Home\\Documents\\lib\\Practice\\Screenshots\\fullpage.png"));
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
