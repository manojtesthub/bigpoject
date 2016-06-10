package week4.Groups;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PrashanthLifeCycle extends JavaJoesRules {
		
	@Test(groups="delivery" , dependsOnGroups="dinein")
	public void driverAndDeliver() {
		System.out.println("Prashanth deliver the pizzas");
	}

	@AfterMethod(groups="delivery")
	public void returnToStore() {
		System.out.println("Prashanth is Back to Store");

	}
	
	@BeforeClass(groups="delivery")
	public void changeToDeliveryAttire() {
		System.out.println("Prashanth Changes to delivery attire");
	}

	@BeforeMethod(groups="delivery")
	public void collectOrder() {
		System.out.println("Prashanth Collects the orders for delivery");
	}
	
	@AfterClass(groups="delivery")
	public void changeToHisAttire() {
		System.out.println("Prashanth Change to His Attire");

	}

	
}


