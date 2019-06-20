package com.class07;

import org.openqa.selenium.By;

import utils.CommonMethods;

public class iftameTask extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*
		 * Open chrome browser
Go to “https://www.toolsqa.com/iframe-practice-page/”
Click on “ Guest Blogs” link inside first frame
Verify element “Interactions” is present in second frame
Navigate to Home Page
Quit browser

		 */
		CommonMethods.setUpDriver("chrome", "https://www.toolsqa.com/iframe-practice-page/");
		driver.switchTo().frame("IF1");
		driver.findElement(By.xpath("//a[text()='Git Log']")).click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.switchTo().frame(1);
		Thread.sleep(3000);
		boolean inter = driver.findElement(By.xpath("//h3[text()='Interactions']")).isDisplayed();
		if(inter==true) {
			Thread.sleep(3000);
			driver.switchTo().defaultContent();
			Thread.sleep(3000);
			driver.close();
		}
		
		

	}

}




