package week3;

import org.junit.Test;

public class FindLead extends WrapperGroup{
	
	@Test
	public void Find() throws InterruptedException{
		
		launchbrowser("chrome", "http://demo1.opentaps.org/opentaps/control/main");
		enterTextById("username", "DemoSalesManager");
		enterTextById("password", "crmsfa");
		clickByClassName("decorativeSubmit");
		clickByLinkText("CRM/SFA");
		clickByLinkText("Leads");
		clickByLinkText("Find Leads");
		enterTextById("createLeadForm_companyName", "android marshmallow");
		verifyTitle("View Lead | opentaps CRM");
		clickByClassName("subMenuButton");
		selectDdByVisibleText("addDataSourceForm_dataSourceId", "Partner");
		clickByName("submitButton");
		selectDdByIndex("addMarketingCampaignForm_marketingCampaignId", 5);
		clickByName("//*[@id='ext-gen620']");
		
		clickByName("submitButton");
		
		/*try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	//	Thread.sleep(5000);

	//	enterTextByName("firstName", "manoj");
		
		//xpathvalue("//*[@id='ext-gen248']", "manoj");
	//  xpathvalue("//label[contains(text(),'First name:')])[3]/following::input[1]", "manoj");

}
}
