package com.Sel.org;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Surendhar\\eclipse-workspace\\Selenium_Browser_Launch\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://leafground.com/pages/drop.html");
		
		Actions act = new Actions(driver);
		
		WebElement source = driver.findElement(By.id("draggable"));
		
		WebElement destination = driver.findElement(By.id("droppable"));
	
		
		act.clickAndHold(source).moveToElement(destination).perform();
		
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File snip = new File("C:\\Users\\Surendhar\\eclipse-workspace\\Selenium_Browser_Launch\\Driver\\dd.png");
		FileUtils.copyFile(screenshotAs, snip);
		
		driver.close();
		
	}
	

}
