package week4.Day2Class;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class KarimRules {
	@BeforeSuite(groups = {"dinein,delivery"})
	public void wakeupAndMakeup() {
		System.out.println(" wakesup and Makeup");
	}


	@AfterSuite(groups = {"dinein,delivery"})
	public void refreshAndSleep() {
		System.out.println(" Refersh and Sleep");
	}
	
}