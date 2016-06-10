package week3;

import org.junit.Test;

public class FindContacts extends WrapperGroup{
		
	@Test
	public void FindcontactModule() throws InterruptedException{
	launchbrowser("chrome", "http://demo1.opentaps.org/opentaps/control/main");
	enterTextById("username", "DemoSalesManager");
	enterTextById("password", "crmsfa");
	clickByClassName("decorativeSubmit");
	clickByLinkText("CRM/SFA");
	clickByLinkText("Contacts");
	Thread.sleep(3000);
	clickByLinkText("Find Contacts");
	Thread.sleep(2000);

	enterTextByName("id", "10018");
	//enterTextByName("firstName", "Gopi");
	Thread.sleep(3000);
	xpath("html/body/div[6]/div/div[2]/div[2]/div/div/div/div/div/div[1]/div[2]/div[1]/div/div/div/div/div/div[2]/div/div/table/tbody/tr/td/table/tbody/tr/td[2]/em/button");
	//clickByClassName("x-btn-text");
	//clickByLinkText("10018");
	clickByClassName("linktext");
	verifyTexts("viewContact_fullName_sp", "Gopi Tea test  (10045)" );
	verifyTitle("View Contact | opentaps CRM");
	clickByClassName("subMenuButton");
	Thread.sleep(3000);
	selectDdByIndex("addMarketingCampaignForm_marketingCampaignId", 5);
	xpath("html/body/div[6]/div/div[2]/div[2]/div[2]/form/div/div[2]/table/tbody/tr[2]/td[2]/input");
	Thread.sleep(3000);
	xpath("html/body/div[6]/div/div[2]/div[2]/div[1]/div/form/div/div[2]/table/tbody/tr[8]/td[2]/input");

	verifyTexts("viewContact_marketingCampaigns_sp", "eCommerce Site Internal Campaign");
	}
}
