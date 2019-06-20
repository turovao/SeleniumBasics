package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookStartsWith {
	public static void main(String []args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/olgaturova/Selenium/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.facebook.com");
		driver.findElement(By.xpath("//input[starts-with(@id,'email')] ")).sendKeys("turovao33@gmail.com");
		driver.findElement(By.xpath("//input[starts-with(@id,'pas')]  ")).sendKeys("Happylife");
		driver.findElement(By.xpath("//input[starts-with(@type,'sub')]")).click();
		
		
		
	}

}
