package Web_driver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithLinktext {
	public static void main(String[] args) {
		// to launch chrome browser
		WebDriver driver = new ChromeDriver();
		
		// to get launch web application
		driver.get("https://www.instagram.com/");
		
		//to maximize the window
		driver.manage().window().maximize();
		
		
		// working with forgot password
		driver.findElement(By.linkText("Forgot password?")).click();
	}

}
