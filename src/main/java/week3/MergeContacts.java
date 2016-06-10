package week3;

import org.junit.Test;

public class MergeContacts extends WrapperGroup {
		
	
	@Test
	public void mergeContacts() throws InterruptedException{
	launchbrowser("chrome", "http://demo1.opentaps.org/opentaps/control/main");
	enterTextById("username", "DemoSalesManager");
	enterTextById("password", "crmsfa");
	clickByClassName("decorativeSubmit");
	clickByLinkText("CRM/SFA");
	clickByLinkText("Contacts");
	clickByLinkText("Merge Contacts");
	Thread.sleep(5000);
	xpath("html/body/div[6]/div/div[2]/div[2]/div/form/table/tbody/tr[1]/td[2]/a/img");
	//clickByClassName("x-btn-text");
	prepareWindowHandles();
	switchToLastWindow();
	
	enterTextByName("firstName","Gopi kanyakumari");
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
	enterTextByName("lastName", "mouse");
	Thread.sleep(5000);
	clickByClassName("x-btn-text");
	Thread.sleep(3000);

	clickByClassName("linktext");
	
	Thread.sleep(5000);
	switchToParentWindow();

	//clickByLinkText("vostro");
	Thread.sleep(5000);

	clickByClassName("buttonDangerous");
	
	Thread.sleep(2000);
	manageAlertAccept();
	
	
	
	}
}