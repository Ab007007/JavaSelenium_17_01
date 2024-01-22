package com.syn.selenium.basics.switchto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.syn.selenium.basics.utils.WebdriverUtils;

public class HandlingElementInsideFrame {

	public static void main(String[] args) {
		
		WebDriver driver = WebdriverUtils.getMyDriver("ff");
		
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@src,'default')]")));
		WebElement srcEle = driver.findElement(By.id("draggable"));
		WebElement destEle = driver.findElement(By.id("droppable"));

		System.out.println("--Before Drag and Drop ---------");
		System.out.println("Source Element " + srcEle.getText());
		System.out.println("Dest Element " + destEle.getText());

		Actions act = new Actions(driver);
		act.dragAndDrop(srcEle, destEle).perform();

		System.out.println("--After Drag and Drop ---------");
		System.out.println("Source Element " + srcEle.getText());
		System.out.println("Dest Element " + destEle.getText());
		
		driver.switchTo().defaultContent();
		
		WebdriverUtils.click("linktext", "Resizable");
		
	}
}
