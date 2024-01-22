package com.syn.selenium.basics.switchto;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.syn.selenium.basics.utils.WebdriverUtils;

public class MultipleBrowserHandlingDemo {

	public static void main(String[] args) 
	{

		WebDriver driver = WebdriverUtils.getMyDriver();
		
		WebdriverUtils.launch("https://www.irctc.co.in/eticketing/errors.html#");
		
		WebdriverUtils.click("linktext", "Contact Us");

		Set<String> windowIDs = driver.getWindowHandles();
		Iterator<String> it = windowIDs.iterator();
		String parentWindowID = it.next();
		String childWindowID = it.next();
		
		System.out.println("Parent Window ID " + parentWindowID);
		System.out.println("Child Window ID " + childWindowID);
		
		System.out.println("--------content of child browser ----------------");
		
		driver.switchTo().window(childWindowID);
		List<WebElement> emailIDs = WebdriverUtils.getMyElements("tagname", "a");
		
		for (WebElement email : emailIDs) {
			
			System.out.println(WebdriverUtils.getTextOfMyElement(email));
		}
		
		System.out.println("--------content of parent browser ----------------");
		
		driver.switchTo().window(parentWindowID);
		List<WebElement> hyperlinks = WebdriverUtils.getMyElements("tagname", "a");
		
		for (WebElement hlink : hyperlinks) {
			
			System.out.println(WebdriverUtils.getTextOfMyElement(hlink));
		}
		
	}
}
