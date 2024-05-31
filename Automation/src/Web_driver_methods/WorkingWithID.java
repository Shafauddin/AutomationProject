package Web_driver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithID {
	public static void main(String[] args) {
		// to launch chrome browser
		WebDriver driver = new ChromeDriver();
		
		// to get launch web application
		driver.get("https://www.facebook.com/");
		
		//to maximize the window
		driver.manage().window().maximize();
		
		//id text field
		 WebElement usernameTextField = driver.findElement(By.id("email"));
		 usernameTextField.sendKeys("908654321");
		 
	}
}
