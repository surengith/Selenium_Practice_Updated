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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Surendhar\\eclipse-workspace\\Selenium_Browser_Launch\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Surendhar");

		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("P");
		
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("101 Independence Avenue, S.E.. Washington, D.C. 20559");
		
		driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("surendhar@gmail.com");
		
		driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("9443352021");
		
		WebElement gender = driver.findElement(By.xpath("//input[@value='Male']"));
		gender.click();
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOf(gender));
		
		driver.findElement(By.xpath("//input[@value='Movies']")).click();
		
		driver.findElement(By.id("msdd")).click();
		
		driver.findElement(By.xpath("//a[text() ='English']")).click();
	
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[text() ='French']")).click();
		
		WebElement selectskills = driver.findElement(By.id("Skills"));
		Select s=new Select(selectskills);
		s.selectByVisibleText("MySQL");
		
		driver.findElement(By.id("yearbox")).click();
		
		WebElement year = driver.findElement(By.id("yearbox"));
		Select y = new Select(year);
		y.selectByVisibleText("2010");
		
		WebElement month = driver.findElement(By.xpath("(//select[@type='text'])[4]"));
		Select m = new Select(month);
		m.selectByVisibleText("September");
		
		WebElement date = driver.findElement(By.id("daybox"));
		Select d = new Select(date);
		d.selectByValue("10");
		
		TakesScreenshot s1=(TakesScreenshot)driver;
		File screenshotAs = s1.getScreenshotAs(OutputType.FILE);
		File docs = new File("C:\\Users\\Surendhar\\eclipse-workspace\\Selenium_Browser_Launch\\Driver\\home.png");
		FileUtils.copyFile(screenshotAs, docs);
				
		
		
		Thread.sleep(3000);
		
		
		driver.close();
		
	}
	

}

