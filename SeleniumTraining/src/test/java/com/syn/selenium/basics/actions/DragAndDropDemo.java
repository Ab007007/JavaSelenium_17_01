package com.syn.selenium.basics.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.syn.selenium.basics.utils.WebdriverUtils;

public class DragAndDropDemo {

	public static void main(String[] args) {
		
		WebDriver driver = WebdriverUtils.getMyDriver("ff");
		
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
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
		
//		//right click
//		act.contextClick();
//		
//		
//		//double click
//		act.doubleClick();
//		
//		
//		//click and hold
//		act.clickAndHold();
//		act.release();
		
	}
}
