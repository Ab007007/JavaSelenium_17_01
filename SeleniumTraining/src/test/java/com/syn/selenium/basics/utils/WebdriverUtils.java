package com.syn.selenium.basics.utils;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverUtils {

	
	public static WebDriver driver = null;
	
	public static void launch(String url)
	{
		System.out.println("launching Application " + url);
		driver.get(url);
	}

	public static WebDriver getMyDriver()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		return driver;
	}
	
	public static WebDriver getMyDriver(String type)
	{
		System.out.println("Creating a Brower driver for " + type);
		switch (type) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

			break;
		case "ff":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

			break;

		default:
			break;
		}
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		return driver;
	}

	public static WebElement getMyElement(String type, String value)
	{
		WebElement ele =null;
		System.out.println("Finding Element using " + type + " and its value " + value);
		switch (type) {
		case "id":
			ele = driver.findElement(By.id(value));
			break;

		case "name":
			ele = driver.findElement(By.name(value));
			break;

		case "classname":
			ele = driver.findElement(By.className(value));
			break;

		case "tagname":
			ele = driver.findElement(By.tagName(value));
			break;

		case "linktext":
			ele = driver.findElement(By.linkText(value));
			break;

		case "partiallinktext":
			ele = driver.findElement(By.partialLinkText(value));
			break;

		case "css":
			ele = driver.findElement(By.cssSelector(value));
			break;
		case "xpath":
			ele = driver.findElement(By.xpath(value));
			break;

		default:
			break;
		}
		
		return ele;
	}
	
	public static List<WebElement> getMyElements(String type, String value)
	{
		List<WebElement> ele =null;
		System.out.println("Finding Element using " + type + " and its value " + value);
		switch (type) {
		case "id":
			ele = driver.findElements(By.id(value));
			break;

		case "name":
			ele = driver.findElements(By.name(value));
			break;

		case "classname":
			ele = driver.findElements(By.className(value));
			break;

		case "tagname":
			ele = driver.findElements(By.tagName(value));
			break;

		case "linktext":
			ele = driver.findElements(By.linkText(value));
			break;

		case "partiallinktext":
			ele = driver.findElements(By.partialLinkText(value));
			break;

		case "css":
			ele = driver.findElements(By.cssSelector(value));
			break;
		case "xpath":
			ele = driver.findElements(By.xpath(value));
			break;

		default:
			break;
		}
		
		return ele;
	}

	public static void entrText(String type, String value, String textoType)
	{
		System.out.println("Perform type : " + textoType + " on " + type + " value " + value);
		WebElement ele = getMyElement(type, value);
		
		ele.sendKeys(textoType);
	}
	
	public static void click(String type, String value)
	{
		System.out.println("Perform Click :  on " + type + " value " + value);
		WebElement ele = getMyElement(type, value);
		ele.click();
	}
	
	public static String getAttributeOfMyElement(String type, String value, String attributeType)
	{
		System.out.println("Getting attribute value : " + attributeType + " on " + type + " value " + value);
		WebElement ele = getMyElement(type, value);
		
		return ele.getAttribute(attributeType);
	}

	public static String getTextOfMyElement(String type, String value)
	{
		System.out.println("Getting Text :  on " + type + " value " + value);
		WebElement ele = getMyElement(type, value);
		return ele.getText();
	}
}
