package week5.day2HW;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Hw2Resizable {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
		FirefoxDriver driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/resizable/");

		driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
		//WebElement resize = driver.findElementById("resizable");
		WebElement arrow = driver.findElement
		(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
		
		Actions builder = new Actions(driver);
		builder.clickAndHold(arrow).moveByOffset(200, 50).build().perform();
		

	}

}
