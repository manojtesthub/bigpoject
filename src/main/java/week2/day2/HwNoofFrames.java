package week2.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HwNoofFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://layout.jquery-dev.com/demos/iframes_many.html");

		List <WebElement> noofFrames = driver.findElementsByTagName("iframe");
		System.out.println(noofFrames.size());
		//nested frames
		
		for (WebElement iframe : noofFrames) {
			
			driver.switchTo().frame(iframe);

		//	List <WebElement> nested = driver.findElementsByTagName("iframe");
		//	System.out.println(nested.size());
			System.out.println(driver.findElementsByTagName("iframe").size());
			
			driver.switchTo().defaultContent();
			}
			
			}

			
			

			
			}

	


