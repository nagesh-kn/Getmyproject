package sikuli;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;
import org.testng.annotations.Test;

public class Desktopautomation {
	Screen sc = new Screen();
	
  @Test
  public void desktopautomation() throws SikuliException, InterruptedException {
	  Thread.sleep(4000);
	  sc.click("C:\\Users\\Home\\Desktop\\nani\\feb\\Wether.PNG");
	  Thread.sleep(1000);
	  sc.click("C:\\Users\\Home\\Desktop\\nani\\feb\\Window.PNG");
	  Thread.sleep(6000);
	//  sc.click("C:\Users\Home\Desktop\nani\feb\\Wi.PNG");
	//  sc.dragDrop("C:\Users\Home\Desktop\nani\feb\\Reder.PNG", "C:\Users\Home\Desktop\nani\feb\\Nani.PNG");
	    sc.doubleClick("C:\\Users\\Home\\Desktop\\nani\\feb\\Nani.PNG");
	  
	  
  }
}
