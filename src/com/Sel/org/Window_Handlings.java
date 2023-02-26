package com.Sel.org;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Window_Handlings {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Surendhar\\eclipse-workspace\\Selenium_Browser_Launch\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.ajio.com/");
		
		Thread.sleep(3000);
		
		WebElement MEN = driver.findElement(By.xpath("//a[text()='MEN']"));	
		
		Actions act=new Actions(driver);
		
		act.contextClick(MEN).build().perform();
		
		Robot ro = new Robot();
		
		ro.keyPress(KeyEvent.VK_DOWN);
		ro.keyRelease(KeyEvent.VK_DOWN);
		
		ro.keyPress(KeyEvent.VK_ENTER);
		ro.keyRelease(KeyEvent.VK_ENTER);
		
		
		WebElement HK = driver.findElement(By.xpath("//a[text()='HOME AND KITCHEN']"));
		
		act.contextClick(HK).build().perform();
		
		ro.keyPress(KeyEvent.VK_DOWN);
		ro.keyRelease(KeyEvent.VK_DOWN);
		
		ro.keyPress(KeyEvent.VK_ENTER);
		ro.keyRelease(KeyEvent.VK_ENTER);
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		
		for (String id: windowHandles) {
		String title = driver.switchTo().window(id).getTitle();
		System.out.println(title);
		}
		
		for (String id1: windowHandles) {
			Object Home = null;
			if(driver.switchTo().window(id1).getTitle().equals(Home));
			break;
		}
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File docs = new File ("C:\\Users\\Surendhar\\eclipse-workspace\\Selenium_Browser_Launch\\Driver\\ajio.png");
		FileUtils.copyFile(screenshotAs, docs);
		
		driver.close();
		
		
	}

}
