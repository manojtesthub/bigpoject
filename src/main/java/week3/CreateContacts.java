package week3;

import org.junit.Test;

public class CreateContacts extends WrapperGroup{
	
	@Test
	public void contactModule() throws InterruptedException{
	launchbrowser("chrome", "http://demo1.opentaps.org/opentaps/control/main");
	enterTextById("username", "DemoSalesManager");
	enterTextById("password", "crmsfa");
	clickByClassName("decorativeSubmit");
	clickByLinkText("CRM/SFA");
	clickByLinkText("Contacts");
	Thread.sleep(3000);
	clickByLinkText("Create Contact");
	enterTextById("firstNameField", "Gopi Tea");
	enterTextById("lastNameField", "test ");
	enterTextById("createContactForm_primaryPhoneNumber", "09876");
	enterTextById("createContactForm_primaryEmail", "testo@yahoo.com");
	selectDdByVisibleText("createContactForm_generalCountryGeoId", "India");
	Thread.sleep(3000);
	selectDdByVisibleText("createContactForm_generalStateProvinceGeoId","PONDICHERRY");

	clickByName("submitButton");
	getText("viewContact_fullName_sp");
//	verifyTexts("testotest test (10070)");

}
}