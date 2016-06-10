package week6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calendar {

	public static void main(String[] args) {

		// Step 1: Launch chrome
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		// Step 2: Maximize

		driver.manage().window().maximize();

		// Step 3: Set the Url

		driver.get("http://demo1.opentaps.org/opentaps/control/main");

		// Step 4: Set implicit wait

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// Step 5: Find the element of user name

		// Step 6: Enter user name

		driver.findElementById("username").sendKeys("DemoSalesManager");

		// Step 7: Find the element of password and enter

		driver.findElementById("password").sendKeys("crmsfa");

		// Step 8: Find the element of login button and click
		driver.findElementByClassName("decorativeSubmit").click();

		driver.findElementByLinkText("CRM/SFA").click();

		driver.findElementByLinkText("Create Lead").click();

		driver.findElementById("createLeadForm_birthDate-button").click();

		System.out.println(driver.findElementsByClassName("daysrow").size());




	}

}
