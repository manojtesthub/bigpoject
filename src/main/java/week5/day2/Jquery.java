package week5.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Jquery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();*/
		
		FirefoxDriver driver = new FirefoxDriver();
		
		//driver.get("https://jqueryui.com/droppable/");
		driver.get("https://jqueryui.com/sortable/");

		driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//code for droppable
		WebElement src =driver.findElementById("draggable");
		WebElement trg =driver.findElementById("droppable");
		
		Actions builder = new Actions(driver);
		builder.dragAndDrop(src, trg).build().perform();
		
		
				

		
		
		
		
		
		
		

	}

}
