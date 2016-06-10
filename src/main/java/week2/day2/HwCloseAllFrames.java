package week2.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HwCloseAllFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://layout.jquery-dev.com/demos/iframe_local.html");
		List <WebElement> noofFrames = driver.findElementsByTagName("iframe");
		System.out.println(noofFrames.size());
		driver.findElementByXPath("/html/body/div[1]/p[1]/button").click();
		driver.findElementByXPath("/html/body/div[2]/p/button").click();

		driver.switchTo().frame("childIframe");
		driver.findElementByXPath("/html/body/div[2]/p/button").click();
		driver.findElementByXPath("/html/body/div[3]/p/button").click();


		
		
		
		
	}

}
