package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Using Xpath ONLY
//TC 1: Facebook login:
//Open chrome browser
//Go to “https://www.facebook.com/”
//Enter valid username and valid password and click login
//User successfully logged in

public class HomeWork1 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/olgaturova/Selenium/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://facebook");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("turovao33@gmail.com");
		driver.findElements(By.xpath("//input[@type='password']".concat( )
		
	}

}