package com.syn.selenium.basics.waits;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitDemo 
{
	
	public static void main(String[] args) 
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		driver.get("file:///D:/Synechron_Java_selenium/Eclipse_workspace/html/tiimeout.html");
		driver.findElement(By.tagName("button")).click();
		
		// Step-1 : Create an object to Wait
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		
		// Step-2 :  from the wait object use the required function from ExpectedConditions class
		System.out.println(new Date().toString());
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("demo"))));
		
		System.out.println(new Date().toString());
		
		System.out.println(driver.findElement(By.id("demo")).getText());
		System.out.println(driver.findElement(By.id("demo2")).getText());
		
		driver.close();
		
		
	}

}
