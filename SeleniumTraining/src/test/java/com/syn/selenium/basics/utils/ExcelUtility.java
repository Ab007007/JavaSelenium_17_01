package com.syn.selenium.basics.utils;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelUtility {

	public static File file;
	public static FileInputStream fis;
	public static Workbook wb;
	public static Sheet sh;
	
	public static Workbook getWorkBook() {

		try 
		{
			file = new File("data/TestData.xls");
			fis = new FileInputStream(file);
			wb = WorkbookFactory.create(fis);
		}
		catch(Exception ex)
		{
			System.out.println("Exception while reading excel file");
		}
		
		return wb;
	}
	
	public static Sheet getSheet(String name)
	{
		getWorkBook();
		sh =  wb.getSheet(name);
		return sh;
		
	}
	
	
	public static int getRowCount(String name)
	{
		getSheet(name);
		int rowCount  = sh.getLastRowNum()+1;
		System.out.println("Total Number of Rows : " + rowCount);
		return rowCount;
	}
	
	public static String getMyCellValue(String name, int rowNum, int colNum)
	{
		getSheet(name);
		Row row = sh.getRow(rowNum);
		String value = row.getCell(colNum).getStringCellValue();
		try {
			fis.close();
			wb.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return value;
	}
	
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		System.out.println(getMyCellValue("Sheet1", 0, 0));
		System.out.println(getMyCellValue("Sheet1", 0, 1));
	
	}
}
