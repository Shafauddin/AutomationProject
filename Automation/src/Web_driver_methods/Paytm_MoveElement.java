package Web_driver_methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Paytm_MoveElement {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://paytm.com/");
		
		Actions a = new Actions(driver);
		WebElement mousehover = driver.findElement(By.xpath("//a[text() = 'Paytm for Consumer']"));
		a.moveToElement(mousehover).perform();
         WebElement mousemove = driver.findElement(By.linkText("Payments"));
         a.moveToElement(mousemove).perform();
         a.click(driver.findElement(By.linkText("Online Payments"))).perform();
		
	}

}
