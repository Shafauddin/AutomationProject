package Web_driver_methods;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

// Assignment : go to the paytm right click on the web page than press arrow down key with the help of robot class and than when your curser will move down to inspect than click enter
public class paytm_inspect {
public static void main(String[] args) throws AWTException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://paytm.com/");
	Robot r = new Robot();
	// for right click
	r.keyPress(KeyEvent.VK_SHIFT);
	r.keyPress(KeyEvent.VK_F10);
	Actions a = new Actions(driver);

	for(int i=0;i<11;i++) {
		r.keyPress(KeyEvent.VK_DOWN);
	}
	
	
}
}
