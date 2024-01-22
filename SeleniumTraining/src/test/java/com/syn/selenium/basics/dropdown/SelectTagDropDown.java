package com.syn.selenium.basics.dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class SelectTagDropDown {
	
	static WebDriver driver = null;
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		int date = 14;
		driver.get("http://formy-project.herokuapp.com/form");
		Thread.sleep(5000);
		driver.findElement(By.id("first-name")).sendKeys("Aravinda");
		Thread.sleep(2000);
		driver.findElement(By.id("last-name")).sendKeys("H");
		Thread.sleep(2000);
		driver.findElement(By.id("job-title")).sendKeys("Trainer");
		Thread.sleep(2000);
		driver.findElement(By.id("radio-button-3")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("checkbox-1")).click();
		Thread.sleep(2000);
		WebElement dropdown = driver.findElement(By.id("select-menu"));
		Select sel = new Select(dropdown);
		sel.selectByIndex(2);
		Thread.sleep(5000);
		sel.selectByValue("4");
		Thread.sleep(5000);
		sel.selectByVisibleText("0-1");
		Thread.sleep(5000);
		driver.findElement(By.id("datepicker")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//table[@class='table-condensed']//td[text()='"+ date+"']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Submit")).click();
		
		
		String successMessage = driver.findElement(By.xpath("//div[@role='alert']")).getText();
		
		Assert.assertEquals(successMessage.trim(),"The form was successfully submitted!");
		System.out.println("Sussess message " + successMessage);
		
		
	}

}
