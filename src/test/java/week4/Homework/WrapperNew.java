package week4.Homework;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class  WrapperNew{
	
	RemoteWebDriver driver;
	int counter=1;
	String parentWindow=null;
	Set<String> windowHandlesList=null;
	Alert alertobj=null;
	String alertText=null;
	boolean alertTextResult=false;
	boolean manageAlertResult=false;
	 String alert=null;
	 Select select =null;
	 List<WebElement> commercial=null;
	
	 
	
	 public void launchBrowser(String drivers,String url){
			try{
			if(drivers.equalsIgnoreCase("FirefoxDriver")){
				driver=new  FirefoxDriver();}
			else if(drivers.equalsIgnoreCase("ChromeDriver")){
				System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				driver = new ChromeDriver();
				}
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			//Loading the opentabs
			driver.get(url);
			
			}
			catch(WebDriverException e){
				System.out.println("The driver does not below to neither firefox nor chrome");
			}
			finally{
				screenShot();
			}
				
				
			}
		
		public void screenShot(){
			File screenshot=driver.getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(screenshot, new File("./images/snap"+ counter +".jpeg"));
				counter++;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
					
			
			
		}
		/***********************************************************************
		 * The below ones are for the locators
		 * @param obj
		 * @param val
		 ********************************************************************/
		
			public void enterTextById(String obj, String val){
				try {
					driver.findElementById(obj).clear();
					driver.findElementById(obj).sendKeys(val);
				} catch (NoSuchElementException e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
					System.out.println("WebElement is not found");
				}
			}
			
			public void enterTextByName(String obj, String val){
				try {
					//driver.findElementById(obj).clear();
					driver.findElementByName(obj).sendKeys(val);
				} catch (NoSuchElementException e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
					System.out.println("WebElement is not found");
				}
			}
			public void enterElementByClass(String obj, String val){
				try {
					
					driver.findElementByClassName(obj).sendKeys(val);
				} catch (NoSuchElementException e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
					System.out.println("WebElement is not found");
				}
			}
			
			public void enterElementByxpath(String obj, String val){
				try {
						driver.findElementByXPath(obj).sendKeys(val);
				} catch (NoSuchElementException e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
					System.out.println("WebElement is not found");
				}
			}
			
			/***************************************************************************/
			
			public void clickByClassName(String obj){
				try {
					driver.findElementByClassName(obj).click();
				} catch (NoSuchElementException e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
					System.out.println("WebElement is not found");
				}

			}
			
			
			public void clickByTagname(String obj){
				try {
					driver.findElementByTagName(obj).click();
				} catch (NoSuchElementException e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
					System.out.println("WebElement is not found");
				}
			}
			
			public void clickByName(String obj){
				try {
					driver.findElementByName(obj).click();
				} catch (NoSuchElementException e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
					System.out.println("WebElement is not found");
				}
			}
			
			public void clickByLinkText(String obj){
				try {
					driver.findElementByLinkText(obj).click();
				} catch (NoSuchElementException e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
					System.out.println("WebElement is not found");
				}
			}
				
				
				
				public void clickByLinkXpath(String obj){
					try {
						driver.findElementByXPath(obj).click();
					} catch (NoSuchElementException e) {
						// TODO Auto-generated catch block
						//e.printStackTrace();
						System.out.println("WebElement is not found");
					}

			}
				public void clickByExpath(String xpath){
					try{
					
						driver.findElementByXPath(xpath).click();
					}
					catch(NoSuchElementException ex){
						System.out.println("There is not such xpath as " +xpath + ex);
						
					}
				}
				
				
				public String findElementbyClassName(String obj){
					String value=null;
					try {
						value=driver.findElementByClassName(obj).getText();
					} catch (NoSuchElementException e) {
						// TODO Auto-generated catch block
						//e.printStackTrace();
						System.out.println("WebElement is not found");
					}
					return value;

					
					
				}
				public void verifyText(String expectedSourceText, String  actualSourceText){
				    if (expectedSourceText.equals(actualSourceText)) {
				        System.out.println("Both are Same");
				    }else {
				        System.out.println("Both are Different   "+"before  value "+ expectedSourceText +"after  value   "+ actualSourceText);
				    }
				}
				   
			
			
			/************************************************************88
			 * These methods are for drop down
			 * @param obj
			 *******************************************************/

			public void dropDownwithId(String id,String value){
				try{
			
			Select select =new Select(driver.findElementById(id));
			select.selectByValue(value);
				}
				catch(Exception ex){
					
					
					System.out.println("There is issue selecting the dropdown by value");
				}
				finally{
					screenShot();
				}
			
			}
			
			
			public void dropDownwithName(String  id,String visibleText){
				try{
			
			Select select =new Select(driver.findElementById(id));
			select.selectByVisibleText(visibleText);
				}
				catch(Exception ex){
					
					
					System.out.println("There is issue selecting the dropdown by visible text");
				}
				finally{
					screenShot();
				}
			
			}
			
			
			
			public void dropDownwithIndex(String name,int index){
				try{
			
			Select select =new Select(driver.findElementById(name));
			select.selectByIndex(index);
			
				}
				catch(Exception ex){
					
					
					System.out.println("There is issue selecting the dropdown by index");
				}
				finally{
					screenShot();
				}
			
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			public void logout(String obj){
				try {
					driver.findElementByXPath(obj).click();
				} catch (NoSuchElementException e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
					System.out.println("Logout : WebElement is not found");
				}
			}
			
			
			
			
			public void verifyTitle(String actualTitle){
							
				try {
					if(driver.getTitle().contains(actualTitle)){
					System.out.println("The title is correct: " +driver.getTitle());
					}else {
						System.out.println("Title not Match");
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
					System.out.println("Problem in getting title");
				}
			}		
			public void currentUrl(){
				try {
					System.out.println(driver.getCurrentUrl());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
					System.out.println("Current url exception caught");
				}
				
			}
		
			public void closeBrowser(){	
				driver.close();
			}
		
	/**************************************************************************************
	 * Method Name:prepareWindowHandles
	 * Description: This gets all the windows handles in a Set
	 * returns: Set
	 * ***********************************************************************************/
		
	public Set prepareWindowHandles()
	{
		int size=0;
		try{
			//get all  the windowshandles in a list
			parentWindow= getParentWindowHandle();
			windowHandlesList=driver.getWindowHandles();
			//checking whther the set is empty
			if(windowHandlesList.size()==0){
				System.out.println("Window handles set is empty set");
			}
			else{
				size=windowHandlesList.size();
				System.out.println("The window Handles set is not empty and the size is "+ size);
				
			}
			}
		catch(Exception ex){
			//printing the window handle size
			System.out.println("The window Handles set is empty and the size is "+ size);
			
		}
	    return windowHandlesList;
		
	}
	
	
	/**************************************************************************************
	 * Method Name:getParentWindowHandle
	 * Description: This gets the parent window handle
	 * returns: String
	 * ***********************************************************************************/
	
	
	public String getParentWindowHandle()
	{
		try{
			//get all  the parent window id
			parentWindow=driver.getWindowHandle();
			//checking whther the parent id  is empty
			if(parentWindow.isEmpty()){
				System.out.println("There is not parent window id");
			}
			}
		catch(Exception ex){
			//printing the window handle size
			System.out.println("The parent window id is not fetched "+ ex);
			
		}
	    return parentWindow;
		
	}
	
	/**************************************************************************************
	 * Method Name:switchToParentWindow
	 * Description: This switches to  parent window handle
	 * returns: RemoteWebDriver
	 * ***********************************************************************************/	
	
	
	public RemoteWebDriver switchToParentWindow()
	{
		try{
			//switching to parent window
			driver=(RemoteWebDriver) driver.switchTo().window(parentWindow);
						
			}
		catch(Exception ex){
			
			System.out.println("Error switching to remote webdriver "+ ex);
		}
        
	    return driver;
		
	}
	/**************************************************************************************
	 * Method Name:switchToLasWindow
	 * Description: This switches to  parent window handle
	 * returns: RemoteWebDriver
	 * ***********************************************************************************/	
	public RemoteWebDriver switchToLastWindow()
	{
		try{
			windowHandlesList=driver.getWindowHandles();
		
			for(String numberOfHandles : windowHandlesList){
				driver= (RemoteWebDriver) driver.switchTo().window(numberOfHandles);
				}
			}
		catch(Exception ex){
			
			System.out.println("Error switching to last window "+ ex);
		}
        finally{
			
			screenShot();
		}
	    return driver;
	}
	
	
	
	
	/**************************************************************************************
	 * Method Name:switchToWindowAlert
	 * Description: this switches from windows to alert
	 * returns: String
	 * ***********************************************************************************/	
	public void switchToWindowAlert(){
		try{
		 alertobj=driver.switchTo().alert();
		// return alertobj;
		}
		catch(Exception ex){
			System.out.println("The window did not focus on alert");
		}
		
		//return alertobj;
	}
	/**************************************************************************************
	 * Method Name:manageAlert
	 * Description: this manages the alert functions
	 * returns: String
	 * ***********************************************************************************/	
	
	public void manageAlertAccept(){
		alertobj=driver.switchTo().alert();
		alertobj.accept();
			
	}
	public void manageAlertDismiss(){
		alertobj.dismiss();
	}
	public String   manageAlertGetText(){
		try{
		alertText=alertobj.getText();
		if(alertText.isEmpty()){
			alertTextResult=false;
			
		}
		else{
			alertTextResult=true;
		}
		}
		catch(Exception ex){
			System.out.println("There is some exception in putting text in alert"+ ex);
		}
		return alertText;
		
	}
	
	
	
	public void writeAlertText(String name){
		
		try{
			alertobj.sendKeys(name);
			
		}
		catch(Exception ex){
			
			System.out.println("There is problem writing text to alert");
		}
		
		
	}
	
	
	////handle frame
	
	public RemoteWebDriver switchToFrameByNameOrId(String name){
		
		try{
		driver= (RemoteWebDriver) driver.switchTo().frame(name);
		}
		catch(Exception ex){
			
			System.out.println("There is problem  in fethching the frame by string or id");
		}
		finally{
			screenShot();
		}
		return driver;
		
		
	}
	
	
public RemoteWebDriver switchToFrameByIndex(int  index){
		
		try{
		driver= (RemoteWebDriver) driver.switchTo().frame(index);
		}
		catch(Exception ex){
			
			System.out.println("There is problem  in fethching the frame by index");
		}
		finally{
			screenShot();
		}
		return driver;
		
		
	}




public RemoteWebDriver switchToFrameByWebElement(String xpath){
	
	try{
	driver= (RemoteWebDriver) driver.switchTo().frame(driver.findElementByXPath(xpath));
	}
	catch(Exception ex){
		
		System.out.println("There is problem  in fethching the frame xpath");
	}
	finally{
		screenShot();
	}
	return driver;
	
	
}



	
	
	/*public void clickByExpaths(String xpath){
		try{
		
			List<WebElement> xpathlist= driver.findElementsByXPath(xpath);
			for (WebElement xpathvalue : xpathlist) {
				String xpathvar=xpathvalue.getText();
				if(xpathvar.isEmpty()){
					driver.findElementByXPath(xpath).click();
					
				}	
					
				
			}
				
			}
		catch(Exception ex){
			System.out.println("There is not such xpath as " +xpath + ex);
		}
		}*/
		
	
	


///switch to default content

	public void switchToDefaultContent(){
		driver.switchTo().defaultContent();
	}
	
	
	
	////handling of radio button
	
	//to selct the first radio button
	public void selFirstRadioButton(String name)
	{
		boolean isSelected= false;
	
		try
		{
		
			List<WebElement> radioList=driver.findElementsByName(name);
			isSelected=radioList.get(0).isSelected();
			if(!isSelected)
				{
				radioList.get(0).click();
				}
			
		}
		catch(NoSuchElementException e) 
		{
			System.out.println("Unable to Select the Radio button");
		}
		finally
		{
			screenShot();
		}
	}
	
	//to select second redio button
	
	public void selSecondRadioButton(String name)
	{
		boolean isSelected= false;
	
		try
		{
		
			List<WebElement> radioList=driver.findElementsByName(name);
			isSelected=radioList.get(0).isSelected();
			if(isSelected)
				{
				radioList.get(1).click();
				}
			
		}
		catch(NoSuchElementException e) 
		{
			System.out.println("Unable to Select the Radio button");
		}
		finally
		{
			screenShot();
		}
	}
	
public String printElementbyId(String id)
	{
	String value=null;
	try{
	
	value=driver.findElementById(id).getText();
	//System.out.println(value);
	return value;
	}
	catch(Exception ex){
		System.out.println("There is problem fetching the text "+ex);
	}
	return value;
	
		
	}
	
	
	
	
	
	
	

}
