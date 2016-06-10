package week4.day1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class OpenTaps extends TestngAnnotations  {

	@BeforeClass
	public void launchBrowser (){
		launchbrowser("firefox" , "http://demo1.opentaps.org/opentaps/control/main");
	
	}

	@BeforeMethod
	public void login(){
		enterTextById("username", "DemoSalesManager");
		enterTextById("password", "crmsfa");
		clickByClassName("decorativeSubmit");
		clickByLinkText("CRM/SFA");
	}
	
	@Test
	public void createLead() {
		clickByLinkText("Leads");
		clickByLinkText("Create Lead");
		}	
	@Test
	public void findLead(){
		clickByLinkText("Leads");
		clickByLinkText("Find Leads");	
	
	}	
	@Test
	public void contacts(){
		clickByLinkText("Contacts");
		clickByLinkText("Create Contact");	
	}	
	@AfterMethod
	public void logout(){
		
		System.out.println("Logged Out");	
	}	
	@AfterClass
	public void closeBrowser(){
		closeBrowser();
	}	
	
}

