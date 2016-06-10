package week4.day2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import week4.day1.TestngAnnotations;

public class Create extends TestngAnnotations{
	
	@BeforeClass
	public void launchBrowser (){
		launchbrowser("chrome" , "http://demo1.opentaps.org/opentaps/control/main");
		System.out.println("Launch successful");
	}
	
	/*@BeforeMethod
	public void login(){
		System.out.println("Before Method - Login");
		
		
	}*/
	
	
	@Test(dataProvider = "createLead")
	public void createLead(String user, String pass, String comp, String first, String last) {
		enterTextById("username", user);
		enterTextById("password", pass);
		clickByClassName("decorativeSubmit");
		clickByLinkText("CRM/SFA");
		clickByLinkText("Leads");
		clickByLinkText("Create Lead");
		enterTextById("createLeadForm_companyName", comp);
		enterTextById("createLeadForm_firstName", first);
		enterTextById("createLeadForm_lastName", last);


		}	
	
	@DataProvider(name ="createLead")
	public Object [][] getdata(){
		
		Object [][] data = new Object[5][2];
		data[0][0] = "DemoSalesManager";
		data[0][1] = "crmsfa";
		
		data[1][0] = "DemoSalesManager";
		data[1][1] = "crmsfa";
		
		data[2][0] = "DemoSalesManager";
		data[2][1] = "crmsfa";
		
		data[3][0] = "DemoSalesManager";
		data[3][1] = "crmsfa";
		
		data[4][0] = "DemoSalesManager";
		data[4][1] = "crmsfa";
		
		return data;
	}
	@AfterClass
		public void close(){
		 closeBrowser();
	}
	
	}