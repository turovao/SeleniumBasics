package com.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utils.CommonMethods;

public class TaskOnRediff {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/olgaturova/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		System.out.println(alert.getText());
		Thread.sleep(3000);
		String text=alert.getText();
		if(text.equalsIgnoreCase("Please enter a valid user name")) {
			System.out.println("Its a correct alert massage");
			
		}else {
			System.out.println("Its an incorrect aler massage");
		}
		Thread.sleep(3000);
		alert.accept();

		driver.close();

	}

}
//Thread.sleep(3000);