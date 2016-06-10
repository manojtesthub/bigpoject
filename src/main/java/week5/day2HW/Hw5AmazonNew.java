package week5.day2HW;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Hw5AmazonNew {

	public static void main(String[] args) throws InterruptedException {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://www.amazon.in/");
		
		WebElement category = driver.findElement(By.xpath("//span[@class='nav-line-2']"));
		WebElement books = driver.findElement(By.xpath("//span[@aria-label='Books']"));
		WebElement Allbooks = driver.findElement(By.xpath("//span[contains(text(),'All Books')]"));
		
		//Thread.sleep(5000);
		Actions builder = new Actions(driver);
		builder.moveToElement(category).moveToElement(books).
		moveToElement(Allbooks).click().build().perform();
		
		
		List <WebElement> genresDisp = 
		driver.findElements(By.xpath("(//ul[@class='fg-cell-container fg-cell-container-fluid-grid'])[2]/li//img"));
		System.out.println("Total Generes Displayed : " +genresDisp.size());
		
		WebElement clickfourthgenres = 
		driver.findElement(By.xpath("(//ul[@class='fg-cell-container fg-cell-container-fluid-grid'])[2]/li[4]//img"));

		Actions builder1 = new Actions(driver);
		builder1.click(clickfourthgenres).build().perform();
		
		//Thread.sleep(3000);
		List <WebElement> totalcategories = 
		driver.findElements(By.xpath("//div[@class='s9OtherItems']/div//img"));
		
		System.out.println("Total Categories Displayed : " +totalcategories.size());
		
		WebElement ClickThirdcat = 
		//driver.findElement(By.xpath("//div[@class='s9OtherItems']/div[3]//img"));
		driver.findElement(By.xpath("(//div[@class='fg-cell-content-container'])[3]//img"));


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
