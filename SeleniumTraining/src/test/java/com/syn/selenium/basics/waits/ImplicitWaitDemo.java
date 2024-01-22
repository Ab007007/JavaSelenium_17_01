package com.syn.selenium.basics.waits;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWaitDemo 
{
	static WebDriver driver = null;
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
			
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Synechron");
		
		Thread.sleep(5000);
		List<WebElement> autoSuggestions = driver.findElements(By.xpath("//ul[@class='G43f7e']/li[@role='presentation']"));
		
	//	printElementsUsingForEach(autoSuggestions);
		
		Iterator<WebElement> it = autoSuggestions.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next().getText());
		}
		
		
		driver.close();
		
	}
	
	
	
	
	private static void printElementsUsingForEach(List<WebElement> autoSuggestions) {
		System.out.println("Total suggesitons " + autoSuggestions.size());
		for (WebElement autoSuggestion : autoSuggestions) 
		{
			System.out.println(autoSuggestion.getText());
		}
	}

}
