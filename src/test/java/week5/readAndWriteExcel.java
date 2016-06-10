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

public class readAndWriteExcel {
  @Test
  public void writeExcel() throws IOException {
	  
	  //Use output stream to write and append the data in excel
	  FileOutputStream fos = new FileOutputStream(new File("./data/report.xlsx"));
	  
	  //create Workbook XSSF for xlsx
	  XSSFWorkbook wbook = new XSSFWorkbook();
	  
	  //Create Sheet
	  XSSFSheet sheet = wbook.createSheet("Report");
	  
	  //Create Row
	  XSSFRow rowHeader = sheet.createRow(0);
	  
	  //Create cell - 0
	  XSSFCell cell = rowHeader.createCell(0);
	  //Give cell name
	  cell.setCellValue("TestCase Name");
	  
	  //Create cell -1
	  XSSFCell cell1 = rowHeader.createCell(1);
	  //Give cell name
	  cell1.setCellValue("Status");
	  
	  //Write is must, unless it doesnt write the data in your excel
	  wbook.write(fos);
	  
	  //Best Practice close file stream and workbook for leakage issue
	  fos.close();
	  wbook.close();
  }
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
			  
			  //Go to row
			  XSSFRow row  = sheet.getRow(i);
			  //Go to cell
			  XSSFCell cell = row.getCell(0);
			  System.out.println("UserName : " +cell.getStringCellValue());
			  System.out.println("Password : " +row.getCell(1).getStringCellValue());
			  
		  }
	  }
	  
}  
		  //Below code without forloop
		  
		  /* //Go to row
		  XSSFRow row = sheet.getRow(1);
		  //Go to cell 
		  XSSFCell cell =row.getCell(0);
		  //Go to cell and read
		  System.out.println(cell.getStringCellValue());
		  
		  XSSFCell cell1 =row.getCell(1);
		  //Go to cell and read
		  System.out.println(cell1.getStringCellValue());
	  
		  
	  }
	  
}*/