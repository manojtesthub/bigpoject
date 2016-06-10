package week5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import week4.Homework.WrapperNew;

public class AmazonSearchExcel extends WrapperNew {
  @Test
  public void amazonSearchExcel() throws IOException, InterruptedException {
	  launchBrowser("ChromeDriver", "http://www.amazon.in/");
	  FileInputStream search = new FileInputStream(new File("./data/Amaon Search.xlsx"));
	  
	  XSSFWorkbook wbook = new XSSFWorkbook(search);
	  XSSFSheet sheet = wbook.getSheetAt(0);
	  int rowCount = sheet.getLastRowNum();
	  System.out.println("Total Rows :" +rowCount);
	  	
	  XSSFRow row = sheet.getRow(1);
	  XSSFCell cell = row.getCell(0);

	  enterTextById("twotabsearchtextbox", cell.getStringCellValue());
	  clickByClassName("nav-input");
	  XSSFCell cell1 =row.getCell(1);
	  Thread.sleep(3000);
	  int value = (int) cell1.getNumericCellValue();
	  Thread.sleep(3000);
	  clickByLinkXpath("(//h2[@class='a-size-medium a-color-null s-inline  s-access-title  a-text-normal'])["+value+"]");
	  prepareWindowHandles();
	  
	  switchToLastWindow();
	  Thread.sleep(5000);
	  closeBrowser();
	  switchToParentWindow();
	  
	  Thread.sleep(5000);
	  XSSFRow row1 = sheet.getRow(2);
	  XSSFCell cell2 = row1.getCell(0);
	  enterTextById("twotabsearchtextbox", cell2.getStringCellValue());
	  clickByClassName("nav-input");
	  XSSFCell cell3 =row1.getCell(1);
	  Thread.sleep(3000);
	  int value2 = (int) cell3.getNumericCellValue();
	  Thread.sleep(3000);
	  clickByLinkXpath("(//h2[@class='a-size-medium a-color-null s-inline  s-access-title  a-text-normal'])["+value2+"]");
	  
	  
	  
	  /* for(int i = 1; i<=rowCount; i++){
	  XSSFRow row = sheet.getRow(i);
	  
	  XSSFCell cell = row.getCell(0);
	  
	  enterTextById("twotabsearchtextbox", cell.getStringCellValue());
	  Thread.sleep(3000);
	  clickByClassName("nav-input");
	  Thread.sleep(5000);
	 // clickByLinkXpath("//a[@class='a-link-normal s-access-detail-page  a-text-normal'][row.getCell(1).getStringCellValue()]");
	  prepareWindowHandles();
	  Thread.sleep(3000);

	  clickByLinkXpath("(//a[@class='a-link-normal s-access-detail-page  a-text-normal'])[row.getCell(1).getStringCellValue()]]");

	  }*/
  
  }
}
