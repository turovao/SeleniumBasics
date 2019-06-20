package com.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//TC 1: JavaScript alert text verification
//Open chrome browser
//Go to “https://www.seleniumeasy.com/test/javascript-alert-box-demo.html”
//Verify
//alert box with text “I am an alert box!” is present
//confirm box with text “Press a button!” is present
//prompt box with text “Please enter your name” is present
//Quit browser

public class Task3 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/olgaturova/Selenium/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		driver.findElement(By.cssSelector("button[class='btn btn-default']")).click();
		Alert alert=driver.switchTo().alert();
		Thread.sleep(2000);
		String text=alert.getText();
		System.out.println("Text of confirm alert="+text);
		if(text.equalsIgnoreCase("I am an alert box!")) {
			alert.accept();
				
		}
		driver.findElement(By.cssSelector("button[onclick='myConfirmFunction()']")).click();
		Alert alert1=driver.switchTo().alert();
		String text1=alert1.getText();
		System.out.println("Text of the alert ="+text1);
		if(text1.equalsIgnoreCase("Press a button!")) {
			Thread.sleep(3000);
		 alert1.accept();
		 Thread.sleep(3000);
		}
		driver.findElement(By.cssSelector("button[onclick='myConfirmFunction()']")).click();
		Alert alert2=driver.switchTo().alert();
		String text2=alert2.getText();
		System.out.println("Text of the alert="+text2);
		 Thread.sleep(3000);
		if(text2.equalsIgnoreCase("Enter name")) {
			 Thread.sleep(3000);
			alert2.accept();
		}
	
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
