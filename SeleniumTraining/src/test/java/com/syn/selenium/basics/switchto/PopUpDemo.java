package com.syn.selenium.basics.switchto;

import org.openqa.selenium.WebDriver;

import com.syn.selenium.basics.utils.WebdriverUtils;

public class PopUpDemo
{
	
	
	public static void main(String[] args) 
	{
		WebDriver driver = WebdriverUtils.getMyDriver();
		
		WebdriverUtils.launch("http://formy-project.herokuapp.com/switch-window");
		
		WebdriverUtils.click("id", "alert-button");

		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().accept();
	}

}
