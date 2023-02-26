package com.Sel.org;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mini_Project_Adactin {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Surendhar\\eclipse-workspace\\Selenium_Browser_Launch\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://adactinhotelapp.com/");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Login page:

		driver.findElement(By.id("username")).sendKeys("surencrazy");

		driver.findElement(By.id("password")).sendKeys("Suren@123$");

		WebElement login = driver.findElement(By.id("login"));
		login.click();

		// Booking Page:

		WebElement location = driver.findElement(By.id("location"));
		Select s = new Select(location);
		s.selectByIndex(7);

		WebElement hotels = driver.findElement(By.id("hotels"));
		Select s1 = new Select(hotels);
		s1.selectByVisibleText("Hotel Cornice");

		WebElement roomtype = driver.findElement(By.id("room_type"));
		Select s2 = new Select(roomtype);
		s2.selectByValue("Super Deluxe");

		WebElement roomnos = driver.findElement(By.id("room_nos"));
		Select s3 = new Select(roomnos);
		s3.selectByValue("6");

		WebElement dtpickin = driver.findElement(By.xpath("//input[@name='datepick_in']"));
		dtpickin.sendKeys("25/08/2022");

		WebElement dtpickout = driver.findElement(By.xpath("//input[@name='datepick_out']"));
		dtpickout.sendKeys("28/08/2022");

		WebElement adultroom = driver.findElement(By.id("adult_room"));
		Select s4 = new Select(adultroom);
		s4.selectByVisibleText("3 - Three");

		WebElement childroom = driver.findElement(By.xpath("//select[@name='child_room']"));
		Select s5 = new Select(childroom);
		s5.selectByValue("2");

		TakesScreenshot ts = (TakesScreenshot) driver;
		File as = ts.getScreenshotAs(OutputType.FILE);
		File ds = new File("C:\\Users\\Surendhar\\eclipse-workspace\\Selenium_Browser_Launch\\Driver\\booking.png");
		FileUtils.copyFile(as, ds);

		driver.findElement(By.id("Submit")).click();

		TakesScreenshot ts1 = (TakesScreenshot) driver;
		File as1 = ts1.getScreenshotAs(OutputType.FILE);
		File ds1 = new File(
				"C:\\Users\\Surendhar\\eclipse-workspace\\Selenium_Browser_Launch\\Driver\\bookingconformation.png");
		FileUtils.copyFile(as1, ds1);
		
		// Select Hotel Page:

		driver.findElement(By.id("radiobutton_0")).click();

		driver.findElement(By.id("continue")).click();

		TakesScreenshot ts2 = (TakesScreenshot) driver;
		File as2 = ts2.getScreenshotAs(OutputType.FILE);
		File ds2 = new File("C:\\Users\\Surendhar\\eclipse-workspace\\Selenium_Browser_Launch\\Driver\\bookahotel.png");
		FileUtils.copyFile(as2, ds2);

		// Booking Confirmation Page:

		driver.findElement(By.id("first_name")).sendKeys("Surendhar");

		driver.findElement(By.id("last_name")).sendKeys("P");

		driver.findElement(By.id("address")).sendKeys("6601 S SAN PEDRO LOS ANGELES CA 90003-1937. USA");

		driver.findElement(By.id("cc_num")).sendKeys("1234-5425-2525-6666");

		WebElement cctype = driver.findElement(By.id("cc_type"));
		Select s6 = new Select(cctype);
		s6.selectByValue("MAST");

		WebElement expmnth = driver.findElement(By.id("cc_exp_month"));
		Select s7 = new Select(expmnth);
		s7.selectByVisibleText("September");

		WebElement expyr = driver.findElement(By.id("cc_exp_year"));
		Select s8 = new Select(expyr);
		s8.selectByIndex(12);

		driver.findElement(By.id("cc_cvv")).sendKeys("678");

		driver.findElement(By.id("book_now")).click();

		TakesScreenshot ts3 = (TakesScreenshot) driver;
		File as3 = ts3.getScreenshotAs(OutputType.FILE);
		File ds3 = new File("C:\\Users\\Surendhar\\eclipse-workspace\\Selenium_Browser_Launch\\Driver\\bookahotel1.png");
		FileUtils.copyFile(as3, ds3);

		Thread.sleep(5000);

		driver.findElement(By.id("my_itinerary")).click();

		// Logout Page:

		driver.findElement(By.xpath("//input[@type='checkbox']")).click();

		driver.findElement(By.xpath("//input[@type='submit']")).click();

		driver.findElement(By.id("logout")).click();

		TakesScreenshot ts4 = (TakesScreenshot) driver;
		File as4 = ts4.getScreenshotAs(OutputType.FILE);
		File ds4 = new File("C:\\Users\\Surendhar\\eclipse-workspace\\Selenium_Browser_Launch\\Driver\\logout.png");
		FileUtils.copyFile(as4, ds4);

		Thread.sleep(3000);

		driver.close();

	}

}
