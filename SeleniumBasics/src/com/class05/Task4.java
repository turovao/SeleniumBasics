package com.class05;
//* Check all Years of Experience radio buttons are clickable
//* -----------------------------------------------
//* Check all Automation Tools checkboxes are clickable
//* and keep “Selenium WebDriver” option as selected



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {
/*
 * Check all Years of Experience radio buttons are clickable 
 * -----------------------------------------------
 * Check all Automation Tools checkboxes are clickable 
 * and keep “Selenium WebDriver” option as selected
 */
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/olgaturova/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		
		List<WebElement> radioExp=driver.findElements(By.xpath("//input[@name='exp']"));
		for (WebElement radio: radioExp) {
			if(radio.isEnabled()) {
				radio.click();
				Thread.sleep(2000);
			}
		}
		driver.quit();
	}
}




