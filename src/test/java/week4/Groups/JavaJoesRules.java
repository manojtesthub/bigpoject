package week4.Groups;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import week4.Day2Class.KarimRules;

public class JavaJoesRules extends KarimRules {
	
	@BeforeTest(groups={"dinein","delivery"})
	public void openANdSignin() {
		System.out.println(" OPens and Punches in");

	}
	
	@AfterTest(groups={"dinein","delivery"})
	public void siginOutAndClose() {
		System.out.println(" punches out and closes");
	}
	
}

