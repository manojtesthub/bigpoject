package week3;


import static org.junit.Assert.fail;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class WrapperGroup {
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
    
        
   public void launchbrowser(String drive, String url)
   {
   try{
       if(drive.equalsIgnoreCase("chrome"))
   
       {
       System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
       driver=new ChromeDriver();}
               
       else if(drive.equalsIgnoreCase("firefox"))
           {
       driver =new FirefoxDriver();
           }
   }
   catch(Exception e)
   {
       System.out.println("browser is not lanched" +e);
   }
   
   driver.get(url);
   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
   driver.manage().window().maximize();
   
   }
   
   //xpaths is create a method
   public void xpath(String xpath)
   {
       try
   { 
           
       driver.findElementByXPath(xpath).click();
   
   }            
       
   
       catch(Exception e)
   {
           System.out.println("xpath not found"+ e);
   }
       
       }
   
//xpaths is using sendkeys
   public void xpathvalue(String xpaths, String s) {
               try
       {
           driver.findElementByXPath(xpaths).sendKeys(s);
           
       }
       catch(Exception e)
       {
           System.out.println("xpaths values not send"+ e);
       }
       
   }
   public void enterTextById(String obj, String val){
       try {
           driver.findElement(By.id(obj)).clear();
           driver.findElementById(obj).sendKeys(val);
           
        //   driver.findElement(By.id(obj)).sendKeys(val);
       } catch (NoSuchElementException e) {
           // TODO Auto-generated catch block
           //e.printStackTrace();
           System.out.println("WebElement is not found");
       }
   }
   public void enterTextByName(String obj, String val){
       try {
    	  
           driver.findElementByName((obj)).clear();
           driver.findElementByName((obj)).sendKeys(val);
       } catch (NoSuchElementException e) {
           // TODO Auto-generated catch block
           //e.printStackTrace();
           System.out.println("WebElement is not found");
       }
   }
   public void enterTextByClassName(String obj, String val){
       try {
    	  
           driver.findElement(By.name(obj)).clear();
           driver.findElement(By.name(obj)).sendKeys(val);
       } catch (NoSuchElementException e) {
           // TODO Auto-generated catch block
           //e.printStackTrace();
           System.out.println("WebElement is not found");
       }
   }
   public void clickByLinkText(String obj){
		
		try {
			driver.findElement(By.linkText(obj)).click();
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		
	}
   public void getText(String obj){
		
	   try {
			System.out.println(driver.findElement(By.id(obj)).getText());
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		
	}
   
   
   public void clickByClassName(String obj){
       try {
    	   
           driver.findElement(By.className(obj)).click();
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
       
   public void verifyTexts(String obj, String s){
	   //boolean istrue = false;
	   try {
		String verify = driver.findElementById(obj).getText();
		   System.out.println(verify);
		   if(verify.equalsIgnoreCase(s)){
			   System.out.println("Text Verified success");
		   }else{
			   System.out.println("not match");
		   }
	} catch (WebDriverException e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
		 System.out.println("WebElement is not found");
	}
	   
   }
   
   public void logout(String obj){
       try {
           driver.findElement(By.xpath(obj)).click();
       } catch (NoSuchElementException e) {
           // TODO Auto-generated catch block
           //e.printStackTrace();
           System.out.println("Logout : WebElement is not found");
       }
   }
   
   public boolean verifyTitle(String s){
       boolean istrue = false;    
       try {
       
           if(driver.getTitle().equalsIgnoreCase(s))
           {
               
           System.out.println("The title is correct: " +driver.getTitle());
           
           }else  {
               System.out.println("Title not Match");
               
           
       } }
       catch (Exception e) {
           // TODO Auto-generated catch block
           //e.printStackTrace();
           System.out.println("Title : Not Match");
       }
       return istrue;
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
//checking whether the set is empty
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
//checking whether the parent id  is empty
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

/**********************************************************************************************************************************************
    * Method Name- selectDdByIndex
    * Description-This selects the value from drop down by id. 
    *
    * 
    ***************************************************************************************************************************************/
   
   public void selectDdByIndex(String dropdownId,int i)

   {        try
       {
       WebElement job = driver.findElementById(dropdownId);
       Select dropdown = new Select (job);
       dropdown.selectByIndex(i);
       }
       catch (NoSuchElementException e)
       {
               System.out.println("dropdown is not found"+dropdownId);
           
   }
   finally
   {
       screenShot();
   }
   }
               
   
   /**********************************************************************************************************************************************
    * Method Name- selectDdByValue
    * Description-This selects the value from drop down by value. 
    *
    * 
    ***************************************************************************************************************************************/
public void selectDdByValue(String dropdownId,String s)

{        try
   {
   WebElement job = driver.findElementById(dropdownId);
   Select dropdown = new Select (job);
   dropdown.selectByValue(s);
   }
   catch (NoSuchElementException e)
   {
           System.out.println("dropdown is not found"+dropdownId);
       
}
finally
{
   screenShot();
}
   
   }
/**********************************************************************************************************************************************
* Method Name- selectDdByVisibleText
* Description-This selects the value from drop down by Visible text. 
*
* 
***************************************************************************************************************************************/
public void selectDdByVisibleText(String dropdownId,String s)

{        try
   {
   WebElement job = driver.findElementById(dropdownId);
   Select dropdown = new Select (job);
   dropdown.selectByVisibleText(s);
   }
   catch (NoSuchElementException e)
   {
           System.out.println("dropdown is not found"+dropdownId);
       
}
finally
{
   screenShot();
}
   
   }

}