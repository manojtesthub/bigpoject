package week6;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Erail {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://erail.in/");
		// Maximize the browser
		driver.manage().window().maximize();
		// Set default waiting time for finding an element (after the page loads)
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		

		//Choose the from station
		driver.findElement(By.id("txtStationFrom")).clear();

		driver.findElement(By.id("txtStationFrom")).sendKeys("MES");
		driver.findElement(By.id("txtStationFrom")).sendKeys(Keys.TAB);

		//Choose the To Station
		driver.findElement(By.id("txtStationTo")).clear();

		driver.findElement(By.id("txtStationTo")).sendKeys("CBE");
		driver.findElement(By.id("txtStationTo")).sendKeys(Keys.TAB);

		//driver.findElement(By.id("buttonFromTo")).click();
		
		//Thread.sleep(5000);
		
		// Table
		
		WebElement table = driver.findElement(By.xpath("//*[@class='DataTable TrainList']"));

		
		System.out.println(table.findElements(By.tagName("tr")).size());

		WebElement firstRow = table.findElements(By.tagName("tr")).get(5);

		System.out.println(firstRow.findElements(By.tagName("td")).size());
		List<WebElement> columns = firstRow.findElements(By.tagName("td"));
		
		for (WebElement column : columns) {
			System.out.println(column.getText());
		}








	}

}
