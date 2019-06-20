package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//TC 2: Syntax Page URL Verification:
//Open chrome browser
//Navigate to “https://www.syntaxtechs.com/”
//Navigate to “https://www.google.com/”
//Navigate back to Syntax Technologies Page
//Refresh current page
//Verify url contains “Syntax”
public class Syntax {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/olgaturova/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.syntaxtechs.com");
		Thread.sleep(1000);
		driver.navigate().to("https://google.com");
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().refresh();
		String getTitle=driver.getTitle();
		System.out.println(getTitle);
		if(getTitle.contains("Syntax")) {
			System.out.println("title does contain syntax");
		}else {
			System.out.println("title does not contain syntax");
		}
		driver.close();
		

	}

}

//----------------SECOND COICE BETER________________
//System.setProperty("webdriver.chrome.driver", "/Users/raafatali/Selenium/chromedriver");
//WebDriver driver=new ChromeDriver();
//driver.navigate().to("http://www.syntaxtechs.com");
//Thread.sleep(1000);
//driver.navigate().to("http://google.com");
//Thread.sleep(1000);
//driver.navigate().back();
//Thread.sleep(1000);
//driver.navigate().refresh();
//
//
//String url=driver.getCurrentUrl();
//if (url.contains("syntax")) {
//	System.out.println("Correct");
//	
//}else {
//	System.out.println("Not Correct");
//
//}
//driver.close();
//
//
//}}
//	
//
//
