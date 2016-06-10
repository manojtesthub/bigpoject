package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframePromptAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver","C:\\Selenium\\April\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("/html/body/button").click();
		
		Thread.sleep(5000);
		Alert alert = driver.switchTo().alert();
		//Thread.sleep(3000);
		System.out.println(alert.getText());
		alert.sendKeys("Manoj");
		alert.accept();
		
	    System.out.println(driver.findElementById("demo").getText());
	//	String str = driver.findElementById("demo").getText();

	//	assertEquals("Hello Manoj! How are you today?" , str);
		
		//driver.switchTo().defaultContent();
		driver.quit();
	}
}
		
		

	

//}
