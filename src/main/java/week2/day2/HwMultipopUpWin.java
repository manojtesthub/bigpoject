package week2.day2;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*Go to popuptest.com and click on Multi-PopUp Test #2 
 * and close all the windows opened except the parent and then print the title of the parent window.
 */
public class HwMultipopUpWin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//FirefoxDriver driver = new FirefoxDriver();
		
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("chrome://settings/contentExceptions#popups");
		driver.switchTo().frame("settings");
		driver.findElementByXPath("//*[@id='content-settings-exceptions-area']/div[2]/div[6]/list/div[2]/div/div/input").sendKeys("http://popuptest.com/popuptest12.html");
		driver.findElementById("content-settings-exceptions-overlay-confirm").click();
		
		
		driver.get("http://popuptest.com/");
		
		//System.out.println(driver.getWindowHandle());
		//String PrimaryWindow = driver.getWindowHandle();
		driver.findElementByLinkText("Multi-PopUp Test #2").click();
		System.out.println(driver.getWindowHandle());
		String PrimaryWindow = driver.getWindowHandle();

		//Primary window 
		Thread.sleep(3000);
	/*	Set <String> popuptestpage = driver.getWindowHandles();
		System.out.println(popuptestpage.size());

		for (String win : popuptestpage) {
			driver.switchTo().window(win);
			
		}
		System.out.println(driver.getWindowHandle());
*/		//driver.close();
		//pop window 1
		Set <String> pop1 = driver.getWindowHandles();
		System.out.println(pop1.size());
		
		for (String win1 : pop1) {
			driver.switchTo().window(win1);
			
		}
		System.out.println(driver.getWindowHandle());
		driver.close();
		//pop window 2
		Set <String> pop2 = driver.getWindowHandles();
		for (String win2 : pop2) {
			driver.switchTo().window(win2);
			
		}
		System.out.println(driver.getWindowHandle());
		driver.close();
		
		//pop window 3
				Set <String> pop3 = driver.getWindowHandles();
				for (String win3 : pop3) {
					driver.switchTo().window(win3);
					
				}
				System.out.println(driver.getWindowHandle());
				driver.close();
		
		
		driver.switchTo().window(PrimaryWindow);
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getWindowHandle());
		
		

	}

}
