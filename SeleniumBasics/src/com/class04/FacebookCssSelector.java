package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookCssSelector {
 public static void main(String []args) throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "/Users/olgaturova/Selenium/chromedriver" );
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("http://www.facebook.com");
	  driver.findElement(By.cssSelector("input[type='email']")).sendKeys("turovao33@gmail.com");
	  Thread.sleep(2000);
	  driver.findElement(By.cssSelector("input[id$='ss']")).sendKeys("Happylife");
	  Thread.sleep(2000);
	  driver.findElement(By.cssSelector("input[type='submit']")).click();
 }
}
