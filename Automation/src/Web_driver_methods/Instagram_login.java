package Web_driver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram_login {
	public static void main(String[] args) {
		// to launch chrome browser
		WebDriver driver = new ChromeDriver();
		
		// to get launch web application
		driver.get("https://www.instagram.com/");
		
		//to maximize the window
		driver.manage().window().maximize();
		
		
		
		// name text field
		 WebElement usernameTextfield = driver.findElement(By.name("username"));
		 usernameTextfield.sendKeys("shafauddinsonu");
		 
		// passwordtextfield 
		 WebElement passwordTextfield = driver.findElement(By.name("password"));
		 passwordTextfield.sendKeys("123@321");
	
		 WebElement loginButton = driver.findElement(By.className("_acap"));
		 loginButton.click();
	}

}
