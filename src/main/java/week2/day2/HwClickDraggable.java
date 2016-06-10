package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class HwClickDraggable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://jqueryui.com/");
		
		driver.findElementByLinkText("Draggable").click();
		driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
		System.out.println(driver.findElementById("draggable").getText());
		
		driver.switchTo().defaultContent();
		driver.findElementByLinkText("Droppable").click();

		
	}

}
