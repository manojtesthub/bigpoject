package week4.day1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class OpenTabsEx3 extends TestngAnnotations  {

	@BeforeClass(description = "Launching the browser")
	public void launchBrowser (){
		launchbrowser("firefox" , "http://demo1.opentaps.org/opentaps/control/main");
		System.out.println("Launch successful");
	}

	@BeforeMethod(description = "Login into the application")
	public void login(){
		System.out.println("Before Method - Login");
		enterTextById("username", "DemoSalesManager");
		enterTextById("password", "crmsfa");
		clickByClassName("decorativeSubmit");
		clickByLinkText("CRM/SFA");
	}
	
	//@Test
	@Test(invocationCount = 2, /*threadPoolSize = 2,*/ description = "createLead will run 2 times")
	public void createLead() {
		System.out.println("create Lead");
		clickByLinkText("Leads");
		clickByLinkText("Create Lead");
		}	
	@Test(enabled = false, description = "findLead test is ignored") //false will ignore this @Test
	//@Test
	public void findLead(){
		System.out.println("findleads");
		clickByLinkText("Leads");
		clickByLinkText("Find Leads");	
	
	}	
	//@Test(dependsOnMethods = {"createLead"})
	//@Test(expectedExceptions = {NoSuchElementException.class,WebDriverException.class})
	@Test(dependsOnMethods = {"createLead"},timeOut = 10000,
			description = "Contacts Module with timeout")//threadtimeoutException 
	public void contacts(){ //{throws Exception{
		System.out.println("contacts");
		clickByLinkText("Contacts");
		clickByLinkText("Create Contact");	
		//throw new NoSuchElementException("Element not found");

	}	
	@AfterMethod(description = "Loggin out of the Application")
	public void logout(){
		
		System.out.println("After Method - Logged Out");	
	}	
	
	@AfterClass(alwaysRun = true,description = "Closing the Browser Mandatory")
	public void closeBrows(){
		closeBrowser();
	}	
	
}

