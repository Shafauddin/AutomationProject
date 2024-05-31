package Web_driver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Spotify {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver(); 
	driver.get("https://open.spotify.com/");
	driver.manage().window().maximize();

	driver.findElement(By.className("ButtonInner-sc-14ud5tc-0")).click();
//	driver.findElement(By.xpath("//input[@type ='text']")).sendKeys("12345");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@id ='login-button']"));
}
}
