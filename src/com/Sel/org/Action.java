package com.Sel.org;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
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

public class Action {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Surendhar\\eclipse-workspace\\Selenium_Browser_Launch\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		
	Actions	act = new Actions (driver);
	WebElement mail = driver.findElement(By.xpath("//a[text()='Gmail']"));
	act.contextClick(mail).build().perform();
	Thread.sleep(3000);
	
	Robot Rt = new Robot();
	
	Rt.keyPress(KeyEvent.VK_DOWN);
	Rt.keyRelease(KeyEvent.VK_DOWN);
	
	Rt.keyPress(KeyEvent.VK_DOWN);
	Rt.keyRelease(KeyEvent.VK_DOWN);
	
	Rt.keyPress(KeyEvent.VK_ENTER);
	Rt.keyRelease(KeyEvent.VK_ENTER);
	
	
	Thread.sleep(3000);
	
	TakesScreenshot act1=(TakesScreenshot)driver;
	File screenshotAs = act1.getScreenshotAs(OutputType.FILE);
	File docs = new File("C:\\Users\\Surendhar\\eclipse-workspace\\Selenium_Browser_Launch\\Driver\\Act.png");
	FileUtils.copyFile(screenshotAs, docs);
	
	driver.close();

	
	}

}
