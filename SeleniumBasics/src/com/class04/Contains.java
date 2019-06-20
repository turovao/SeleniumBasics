package com.class04;
//Task Enter the username with either contains or starts-with xpath

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contains {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/olgaturova/Selenium/chromedriver");
		WebDriver driver=new ChromeDriver();
		
driver.get("http://www.saucedemo.com/");
		

		
		driver.findElement(By.xpath("//input[starts-with(@id,'user-name')]")).sendKeys("standard_user");

        driver.findElement(By.xpath("//input[starts-with(@id,'password')]")).sendKeys("secret_sauce");

        driver.findElement(By.xpath("//input[starts-with(@value,'LOGI')]")).click();

        Thread.sleep(3000);

        driver.quit();
	
}}