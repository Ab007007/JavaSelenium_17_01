package com.syn.selenium.basics.waits;

import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.swing.text.StyledEditorKit.BoldAction;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitDemo 
{
	
	public static void main(String[] args) 
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		driver.get("file:///D:/Synechron_Java_selenium/Eclipse_workspace/html/tiimeout.html");
		driver.findElement(By.tagName("button")).click();
		
		// STEP1
		FluentWait<WebElement> wait = 
				new FluentWait<WebElement>(driver.findElement(By.id("demo"))).
				withTimeout(Duration.ofSeconds(10)).
				pollingEvery(Duration.ofMillis(100)).
				ignoring(NoSuchElementException.class).
				ignoring(Exception.class);
				
		// STEP-2
		Function<WebElement, Boolean> fun = new Function<WebElement, Boolean>() 
		{

			@Override
			public Boolean apply(WebElement ele) {
				Boolean flag = false;
				if(ele.getText().equals("Hello"))
				{
					flag = true;
					System.out.println("ELEMENT FOUND!!!!");
				}
				else
				{
					System.out.println("Waiting!!!!!!!");
				}
				return flag;
			}
			
		};
		
		//STEP - 3
		wait.until(fun);
		
		System.out.println(driver.findElement(By.id("demo")).getText());
		System.out.println(driver.findElement(By.id("demo2")).getText());
		
		driver.close();
		
		
	}

}
