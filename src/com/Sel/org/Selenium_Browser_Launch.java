package com.Sel.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Browser_Launch {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Surendhar\\eclipse-workspace\\Selenium_Browser_Launch\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		
		driver.navigate().to("https://www.amazon.in/");
		
		driver.navigate().to("https://www.flipkart.com/");
		
		driver.navigate().back();
		
		driver.navigate().to("https://www.facebook.com/");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().to ("https://www.youtube.com/");
		
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
		driver.close();
		
	}

	
}