package Web_driver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateOrangeHrm {
	// to launch chrome browser
			WebDriver driver = new ChromeDriver();
			
			// to get launch web application
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
			//to maximize the window
			driver.manage().window().maximize();
			
//			 to admin 
//			 driver.findElement(By.name("username")).sendKeys("ghhgsfdhsdh");
			
}
