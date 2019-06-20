package com.class04;

import org.openqa.selenium.By;

//TC 2: Mercury Tours Registration:
//Open chrome browser
//Go to “http://newtours.demoaut.com/”
//Click on Register Link
//Fill out all required info
//Click Submit
//User successfully registered
//(Create 2 scripts using different locators)

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MercuryStartsWith {
	
	public static void main(String [] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/olgaturova/Selenium/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.linkText("REGISTER")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[contains(@name,'firstName')]")).sendKeys("Olga");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[contains(@name,'lastName')]")).sendKeys("Happy");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[starts-with(@name,'ph')]")).sendKeys("222-567-9999");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[starts-with(@id,'user')]")).sendKeys("test@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[contains(@name,'address1')]")).sendKeys("123Test st");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[starts-with(@name,'cit')]")).sendKeys("Alexandria");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[contains(@name,'state')] ")).sendKeys("Virginia");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[starts-with(@name,'postal')]")).sendKeys("22255");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("tou");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[starts-with(@name,'passw')]")).sendKeys("raf");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[starts-with(@name,'confirm')]")).sendKeys("raf");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[contains(@name,'register')]")).click();
	}

}
