package week4.Groups;

import org.openqa.selenium.WebDriverException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SwatiLifeCycle extends JavaJoesRules {
		
//	@Test(enabled=true)
//	@Test(priority=1)
//	@Test(invocationCount=5, invocationTimeOut=11000)
//	@Test(timeOut=5000)
//	@Test(expectedExceptions={NoSuchElementException.class, WebDriverException.class})
	
	@Test(groups="dinein")
	public void cookAndServePizzas(){// throws Exception {
//		Thread.sleep(4000);
		System.out.println("Swati Cooks and Serves pizzas");
	//	throw new WebDriverException("No Pizzas");
	}
	
//	@Test(priority=2)
	@Test(dependsOnMethods={"cookAndServePizzas"}, description="cook and serve donuts",groups="dinein")
	public void cookAndServeDoNuts() {
		System.out.println("Swati Cooks and Serves donuts");
	}
	
	@AfterMethod(groups="dinein")
//	(alwaysRun=true)
	public void cleanTheTable() {
		System.out.println("Swati Clean the Table");

	}
		
	@BeforeClass(groups="dinein")
	public void changeToStoreAttire() {
		System.out.println("Swati Changes to store attire");
	}

	@BeforeMethod(groups="dinein")
	@Parameters("discount")
	public void takeAndBillOrder(int disc) {
		System.out.println("Swati take and bill the order");
		System.out.println("TestLeaf discount "+ disc+"%");
	}
	

	@AfterClass(groups="dinein")
	public void changeToHerAttire() {
		System.out.println("Swati Change to Her Attire");

	}

}


