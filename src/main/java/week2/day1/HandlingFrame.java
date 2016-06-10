package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://jqueryui.com/draggable/");
		
		driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
		System.out.println(driver.findElementById("draggable").getText());
		
		driver.switchTo().defaultContent();
		System.out.println(driver.findElementByClassName("entry-title").getText());
		driver.close();
	}

}
