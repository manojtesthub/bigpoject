package week4.Day2Class;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IrfanLifeCycle extends K2BRules {
		
	@Test(groups = "delivery")
	public void driverAndDeliver() {
		System.out.println("Irfan deliver the Biriyani");
	}
	
	@Test(dataProvider = "partyOrders", groups = "den" , dependsOnGroups = "die")
	public void partyOrders(String name, int qty){
		System.out.println("Deliver the party order for" +name+ "and the quantity" +qty+ "kgs");
	}	
	
	@AfterMethod
	public void returnToStore() {
		System.out.println("Irfan is Back to Store");

	}
	
	@BeforeClass
	public void changeToDeliveryAttire() {
		System.out.println("Irfan Changes to delivery attire");
	}
	
	@BeforeMethod
	public void collectOrder() {
		System.out.println("Irfan Collsects the orders for delivery");
	}
	
	@AfterClass
	public void changeToHisAttire() {
		System.out.println("Irfan Change to His Attire");

	}
	
	@DataProvider(name = "partyOrders")
	public Object[][] getPartyData(){
		
		Object[][] data = new Object[4][2];
		data[0][0] = "Sakthy";
		data[0][1] = 200;
		
		data[1][0] = "Karim";
		data[1][1] = 100;
		
		data[2][0] = "Kader";
		data[2][1] = 20;
		
		data[3][0] = "SSP";
		data[3][1] = 10;
		
		return data;
		
		
	}
	
	
}
