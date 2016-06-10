package week1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenTapsWebdriver {

	public static void main(String[] args) {
		
		//open firefox browser
		//syntax for calling another class
		//classname reference = new classname();
		FirefoxDriver driver = new FirefoxDriver();
		
		//Load the URL
		//syntax to call the method
		//reference.methodname();
		driver.get("http://demo1.opentaps.org/opentaps/control/main");
		
		//Maximise the Browser
		driver.manage().window().maximize();
		
		//Set the timeout
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//enter the username
		driver.findElementById("username").sendKeys("DemoSalesManager");
		
		//enter the password
		driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		
		// Click Login Button
		driver.findElementByClassName("decorativeSubmit").click();
		
		//Click Logout button
		driver.findElementByXPath("//*[@id='logout']/input").click();
		
		
		//Close the Browser
		driver.close();
		
	}

}
