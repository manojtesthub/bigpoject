package week4.Homework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class CreateLeadEX extends TestAnnotation{
	public String firstname=null;
	//EditLead editLead=new EditLead();
	
	//@Test
	//public void createLead() throws InterruptedException{
		
		//Initiating the driver class
    	@BeforeClass(groups = "smoke")
    	@Parameters("browser")
    	public void launchbrowser(String browser){
		launchBrowser(browser,"http://demo1.opentaps.org/opentaps/control/main");
    	}
    	
    	@BeforeMethod(groups = "smoke")
    	public void login() throws InterruptedException{
		enterTextById("username","DemoSalesManager");
    	enterTextById("password","crmsfa");
    	clickByClassName("decorativeSubmit");
    	clickByExpath(".//*[@id='label']/a");
    	Thread.sleep(800);
    	//click on create lead and give the details
    	clickByLinkText("Create Lead");
    	//companyname and first name and last name
    	}
    	
    	@DataProvider(name = "fillform")
    	public static Object [][] getDatato(){
    		Object[][] data = new Object[2][3];

    		data[0][0] = "Company";
    		data[0][1] = "myfirst";
    		data[0][2] = "mylast";
    		
    		return data;
    		
    	}
    	
    	@Test(dataProvider = "fillform",groups = "smoke")
    	public void fillform( String compname,String first, String last) {
    	enterTextById("createLeadForm_companyName", compname);
    	enterTextById("createLeadForm_firstName", first);
    	enterTextById("createLeadForm_lastName", last);
    	 	//selectig source
    	dropDownwithIndex("createLeadForm_dataSourceId", 2);
    	//selecting marketing campaign
    	dropDownwithIndex("createLeadForm_marketingCampaignId", 2);
    	///email address and phone number
    	enterTextById("createLeadForm_primaryEmail", "oasias@aol.com");
    	enterTextById("createLeadForm_primaryPhoneNumber", "123");
    	//click on submit button
    	clickByName("submitButton");
    	
    	
    	}
    	
    	@AfterMethod(groups = "smoke" )
    	public void rcompID() throws InterruptedException {
    		//Thread.sleep(4000);
    		String company=printElementbyId("viewLead_companyName_sp");
        	String str=new String(company);
        	String answer = str.substring(str.indexOf("(")+1,str.indexOf(")"));
        	System.out.println("The lead id is "+answer);
    	}
    	
    	@AfterClass(groups = "smoke")
    	public void closebrowser(){
    	closeBrowser();
    	}
    	
  
	}


