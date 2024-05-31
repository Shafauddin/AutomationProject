package Web_driver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangehr {
	public static void main(String[] args) {
		// to launch chrome browser
		WebDriver driver = new ChromeDriver();
		// to maximize the window
		driver.manage().window().maximize();
		// to launch web application
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.findElement(By.xpath())
}
}