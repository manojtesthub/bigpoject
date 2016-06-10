
package week5.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DraggableRightClick {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		//driver.get("https://jqueryui.com/draggable/");

		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://jqueryui.com/draggable/");

		driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
		
		WebElement draggable = driver.findElementById("draggable");
		System.out.println(draggable.getLocation());
		
		Actions builder = new Actions(driver);
		builder.contextClick(draggable).sendKeys(Keys.DOWN).
		sendKeys(Keys.DOWN).
		sendKeys(Keys.DOWN).
		sendKeys(Keys.ENTER).build().perform();
		
	}

}

