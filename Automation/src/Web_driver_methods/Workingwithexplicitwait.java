package Web_driver_methods;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.description.ModifierReviewable.OfAbstraction;

public class Workingwithexplicitwait {
	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.shoppersstack.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait((Duration.ofSeconds(20));
	
	}

}
