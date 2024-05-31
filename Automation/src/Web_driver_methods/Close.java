package Web_driver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close {
public static void main(String[] args) {
	// to launch chrome browser
	WebDriver driver = new ChromeDriver();
	
	// to get launch web application
	driver.get("https://www.youtube.com/");
	
	//to maximize the window
	driver.manage().window().maximize();
	
	
}
}
