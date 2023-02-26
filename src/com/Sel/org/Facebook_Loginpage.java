package com.Sel.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Loginpage {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Surendhar\\eclipse-workspace\\Selenium_Browser_Launch\\Driver\\chromedriver.exe");
		
		WebDriver fb = new ChromeDriver();
		
		fb.manage().window().maximize();
		
		fb.get("https://www.facebook.com/");
		
		WebElement emailid = fb.findElement(By.id("email"));
		emailid.sendKeys("suren2696@gmail.com");
		
		
		WebElement password = fb.findElement(By.id("pass"));
		password.sendKeys("Suren@123$");
		
		
		WebElement Login = fb.findElement(By.name("login"));
		Login.click();
		
		
		String attribute = emailid.getAttribute("name");
		System.out.println(attribute);
		
	    String attribute1 = emailid.getAttribute("value");
		System.out.println(attribute1);
		
		
		boolean displayed = emailid.isDisplayed();
		System.out.println(displayed);
		
		
		
		boolean enabled = password.isEnabled();
		System.out.println(enabled);
	
		
		boolean selected = Login.isSelected();
		System.out.println(selected);
		
		
		Thread.sleep(2000);
		
		
		
		fb.quit();
		

	}

}
