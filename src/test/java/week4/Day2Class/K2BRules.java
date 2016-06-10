package week4.Day2Class;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class K2BRules extends KarimRules{
		
	@BeforeTest(groups = {"dinein,delivery"})
	public void openANdSignin() {
		System.out.println(" OPens and Punches in");

	}
	
	@AfterTest(groups = {"dinein,delivery"})
	public void siginOutAndClose() {
		System.out.println(" punches out and closes");
	}
}
