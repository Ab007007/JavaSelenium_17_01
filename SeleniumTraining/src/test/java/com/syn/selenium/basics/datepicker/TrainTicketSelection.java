package com.syn.selenium.basics.datepicker;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TrainTicketSelection {

	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	
		driver.get("https://www.ixigo.com/trains");
		
		driver.findElement(By.xpath("//input[@placeholder='depart']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='rd-container train-cal rd-container-attachment']"))));
		
		SimpleDateFormat sd = new SimpleDateFormat("dd-MM");		
		String currentDay = sd.format(new Date()).split("-")[0];
		String currentMonth = sd.format(new Date()).split("-")[1];
		
		
		int dateToSelect = Integer.parseInt(currentDay)+2 ;
		int month = Integer.parseInt(currentMonth);
		if(dateToSelect == 30 || dateToSelect == 31)
		{
			month = Integer.parseInt(currentMonth)+1;
		}
		//div[@class='rd-date']/div[1]//div[text()='24']
		String newDate = dateToSelect +"0" + month +  "2024";
		driver.findElement(By.xpath("//td[@data-date='" + newDate + "']")).click();
		
	}
}
