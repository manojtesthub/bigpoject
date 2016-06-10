package week5;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import week4.Homework.WrapperNew;

public class LoginExcelOpenTaps extends WrapperNew{
  
  @Test
  public void readExcel() throws IOException{
	
	  //For Read create input stream
	  FileInputStream fis = new FileInputStream(new File("./data/login.xlsx"));
	  
	  //Open the Workbook
	  XSSFWorkbook wbook = new XSSFWorkbook(fis);
	  
	  //Go to sheet
	  XSSFSheet sheet = wbook.getSheetAt(0);
	  
	  //This return no of row in excelsheet
	  int rowCount = sheet.getLastRowNum();
	  System.out.println("The number of rows:" +rowCount);
	  //Iterate it and print for
	  for(int i=1; i<=rowCount; i++){
		  launchBrowser("ChromeDriver", "http://demo1.opentaps.org/opentaps/control/main");
		  
			XSSFRow row  = sheet.getRow(i);
			  //Go to cell
			  XSSFCell cell = row.getCell(0);
			  
			  enterTextById("username", cell.getStringCellValue());
			  enterTextById("password", row.getCell(1).getStringCellValue());
			  try {
			
				clickByClassName("decorativeSubmit");
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
			} finally {
				closeBrowser();
		
			}
			  //clickByClassName("decorativeSubmit");
			  //clickByLinkText("CRM/SFA");
			  
		}
		  		  
	  }
  }

