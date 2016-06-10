package week1.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.base.Verify;

public class HwCreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://demo1.opentaps.org/opentaps/control/main");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("Cherry Technologies");
		driver.findElementById("createLeadForm_firstName").sendKeys("Manoj");
		driver.findElementById("createLeadForm_lastName").sendKeys("kr");
		driver.findElementByName("submitButton").click();
		WebElement Text=driver.findElementById("viewLead_companyName_sp");
		System.out.println(Text.getText());
	}

}
