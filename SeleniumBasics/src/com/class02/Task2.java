package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 { 
	public static void main(String[] args) throws InterruptedException {
		
	
		System.setProperty("webdriver.chrome.driver", "/Users/olgaturova/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
		driver.findElement(By.id("customer.firstName")).sendKeys("olga");
		Thread.sleep(3000);
		driver.findElement(By.name("customer.lastName")).sendKeys("tou");
		Thread.sleep(3000);
		driver.findElement(By.id("customer.address.street")).sendKeys("123Seminary");
		Thread.sleep(3000);
		driver.findElement(By.id("customer.address.city")).sendKeys("Alexandria");
		Thread.sleep(3000);
		driver.findElement(By.name("customer.address.state")).sendKeys("VA");
		Thread.sleep(3000);
		driver.findElement(By.id("customer.address.zipCode")).sendKeys("12345");
		Thread.sleep(3000);
		driver.findElement(By.name("customer.phoneNumber")).sendKeys("123-234-7890");
		Thread.sleep(3000);
		driver.findElement(By.id("customer.ssn")).sendKeys("000-00-9999");
		Thread.sleep(3000);
		driver.findElement(By.id("customer.username")).sendKeys("toutou");
		Thread.sleep(3000);
		driver.findElement(By.id("customer.password")).sendKeys("abs12345");
		Thread.sleep(3000);
		driver.findElement(By.id("repeatedPassword")).sendKeys("abs12345");
		Thread.sleep(3000);
		driver.findElement(By.className("button")).click();
		Thread.sleep(3000);
		
		
		

	}

}