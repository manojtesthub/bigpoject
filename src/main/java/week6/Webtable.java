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

public class Webtable {

	public static void main(String[] args) throws InterruptedException {

		//		FirefoxDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		// Navigate to the url
		driver.get("http://sdemo.suiteondemand.com/index.php?action=Login&module=Users");

		// Maximize the browser
		driver.manage().window().maximize();

		// Set default waiting time for finding an element (after the page loads)
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		

		driver.findElementById("user_name").clear();
		driver.findElementById("user_name").sendKeys("will");
		driver.findElementById("user_password").clear();
		driver.findElementById("user_password").sendKeys("will");
		driver.findElementById("bigbutton").click();

		// Table
		WebElement table = driver.findElementById("dashletPanel");

		System.out.println(table.findElements(By.tagName("tr")).size());

		WebElement firstRow = table.findElements(By.tagName("tr")).get(3);

		System.out.println(firstRow.findElements(By.tagName("td")).size());
		List<WebElement> columns = firstRow.findElements(By.tagName("td"));
		
		for (WebElement column : columns) {
			System.out.println(column.getText());
		}








	}

}
