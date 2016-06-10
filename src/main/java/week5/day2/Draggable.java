package week5.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draggable {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://jqueryui.com/draggable/");

		driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
		
		WebElement draggable = driver.findElementById("draggable");
		System.out.println(draggable.getLocation());
		
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(draggable, 200, 100)
		.build().perform();
		System.out.println(draggable.getLocation());

		
		

	}

}