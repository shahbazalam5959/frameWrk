package com.automation.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {

	XSSFWorkbook wb;
	
	public ExcelDataProvider()//This constructor will load the Excel as soon as we create object of this class it vl simply load the Excel,o we dont have to provide excel path again 7& again
	{	
		File src = new File("./TestData/Data.xlsx");
		
		try {
			FileInputStream fis = new FileInputStream(src);//It vl convert file into RawData
			
			wb = new XSSFWorkbook(fis);
		} catch (Exception e) {
			
			System.out.println("Unable to read Excel File"+e.getMessage());
		} 
	}
	
	public String getStringData(int sheetIndex,int row,int col)//Eg:Method Overloading
	{
		return wb.getSheetAt(sheetIndex).getRow(row).getCell(col).getStringCellValue();	
	}
	
	
	public String getStringData(String sheetName,int row,int col)//Eg:Method Overloading
	{
		return wb.getSheet(sheetName).getRow(row).getCell(col).getStringCellValue();
	}
	
	public double getNumericData(String sheetName,int row,int col)
	{
		return wb.getSheet(sheetName).getRow(row).getCell(col).getNumericCellValue();
	}
	
	
}
   