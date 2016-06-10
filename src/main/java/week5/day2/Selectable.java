package week5.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable {

	public static void main(String[] args) {

		//System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
		FirefoxDriver driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/selectable/");

		driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
		
		WebElement list1 = driver.findElement(By.xpath("//ol[@id='selectable']/li[1]"));
		WebElement list4 = driver.findElement(By.xpath("//ol[@id='selectable']/li[4]"));
		
		Actions builder = new Actions(driver);
		builder.click(list1).
		sendKeys(Keys.CONTROL).pause(2000).
		
		click(list4).//pause(3000).
		release().build().perform();
		//Actions
	}

}
