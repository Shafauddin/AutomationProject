package Web_driver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook_login {
	public static void main(String[] args) throws InterruptedException {
		// to launch chrome browser
		WebDriver driver = new ChromeDriver();
		
		// to get launch web application
		driver.get("https://www.facebook.com/");
		
		//to maximize the window
		driver.manage().window().maximize();
		// to create new accountt
		
		WebElement signupButton = driver.findElement(By.className("_4jy2"));
		signupButton.click();
		 Thread.sleep(2000);
		// firstname text field
		 WebElement FirstnameTextfield = driver.findElement(By.name("firstname"));
		 FirstnameTextfield.sendKeys("hero");
		 
		// second name text field 
		 WebElement secondnameTextfield = driver.findElement(By.name("lastname"));
		 secondnameTextfield .sendKeys("123@321");
		
		 // phone no 
		 WebElement phonenoTextfield = driver.findElement(By.name("reg_email__"));
		 phonenoTextfield .sendKeys("9315725972");
		 
	// 	 password
		 WebElement passwordTextfield=driver.findElement(By.name("reg_passwd__"));
		 passwordTextfield.sendKeys("37egffhkwhrf");
		 
		 //for male
		 driver.findElement(By.cssSelector("input[value='2']")).click();
		 
		 
		// signup
		 driver.findElement(By.name("websubmit")).click();
		 
		 
		 
	}
	
	
	

}
