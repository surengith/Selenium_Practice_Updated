package com.Sel.org;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alret {

	public static void main(String[] args) throws IOException, InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Surendhar\\eclipse-workspace\\Selenium_Browser_Launch\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		
		WebElement alert = driver.findElement(By.xpath("(//a[@class='analystic'])[1]"));
		alert.click();
		
		WebElement alert1 = driver.findElement(By.xpath("(//button[contains(text(),'click the button')])[1]"));
		alert1.click();
		
		Alert alert2 = driver.switchTo().alert();
		alert2.accept();
		
		TakesScreenshot s1=(TakesScreenshot)driver;
		File screenshotAs = s1.getScreenshotAs(OutputType.FILE);
		File docs = new File("C:\\Users\\Surendhar\\eclipse-workspace\\Selenium_Browser_Launch\\Driver\\Alert1.png");
		FileUtils.copyFile(screenshotAs, docs);
		
		
		WebElement alt = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		alt.click();
		
		WebElement altt = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		altt.click();
		
		Alert alert3 = driver.switchTo().alert();
		alert3.accept();
		
		TakesScreenshot s12=(TakesScreenshot)driver;
		File screenshotAs1 = s12.getScreenshotAs(OutputType.FILE);
		File docs1 = new File("C:\\Users\\Surendhar\\eclipse-workspace\\Selenium_Browser_Launch\\Driver\\Alert2.png");
		FileUtils.copyFile(screenshotAs1, docs1);
		
		
		WebElement alts = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		alts.click();
		
		WebElement alert4 = driver.findElement(By.xpath("(//button[@class='btn btn-info'])"));
		alert4.click();
		
		Alert alert5 = driver.switchTo().alert();
		alert5.sendKeys("Welcome to The Testing World");
		alert5.accept();
		
		Thread.sleep(3000);
		
		TakesScreenshot s13=(TakesScreenshot)driver;
		File screenshotAs3 = s13.getScreenshotAs(OutputType.FILE);
		File docs3 = new File("C:\\Users\\Surendhar\\eclipse-workspace\\Selenium_Browser_Launch\\Driver\\Alert3.png");
		FileUtils.copyFile(screenshotAs3, docs3);
		
		driver.close();
		
		
	}
	

}

