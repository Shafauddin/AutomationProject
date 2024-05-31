package GetUrl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.sdk.metrics.internal.exemplar.AlwaysOffFilter;

public class Tolaunchbrowsser {
	public static void main(String[] args) {
		// to launch chrome browser
		WebDriver driver = new ChromeDriver();
		// to maximize the window
		driver.manage().window().maximize();
		// to launch web application
		driver.get("https://www.amazon.in");
		// to use get title()
		String actual_title = driver.getTitle();
		System.out.println(actual_title);
													
	String expected_title ="Amazon.in";
	 if (actual_title.equals(expected_title)) {
		 System.out.println("title is correct");
	 }
	 else {
		 System.out.println("title is incorrect");
	 }
	
//		String source =driver.getPageSource();
//		System.out.println(source);
	 
//     to close browser
	 
	 
	 
	 
	 
	 
	 
	 
	 
	}
}
