package com.Sel.org;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test_MultipleDropDown {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Surendhar\\eclipse-workspace\\Selenium_Browser_Launch\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		WebElement multiple = driver.findElement(By.xpath("(//select)[6]"));
		Select m = new Select(multiple);
		boolean b = m .isMultiple();
		System.out.println("Is multiple:-" + b);
		
		m.selectByIndex(1);
		m.selectByValue("2");
		m.selectByVisibleText("Loadrunner");
		m.deselectByIndex(3);
		
		System.out.println("--------------get option---------------");
		
		List<WebElement> option = m.getOptions();
		for(WebElement all:option) {
			String text=all.getText();
			System.out.println(text);
		}
		
		System.out.println("-----------get all selected option------------");
		
		List<WebElement> allselectoption = m.getAllSelectedOptions();
		for(WebElement allselected:allselectoption) {
			String text = allselected.getText();
			System.out.println(text);
		}
		
		System.out.println("------------get first selected option-------------");
		
		WebElement firstselectedoption = m.getFirstSelectedOption();
		String text = firstselectedoption.getText();
		System.out.println(text);
		
		TakesScreenshot s = (TakesScreenshot)driver;
		File as = s.getScreenshotAs(OutputType.FILE);
		File Ds = new File("C:\\Users\\Surendhar\\Downloads\\name.png");
		FileUtils.copyFile(as, Ds);
		
		
		Thread.sleep(3000);
		
		
		driver.close();

	}
	

}
