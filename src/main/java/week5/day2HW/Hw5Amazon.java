package week5.day2HW;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Hw5Amazon {

	public static void main(String[] args) throws InterruptedException {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://www.amazon.in/");
		
		WebElement category = driver.findElement(By.xpath("//a[@id='nav-link-shopall']/span[2]"));
		WebElement books = driver.findElement(By.xpath("//div[@class='nav-template nav-flyout-content nav-tpl-itemList']/span[3]/span[1]"));
		WebElement Allbooks = driver.findElement(By.xpath("(//div[@class='nav-panel'])[4]/a[1]/span[1]"));
		
		Thread.sleep(5000);
		Actions builder = new Actions(driver);
		builder.moveToElement(category).moveToElement(books).
		moveToElement(Allbooks).pause(1000).click().build().perform();
		
		
		List <WebElement> genresDisp = 
		driver.findElements(By.xpath("(//ul[@class='fg-cell-container fg-cell-container-fluid-grid'])[2]/li//img"));
		System.out.println("Total Generes Displayed : " +genresDisp.size());
		
		WebElement clickfourthgenres = 
		driver.findElement(By.xpath("(//ul[@class='fg-cell-container fg-cell-container-fluid-grid'])[2]/li[4]//img"));

		Actions builder1 = new Actions(driver);
		builder1.click(clickfourthgenres).build().perform();
		
		Thread.sleep(3000);
		List <WebElement> totalcategories = 
		driver.findElements(By.xpath("//div[@class='s9OtherItems']/div"));
		//driver.findElements(By.xpath("//div[@id='ns_0E4NYN9HCDJC3HD9JJ6V_1289_r0ItemRow']//img"));
		System.out.println("Total Categories Displayed : " +totalcategories.size());
		
		WebElement ClickThirdcat = 
		driver.findElement(By.xpath("//div[@class='s9OtherItems']/div[3]//img"));
		
		Actions builder2 = new Actions(driver);
		builder2.click(ClickThirdcat).build().perform();
		
		List <WebElement> totalbooksDisp = 
		driver.findElements(By.xpath("//a[@class='a-link-normal s-access-detail-page  a-text-normal']"));
		System.out.println("Total no of Books : " +totalbooksDisp.size());
		
		

		//div[@class='s9OtherItems']/div
		/*WebElements genresDisp = driver.findElements(By.xpath("(//ul[@class='fg-cell-container fg-cell-container-fluid-grid'])[2]/li"));
		System.out.println("Displayed : " +genresDisp.size());*/
		
		
		

		
		
		

	}

}
