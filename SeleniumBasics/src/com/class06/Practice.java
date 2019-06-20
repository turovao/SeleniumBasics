package com.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/olgaturova/Selenium/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		driver.findElement(By.cssSelector("button[class='btn btn-default']")).click();
		Alert alert=driver.switchTo().alert();
		String text=alert.getText();
		System.out.println("The text of the alert is "+text);
		if(text.equalsIgnoreCase("I am an alert box!")) {
			alert.accept();
			
		}
		
		driver.findElement(By.cssSelector("button[onclick='myConfirmFunction()']")).click();
		Alert alert1=driver.switchTo().alert();
		String text1=alert1.getText();
		System.out.println("The text of the alert is "+text1);
		if(text1.equalsIgnoreCase("Press a button!")) {
		alert1.accept();
		
		driver.quit();
		}
	}

}
