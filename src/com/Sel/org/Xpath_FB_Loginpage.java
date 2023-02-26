package com.Sel.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_FB_Loginpage {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Surendhar\\eclipse-workspace\\Selenium_Browser_Launch\\Driver\\chromedriver.exe");
		
		WebDriver fb = new ChromeDriver();
		
		fb.manage().window().maximize();
		
		fb.get("https://www.facebook.com/");
		
		WebElement email = fb.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("suren2696@gmail.com");
		
		WebElement password = fb.findElement(By.xpath("//input[contains(@type, 'pass')]"));
		password.sendKeys("Suren@123$");
		
		WebElement login = fb.findElement(By.xpath("(//button[@name='login'])[1]"));
		login.click();
		
		Thread.sleep(5000);
		
		fb.navigate().back();

		
		WebElement forgot = fb.findElement(By.xpath("//a[contains(text(), 'Forgotten ')]"));
		forgot.click();
		
		Thread.sleep(5000);
		
		fb.navigate().back();
		
		WebElement create = fb.findElement(By.xpath("//a[text()='Create New Account']"));
		create.click();
		
		Thread.sleep(5000);
		
		fb.close();
		
		
	}

	
}
