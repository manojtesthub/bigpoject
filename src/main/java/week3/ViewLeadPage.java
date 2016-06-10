package week3;

import org.junit.Test;

public class ViewLeadPage extends WrapperGroup {
	
	@Test
	public void CreateLead(){
		launchbrowser("firefox", "http://demo1.opentaps.org/opentaps/control/main");
		enterTextById("username", "DemoSalesManager");
		enterTextById("password", "crmsfa");
		clickByClassName("decorativeSubmit");
		clickByLinkText("CRM/SFA");
		clickByLinkText("Leads");
		clickByLinkText("Create Lead");
		enterTextById("createLeadForm_companyName", "Gopi Team");
		enterTextById("createLeadForm_firstName", "Gopi ");
		enterTextById("createLeadForm_lastName", "testleaf");
		selectDdByIndex("createLeadForm_dataSourceId", 2);
		selectDdByVisibleText("createLeadForm_marketingCampaignId", "Car and Driver");
		enterTextById("createLeadForm_primaryEmail", "gopiteam@testleaf.com");
		enterTextById("createLeadForm_primaryPhoneNumber", "1234567");
		clickByClassName("smallSubmit");
		getText("viewLead_companyName_sp");

		
	}
	
}
