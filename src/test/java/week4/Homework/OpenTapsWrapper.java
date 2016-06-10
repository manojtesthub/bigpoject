package week4.Homework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class OpenTapsWrapper extends WrapperNew {
	
	
	@BeforeMethod(groups = {"sanity","smoke"})
//	@BeforeMethod(groups = "smoke")
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
	
	//@AfterMethod(groups = {"sanity"})
	@AfterMethod(groups = {"sanity"},dependsOnGroups = "smoke")
	public void afterMethod(){
		System.out.println("Im After Method");
	}
	
	@BeforeClass(groups = {"sanity","smoke"})
	//@BeforeClass(groups = "smoke")
	@Parameters("Browser")
	  public void launchBrowser(String Browser){
		  System.out.println("Launch Browser");
		//Initiating the driver class
		  launchBrowser(Browser,"http://demo1.opentaps.org/opentaps/control/main");
		 	  
	  }
	
	@AfterClass(groups = {"sanity"}, dependsOnGroups = "smoke")
	//@AfterClass(groups = "sanity")
	  public void cloBrowser(){
		 System.out.println("close Browser");
		 closeBrowser();
		
}
	
}
