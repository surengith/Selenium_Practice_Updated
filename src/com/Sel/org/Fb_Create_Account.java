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
import org.openqa.selenium.support.ui.Select;


public class Fb_Create_Account {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Surendhar\\eclipse-workspace\\Selenium_Browser_Launch\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement create = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		create.click();
		
		Thread.sleep(2000);
		
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		firstname.sendKeys("Surendhar");
		
		WebElement surname = driver.findElement(By.xpath("//input[@name='lastname']"));
		surname.sendKeys("P");
		
		WebElement emailid = driver.findElement(By.xpath("(//input[@name='reg_email__'])[1]"));
		emailid.sendKeys("suren2696@gmail.com");
		
		WebElement emailid1 = driver.findElement(By.xpath("(//input[@name='reg_email_confirmation__'])[1]"));
		emailid1.sendKeys("suren2696@gmail.com");
		
		WebElement password = driver.findElement(By.id("password_step_input"));
		password.sendKeys("123456");
		
		WebElement day = driver.findElement(By.id("day"));
		Select d=new Select(day);
		d.selectByIndex(00);
		
		WebElement month = driver.findElement(By.id("month"));
		Select m = new Select(month);
		m.selectByValue("1");
		
		WebElement year = driver.findElement(By.id("year"));
		Select y = new Select(year);
		y.selectByVisibleText("2010");
		
		WebElement gender = driver.findElement(By.xpath("//label[text()='Male']"));
		gender.click();
		
		WebElement submit = driver.findElement(By.xpath("//button[@name='websubmit']"));
		submit.click();
		
		Thread.sleep(2000);
		
		TakesScreenshot s = (TakesScreenshot)driver;
		File source = s.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Surendhar\\Downloads\\facebook.png");
		FileUtils.copyFile(source, destination);
		
		Thread.sleep(3000);
		
		driver.close();
		

	}

	

}
