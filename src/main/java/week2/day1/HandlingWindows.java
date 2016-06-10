package week2.day1;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.crystalcruises.com/");
		
		System.out.println(driver.getWindowHandle());
		
		String PrimaryWindow = driver.getWindowHandle();
		
		driver.findElementByLinkText("GUEST CHECK-IN").click();
		
		Thread.sleep(5000);
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		System.out.println(windowHandles.size());
		
		for (String wHandle : windowHandles) {
			driver.switchTo().window(wHandle);
			
		}
		
		System.out.println(driver.getWindowHandle());
		driver.findElementByLinkText("click here").click();
		
//		System.out.println(driver.getWindowHandle());
		
		Thread.sleep(5000);
		Set<String> windowHandles2 = driver.getWindowHandles();	
		
		for (String whand : windowHandles2) {
			driver.switchTo().window(whand);
		}
		System.out.println(driver.getWindowHandle());
		
		driver.findElementById("mainSearchTerm").clear();

		driver.findElementById("mainSearchTerm").sendKeys("Kader");
		
		driver.close();
		
//		Set<String> windHandles3 = driver.getWindowHandles();
		
//		for (String wh : windHandles3) {
//			driver.switchTo().window(wh);
//		}
		
		driver.switchTo().window(PrimaryWindow);
		
		System.out.println(driver.getWindowHandle());
		
		//driver.quit();
		
	}
}