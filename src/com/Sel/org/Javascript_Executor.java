package com.Sel.org;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript_Executor {

	public static void main(String[] args) throws InterruptedException, IOException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Surendhar\\eclipse-workspace\\Selenium_Browser_Launch\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		WebElement sell = driver.findElement(By.xpath("//a[text () ='Sell on Amazon']"));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",sell);
		
		Thread.sleep(3000);
		
		
		js.executeScript("window.scrollBy(0, -3000);");
		
		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0, -3000);");
		
		 
		Thread.sleep(3000);
		
		TakesScreenshot s = (TakesScreenshot)driver;
		File as = s.getScreenshotAs(OutputType.FILE);
		File Ds = new File("C:\\Users\\Surendhar\\Downloads\\name.png");
		FileUtils.copyFile(as, Ds);
		
		driver.close();
		
		
		
		

	}

}
