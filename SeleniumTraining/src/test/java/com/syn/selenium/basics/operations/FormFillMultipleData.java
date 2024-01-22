package com.syn.selenium.basics.operations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.syn.selenium.basics.utils.ExcelUtility;
import com.syn.selenium.basics.utils.WebdriverUtils;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FormFillMultipleData 
{
	static WebDriver driver = null; 
	public static void main(String[] args) throws InterruptedException 
	{
		driver = WebdriverUtils.getMyDriver();
		
		int date = 14;
		String sheetName ="Sheet1";
		int rowCount = ExcelUtility.getRowCount(sheetName);
		for (int i = 1; i < rowCount; i++) 
		{
			WebdriverUtils.launch("http://formy-project.herokuapp.com/form");
			Thread.sleep(5000);
			WebdriverUtils.entrText("id", "first-name", ExcelUtility.getMyCellValue(sheetName, i, 0));
			Thread.sleep(2000);
			WebdriverUtils.entrText("id", "last-name", ExcelUtility.getMyCellValue(sheetName, i, 1));
			Thread.sleep(2000);
			WebdriverUtils.entrText("id", "job-title", ExcelUtility.getMyCellValue(sheetName, i, 2));
			Thread.sleep(2000);
			WebdriverUtils.click("id", "radio-button-3");
			Thread.sleep(2000);
			WebdriverUtils.click("id", "checkbox-1");
			Thread.sleep(2000);
			WebdriverUtils.click("id", "datepicker");
			Thread.sleep(2000);
			WebdriverUtils.click("xpath", "//table[@class='table-condensed']//td[text()='"+ date+"']");
			Thread.sleep(2000);
			WebdriverUtils.click("linktext", "Submit");
			Thread.sleep(5000);
			
			String successMessage = WebdriverUtils.getTextOfMyElement("xpath", "//div[@role='alert']");
			
			System.out.println("Sussess message " + successMessage);
			
		}
		
	}

}
