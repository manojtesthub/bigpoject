package week3;

import org.junit.Test;

public class Phone extends WrapperGroup {

	@Test
	public void ph(){
	launchbrowser("chrome", "http://demo1.opentaps.org/opentaps/control/main");
	enterTextById("username", "DemoSalesManager");
	enterTextById("password", "crmsfa");
	clickByClassName("decorativeSubmit");
	clickByLinkText("CRM/SFA");
	clickByLinkText("Leads");
	clickByLinkText("Find Leads");
	enterTextByName("phoneNumber", "1234567");
	clickByClassName("linktext");
	clickByClassName("subMenuButtonDangerous");
	clickByLinkText("Find Leads");
	enterTextByName("id", "10036");
	clickByClassName("x-btn-text");

//10029)
	
}
}
