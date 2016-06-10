package week5.day2HW;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Hw1Sortable {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				//ChromeDriver driver = new ChromeDriver();
				FirefoxDriver driver = new FirefoxDriver();

				driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
				driver.manage().window().maximize();
				driver.get("https://jqueryui.com/sortable/");

				driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
				WebElement item1 = driver.findElement(By.xpath("//ul[@id ='sortable']/li[1]"));

				WebElement item6 = driver.findElement(By.xpath("//ul[@id ='sortable']/li[6]"));
				System.out.println(item6.getLocation());

				Actions builder = new Actions(driver);
				builder.dragAndDropBy(item1, 11, 179).
				dragAndDrop(item1, item6).
				build().perform();
				
				
				
	}

}
