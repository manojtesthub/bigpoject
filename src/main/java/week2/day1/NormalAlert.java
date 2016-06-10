package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class NormalAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		
		//iframe
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("/html/body/button").click();
		
		//Alert
		Thread.sleep(5000);
		Alert myalert = driver.switchTo().alert();
		//Thread.sleep(5000);
		System.out.println(myalert.getText());
		myalert.accept();
		
		System.out.println(driver.findElementByXPath("/html/body/p").getText());
		
		
		
		
		
		
		
		
		
		
				
	}

}
