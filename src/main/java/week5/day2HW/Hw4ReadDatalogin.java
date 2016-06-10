package week5.day2HW;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Hw4ReadDatalogin {
	//RemoteWebDriver driver;
	FirefoxDriver driver = new FirefoxDriver();

	@Test(dataProvider = "login")
	public void Opentaps(String name, String pass){
		
		driver.get("http://demo1.opentaps.org/opentaps/control/main");
		driver.findElementById("username").sendKeys(name);
		driver.findElementById("password").sendKeys(pass);
		driver.findElementByClassName("decorativeSubmit").click();

				
		
	}
	
	@DataProvider(name = "login")
	public Object[][] getdata() throws IOException{
		FileInputStream fis = new FileInputStream(new File("./data/login.xlsx"));
		XSSFWorkbook wbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet =wbook.getSheetAt(0);
		XSSFRow row = sheet.getRow(1);
		XSSFCell cell = row.getCell(0);
		XSSFCell cell1 = row.getCell(1);
		
		Object[][] data = new Object[1][2];
		data[0][0] =  cell.getStringCellValue();
		data[0][1]	=  cell1.getStringCellValue();
		
		return data;
		
	}
	

}
