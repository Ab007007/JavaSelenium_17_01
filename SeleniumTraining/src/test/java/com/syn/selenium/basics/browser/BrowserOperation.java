package com.syn.selenium.basics.browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserOperation {

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
			
		driver.manage().window().maximize();
		
		driver.get("http://www.google.com");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		System.out.println("Current Page : "+ driver.getCurrentUrl());
		System.out.println("Title of the Page : " + driver.getTitle());
		System.out.println("Window id : " + driver.getWindowHandle());
		
		
		driver.navigate().to("https://www.makemytrip.com/");
		System.out.println("Current Page : "+ driver.getCurrentUrl());
		System.out.println("Title of the Page : " + driver.getTitle());
		Thread.sleep(2000);
		driver.close();
	}
}
