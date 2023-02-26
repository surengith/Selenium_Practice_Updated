package com.Sel.org;


import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {


	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Surendhar\\eclipse-workspace\\Selenium_Browser_Launch\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.leafground.com/pages/frame.html");
		
		
		driver.switchTo().frame(0);
		WebElement frame1 = driver.findElement(By.id("Click"));		
		frame1.click();
		
		String text = frame1.getText();
		System.out.println("Frame1:- "+ text);
		driver.switchTo().defaultContent();
		
		Thread.sleep(3000);
		
		
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		WebElement frame2 = driver.findElement(By.id("Click1"));		
		frame2.click();
		
		String text1 = frame2.getText();
		System.out.println("Frame2:- "+ text1);
		driver.switchTo().defaultContent();
		
		List<WebElement> c = driver.findElements(By.tagName("iframe"));
		int size=c.size();
		System.out.println("iFrame size:- "+ size);
		
		TakesScreenshot a=(TakesScreenshot)driver;
		File S=a.getScreenshotAs(OutputType.FILE);
		File d=new File("D:\\Automation Testing Workspace\\file.png");
		FileUtils.copyFile(S,d);
		
		Thread.sleep(3000);
		
		driver.close();
		

	
		
	}

}
