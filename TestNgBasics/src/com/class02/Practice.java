package com.class02;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utils.CommonMethods;

public class Practice { 
	
	WebDriver driver;
	
	@BeforeMethod
	
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "/Users/olgaturova/Selenium/chromeDriver");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		
		
	}
	
	 @Test
	 public void googleTitileTest(){
		 String title=driver.getTitle();
		 System.out.println(title);
		 
	 }
	 @Test
	 public void googleLogoTest() {
		boolean logo = driver.findElement(By.xpath("//canvas[@style='cursor: default; height: 100%;'] ")).isDisplayed();
		 
		
	 }
	 @AfterMethod
	 public void tearDown() {
		 driver.close();
		 
	 }
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
