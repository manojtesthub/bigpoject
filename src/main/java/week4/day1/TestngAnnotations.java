package week4.day1;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import week3.WrapperGroup;

//import week3.WrapperGroup;



public class TestngAnnotations extends WrapperGroup  {
	@BeforeSuite
	public void BeforeSuite() {
		System.out.println(" Iam BeforeSuite - Initialiing Browser");
	}
	@BeforeTest
	public void BeforeTest() {
		System.out.println(" Iam BeforeTest - Connecting DB");
	}
	@AfterTest
	public void afterTest() {
		System.out.println(" Iam AfterTest - Closing DB");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println(" Iam afterSuite - ShutDown Webdriver");

	}
	
	
	
	
}