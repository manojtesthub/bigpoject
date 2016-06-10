package week4.Day1Class;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriverException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SwatiLifeCycle extends JavaJoseRules {
	
	@BeforeClass
	public void changeToStoreAttire() {
		System.out.println("Swati Changes to store attire");
	}
	
	@BeforeMethod
	public void takeAndBillOrder() {
		System.out.println("Swati take and bill the order");
	}
	
	
	//	@Test(enabled=true)
//	@Test(priority=1)
//	@Test(invocationCount=5,invocationTimeOut=5000)
//	@Test(timeOut=5000)
	@Test(expectedExceptions={NoSuchElementException.class, WebDriverException.class})
	public void cookAndServePizzas() throws Exception {
//		Thread.sleep(2000);
		System.out.println("Swati Cooks and Serves pizzas");
		throw new NoSuchElementException("No Pizzas");
	}

//	@Test(priority=2)
	@Test(dependsOnMethods={"cookAndServePizzas"}, description="cook and serve donuts")
	public void cookAndServeDoNuts() {
		System.out.println("Swati Cooks and Serves donuts");
	}
	
	@AfterMethod(alwaysRun=true)
	public void cleanTheTable() {
		System.out.println("Swati Clean the Table");

	}
	
	@AfterClass
	public void changeToHerAttire() {
		System.out.println("Swati Change to Her Attire");

	}

}

