package week4.day1;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriverException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class OpenTapsEX4 extends TestngAnnotations  {

	@BeforeClass
	public void launchBrowser (){
		launchbrowser("firefox" , "http://demo1.opentaps.org/opentaps/control/main");
		System.out.println("Launch successful");
	}

	@BeforeMethod
	public void login(){
		System.out.println("Before Method - Login");
		enterTextById("username", "DemoSalesManager");
		enterTextById("password", "crmsfa");
		clickByClassName("decorativeSubmit");
		clickByLinkText("CRM/SFA");
	}
	
	@Test(enabled = false)//(invocationCount = 2)
	public void createLead() {
		System.out.println("create Lead");
		clickByLinkText("Leads");
		//clickByLinkText("Create Lead");
		}	
	@Test(enabled = false)
	public void findLead(){
		System.out.println("findleads");
		clickByLinkText("Leads");
		clickByLinkText("Find Leads");	
	
	}	
//	@Test(dependsOnMethods = {"createLead"},timeOut = 10000) //threadtimeoutException 
//	@Test(dependsOnMethods = {"createLead"},timeOut = 5000, expectedExceptions = {NoSuchElementException.class,WebDriverException.class})
	@Test(timeOut=8000)
	public void contacts(){ //throws InterruptedException {//throws Exception{
		System.out.println("contacts");
		//Thread.sleep(5000);
		clickByLinkText("Contacts");
		clickByLinkText("Create Contact");	
		//throw new NoSuchElementException("Fail to Load ithin timeout");
	}
	@AfterMethod
	public void logout(){
		
		System.out.println("After Method - Logged Out");	
	}	
	@AfterClass(alwaysRun = true)
	public void closeBrowser(){

		closeBrowser();
		
		System.out.println("Browser Closed");

	}	
	
}

