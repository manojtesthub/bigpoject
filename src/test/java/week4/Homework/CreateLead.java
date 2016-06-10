package week4.Homework;

import org.testng.annotations.DataProvider;import org.testng.annotations.Test;


public class CreateLead extends OpenTapsWrapper{
	public String firstname=null;
	//EditLead editLead=new EditLead();
	
	//@Test
	//public void createLead() throws InterruptedException{
		
		//Initiating the driver class
      	
	//@Test(dataProvider = "fillform",dataProviderClass = OpenTapsWrapper.class,groups = "smoke")
	@Test(dataProvider = "fillform",groups = "smoke")

	public void fillform(String first, String last) throws InterruptedException {
	enterTextById("createLeadForm_companyName", "comp");
	enterTextById("createLeadForm_firstName", first);
	enterTextById("createLeadForm_lastName", last);
	 	//selectig source
	dropDownwithIndex("createLeadForm_dataSourceId", 2);
	//selecting marketing campaign
	dropDownwithIndex("createLeadForm_marketingCampaignId", 2);
	///email address and phone number
	enterTextById("createLeadForm_primaryEmail", "oasias@aol.com");
	enterTextById("createLeadForm_primaryPhoneNumber", "123");
	//click on submit button
	clickByName("submitButton");
	
		Thread.sleep(4000);
		String company=printElementbyId("viewLead_companyName_sp");
    	String str=new String(company);
    	String answer = str.substring(str.indexOf("(")+1,str.indexOf(")"));
    	System.out.println("The lead id is "+answer);
	}
	@DataProvider(name = "fillform")
	public static Object [][] getDatato(){
		Object[][] data = new Object[1][2];

		data[0][0] = "myfirst";
		data[0][1] = "mylast";
		//data[0][2] = "mylast";
		
		return data;
    	
    		
    	}
    	
}	
    	
    	
    	
    	
  
	


