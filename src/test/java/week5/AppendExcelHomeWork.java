package week5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class AppendExcelHomeWork {
  @Test
  public void appendExistingReport() throws IOException {
	  
	  //Open Existing Excel report fis
	  FileInputStream fis = new FileInputStream(new File("./data/report.xlsx"));
	  XSSFWorkbook wbook = new XSSFWorkbook(fis);
	  //Go to sheet
	  XSSFSheet sheet = wbook.getSheet("Report");
	  
	  //rowCount
	  int rowCount = sheet.getLastRowNum();
	  System.out.println("Number of Rows : " +rowCount);
	  
	  //Create new row
	  XSSFRow row = sheet.createRow(1);
	  //Go to Cell and write -setCellValue
	 

	  XSSFCell cell = row.createCell(0);
	  cell.setCellValue("DemoSalesManager");
	  
	  XSSFCell cell1 = row.createCell(1);
	  cell1.setCellValue("PASS");
	  
	 // fis.close();

	  //write in excel
	  FileOutputStream fos = new FileOutputStream(new File("./data/report.xlsx"));
	  wbook.write(fos);
	  

	  fos.close();
	  wbook.close();
	  
	  
	  
	  
  }
}
