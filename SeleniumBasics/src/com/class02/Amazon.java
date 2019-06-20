package com.class02;
//TC 1: Amazon Page Title Verification:

//Open chrome browser
//Go to “https://www.amazon.com/”
//Verify Title “Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more” 
//is displayed

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/olgaturova/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://amazon.com");
		String title =driver.getTitle();
		String actual=title;
		String expected=("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
		if (expected.equalsIgnoreCase(actual)) {
			System.out.println("valid title");
		} else { }
	}	
}