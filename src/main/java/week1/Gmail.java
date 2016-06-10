package week1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://www.gmail.com");
		
		//Maximise the Browser
		//driver.manage().window().maximize();
		
		//Set the timeout
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//enter the username
		driver.findElementById("Email").sendKeys("manojkumar15th");
		
		driver.findElementById("next").click();

		//enter the password
		driver.findElementById("Passwd").sendKeys("2323423");
		
		driver.findElementById("signIn").click();

		
		driver.findElementByXPath("//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span").click();
		
		//Click Logout button
		driver.findElementByXPath("//*[@id='gb_71']").click();
		
		
		//Close the Browser
		driver.close();
		
	}

}
