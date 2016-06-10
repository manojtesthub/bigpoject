package week4.Day1Class;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class JavaJoseRules {
	@BeforeSuite
	public void wakeupAndMakeup() {
		System.out.println(" wakesup and Makeup");
	}

	@BeforeTest
	public void openANdSignin() {
		System.out.println(" OPens and Punches in");

	}
	
	@AfterTest
	public void siginOutAndClose() {
		System.out.println(" punches out and closes");
	}
	
	@AfterSuite
	public void refreshAndSleep() {
		System.out.println(" Refersh and Sleep");

	}
}


