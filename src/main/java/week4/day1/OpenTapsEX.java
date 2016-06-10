package week4.day1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class OpenTapsEX extends TestngAnnotations  {

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
	
	@Test
	public void createLead() {
		System.out.println("create Lead");
		clickByLinkText("Leads");
		clickByLinkText("Create Lead");
		}	
	@Test
	public void findLead(){
		System.out.println("findleads");
		clickByLinkText("Leads");
		clickByLinkText("Find Leads");	
	
	}	
	@Test(dependsOnMethods = {"createLead"})
	public void contacts(){
		System.out.println("contacts");
		clickByLinkText("Contacts");
		clickByLinkText("Create Contact");	
	}	
	@AfterMethod
	public void logout(){
		
		System.out.println("After Method - Logged Out");	
	}	
	@AfterClass
	public void closeBrowser(){
		closeBrowser();
	}	
	
}

