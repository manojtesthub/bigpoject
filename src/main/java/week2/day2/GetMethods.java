package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://google.co.in");
	//	driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement gmail = driver.findElementByLinkText("Gmail");
			
		// Get the location
		System.out.println(gmail.getLocation());
		
		// Get the link name
		System.out.println(gmail.getText());
		
		// Get the size 
		System.out.println(gmail.getSize());

		// Get the attribute
		System.out.println(gmail.getAttribute("href"));

		// Get the CSS
		System.out.println(gmail.getCssValue("font-family"));

		// Get the tag Name
		System.out.println(gmail.getTagName());

		//Get the Current URL
		System.out.println(driver.getCurrentUrl());

		
	}

}
