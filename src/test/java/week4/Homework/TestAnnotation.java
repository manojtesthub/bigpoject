package week4.Homework;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestAnnotation extends WrapperNew{

	@BeforeSuite(groups = "sanity", dependsOnGroups = "smoke")
	public void BeforeSuite() {
		System.out.println(" Iam BeforeSuite - Initialiing Browser");
	}
	@BeforeTest(groups = "sanity", dependsOnGroups = "smoke")
	public void BeforeTest() {
		System.out.println(" Iam BeforeTest - Connecting DB");
	}
	@AfterTest(groups = "sanity",dependsOnGroups = "smoke")
	public void afterTest() {
		System.out.println(" Iam AfterTest - Closing DB");
	}
	
	@AfterSuite(groups = "sanity", dependsOnGroups = "smoke")
	public void afterSuite() {
		System.out.println(" Iam afterSuite - ShutDown Webdriver");

	}
	
	
}
