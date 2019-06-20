package com.class03;
//TC 1: Facebook login:
//Open chrome browser
//Go to “https://www.facebook.com/”
//Enter valid username and valid password and click login
//User successfully logged in

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fcabook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/olgaturova/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
        
       driver.get("https://facebook.com");
       
        driver.findElement(By.id("email")).sendKeys("turovao33@gmail.com");
       driver.findElement(By.id("pass")).sendKeys("HappyLife");
        driver.findElement(By.id("loginbutton")).click();
        driver.quit();
		
		
		
	}

}
