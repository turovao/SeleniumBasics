package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/olgaturova/Selenium/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		WebElement maleRadio=driver.findElement(By.id("sex-0"));
		System.out.println(maleRadio.isDisplayed());//true
		System.out.println(maleRadio.isEnabled());//true
		System.out.println(maleRadio.isSelected());//false
		// 1 way of clicking on the element
		maleRadio.click();
		System.out.println(maleRadio.isSelected());//true
		Thread.sleep(2000);
		driver.quit();
		
	}
}