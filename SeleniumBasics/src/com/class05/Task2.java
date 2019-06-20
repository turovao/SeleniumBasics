package com.class05;
//TC 2: Swag Labs Negative login:
//Open chrome browser
//Go to “https://www.saucedemo.com/”
//Enter invalid username and password and click login
//Verify error message contains: “Username and password do not match any user in this service”

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/olgaturova/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.saucedemo.com");
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector("input.btn_action")).click();
		Thread.sleep(3000);
		WebElement errorText=driver.findElement(By.xpath("//h3[@data-test='error']"));
		String value=errorText.getText();
		System.out.println(value);
		
		if(value.equals("Epic sadface: Username and password do not match any user in this service")) {
			System.out.println("The test is passed");
		}else {
			System.out.println("The test is fail");
			driver.quit();
		}
		
		
		
	}

}
