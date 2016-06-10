package week5.day2HW;


import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class njk {

	public static void main(String[] args) throws InterruptedException {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/draggable/");

		//System.out.println(driver.getWindowHandle());
		String primary = driver.getWindowHandle();
		System.out.println("Primary window : " +driver.getTitle());
		
		Thread.sleep(1000);
		WebElement draggabletext = driver.findElement(By.xpath("//h1[@class='entry-title']"));
		
		Actions builder = new Actions(driver);
		builder.contextClick(draggabletext).
		sendKeys(Keys.DOWN).pause(2000).
		sendKeys(Keys.DOWN).pause(2000).
		sendKeys(Keys.DOWN).pause(2000).
		sendKeys(Keys.DOWN).pause(2000).
		sendKeys(Keys.DOWN).pause(2000).
		sendKeys(Keys.DOWN).pause(2000).
		sendKeys(Keys.DOWN).pause(2000).
		sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();
		
		//Thread.sleep(5000);
		
		Thread.sleep(5000);
		Set <String> win = driver.getWindowHandles();
		System.out.println(win.size());
		
	
		
		for(String viewsource : win){
			driver.switchTo().window(viewsource);
			
		}
			System.out.println("ViewSource window : " +driver.getTitle());
			//System.out.println(driver.getWindowHandle());
			//driver.close() Closing all the window?
			
		Thread.sleep(3000);//Not switching back to primary window
		
		driver.switchTo().window(primary);
		System.out.println(driver.getTitle());
		//System.out.println(driver.getWindowHandle());

				
	}

}

