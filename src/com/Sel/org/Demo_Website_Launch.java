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

public class Demo_Website_Launch {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Surendhar\\eclipse-workspace\\Selenium_Browser_Launch\\Driver\\chromedriver.exe");
		
		WebDriver demo = new ChromeDriver();
		
		
		demo.manage().window().maximize();
		
		
		demo.get("http://demowebshop.tricentis.com/register");
		
		
		WebElement gender = demo.findElement(By.xpath("//input[@id = 'gender-male']"));
		gender.click();
		
		WebElement firstname = demo.findElement(By.xpath("//input[@id = 'FirstName']"));
		firstname.sendKeys("Surendhar");
		
		WebElement lastname = demo.findElement(By.xpath("//input[@id = 'LastName']"));
		lastname.sendKeys("P");
		
		WebElement email = demo.findElement(By.xpath("//input[@name = 'Email']"));
		email.sendKeys("suren2696@gmail.com");
		
		WebElement password = demo.findElement(By.xpath("//input[@name = 'Password']"));
		password.sendKeys("Suren@123$");

		WebElement password1 = demo.findElement(By.xpath("//input[@name = 'ConfirmPassword']"));
		password1.sendKeys("Suren@123$");
		
		WebElement register = demo.findElement(By.xpath("//input[@id = 'register-button']"));
		register.click();
		
		
		TakesScreenshot login = (TakesScreenshot) demo;
		File Screen = login.getScreenshotAs(OutputType.FILE);
		File Destination = new File ("C:\\Users\\Surendhar\\Downloads\\Register.png");
		FileUtils.copyFile(Screen, Destination);
			
		
		Thread.sleep(10000);
		
		demo.close();
		
		
	}

}
