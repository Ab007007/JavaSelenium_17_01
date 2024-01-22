package com.syn.selenium.basics.actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.syn.selenium.basics.utils.WebdriverUtils;

public class MouseMovementOperation {
	
	public static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {
		
		driver = WebdriverUtils.getMyDriver();
		driver.get("https://www.flipkart.com/");
		
		WebElement electronicsModule = driver.findElement(By.xpath("//div[@aria-label='Electronics']"));
		WebElement fashionModule = driver.findElement(By.xpath("//div[@aria-label='Fashion']"));
		WebElement homeModule = driver.findElement(By.xpath("//div[@aria-label='Home & Furniture']"));

		Actions act = new Actions(driver);
		
		act.moveToElement(electronicsModule).perform();
		Thread.sleep(5000);
		printSuggestions();
		act.moveToElement(fashionModule).perform();
		Thread.sleep(5000);
		printSuggestions();
		act.moveToElement(homeModule).perform();
		Thread.sleep(5000);
		printSuggestions();
		
	}
	
	public static void printSuggestions()
	{
		List<WebElement> suggestions = driver.findElements(By.xpath("//div[@class='_1UgUYI _2eN8ye']//a"));
		
		for (WebElement suggestion : suggestions) 
		{
			System.out.println(suggestion.getText());
			
		}
	}

}
