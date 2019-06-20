package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Test {
	
	public static void main(String[] args) {
	    System.setProperty("webdriver.gecko.driver","/Users/olgaturova⁩/Selenium/geckodriver");
	    WebDriver driver =new FirefoxDriver();
	    driver.navigate().to("http://google.com");
	    driver.navigate().to("http://www.amazon.com");
	    System.out.println(driver.getTitle());
	    String title=driver.getTitle();
	    if(title.equalsIgnoreCase("amazon.com")) {
	        System.out.println("Correct title ");
	    }else {
	        System.out.println("incorrect title");
	    }
	    
	}
	}