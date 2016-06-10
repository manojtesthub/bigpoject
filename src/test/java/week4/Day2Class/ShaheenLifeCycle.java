package week4.Day2Class;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ShaheenLifeCycle extends K2BRules{
		
		@Test(groups = "dinein")
		public void serveBriyani(){
			System.out.println("Shaheen serves Biriyani");
		}
	
		@Test(groups = {"die"})
		public void serveHalwa() {
			System.out.println("Shaheen serves halwa");
		}
		
		@AfterMethod
		public void cleanTheTable() {
			System.out.println("Shaheen Cleans the Table");
		}
		
		@BeforeClass
		public void changeToStoreAttire() {
			System.out.println("Shaheen Changes to store attire");
			System.out.println("Shaheen cooks Biriyani and Halwa");
		}
		
		@BeforeMethod
		@Parameters({"discount","Newdiscount"})
		public void takeAndBillOrder(int disc, int newdisc){
			System.out.println("Shaheen take and bill the order");
			System.out.println("TestLeaf Discount:" +(disc+newdisc)+ "%");
			
			
		}
		
		@AfterClass
		public void changeToHerAttire() {
			System.out.println("Shaheen Change to Her Attire");

		}
		
}
