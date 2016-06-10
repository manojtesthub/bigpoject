package week3;

import org.junit.Test;

public class Merge extends WrapperGroup {

	@Test
	public void merg() throws InterruptedException{
	launchbrowser("chrome", "http://demo1.opentaps.org/opentaps/control/main");
	enterTextById("username", "DemoSalesManager");
	enterTextById("password", "crmsfa");
	clickByClassName("decorativeSubmit");
	clickByLinkText("CRM/SFA");
	clickByLinkText("Leads");
	clickByLinkText("Merge Leads");
	Thread.sleep(5000);
	xpath("html/body/div[6]/div/div[2]/div[2]/div/form/table/tbody/tr[1]/td[2]/a/img");
	//clickByClassName("x-btn-text");
	prepareWindowHandles();
	switchToLastWindow();
	
	enterTextByName("firstName","GPRS");
	Thread.sleep(5000);
	clickByClassName("x-btn-text");
	Thread.sleep(3000);
	clickByClassName("linktext");
	
	
	Thread.sleep(5000);
	switchToParentWindow();
	Thread.sleep(5000);

	xpath("html/body/div[6]/div/div[2]/div[2]/div/form/table/tbody/tr[2]/td[2]/a/img");
	//xpath("//img[@src='/images/fieldlookup.gif'])[2]");
	
	prepareWindowHandles();
	switchToLastWindow();
	enterTextByName("lastName", "tech");
	Thread.sleep(5000);
	clickByClassName("x-btn-text");
	Thread.sleep(3000);

	clickByClassName("linktext");
	Thread.sleep(5000);
	switchToParentWindow();


	clickByClassName("buttonDangerous");
	Thread.sleep(2000);
	manageAlertAccept();
	
	
	
	
	}
}
