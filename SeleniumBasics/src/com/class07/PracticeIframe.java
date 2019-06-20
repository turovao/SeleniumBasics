package com.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class PracticeIframe extends CommonMethods {
	public static void main(String[] args) throws InterruptedException {
		
		CommonMethods.setUpDriver("chrome", "http://uitestpractice.com/Students/Switchto");
		Thread.sleep(2000);
		//find frame with name /id
//		driver.switchTo().frame("iframe_a");
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("input#name")).sendKeys("olga");
//		Thread.sleep(2000);
//		
		
		//find with webElement
		WebElement ele=driver.findElement(By.xpath("//iframe[@name='iframe_a']"));
		
		driver.switchTo().frame(ele);
		driver.findElement(By.cssSelector("input#name")).sendKeys("olga");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.quit();
	}}


