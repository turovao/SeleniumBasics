package com.class05;

//TC 1: Amazon link count:
//Open chrome browser
//Go to “https://www.amazon.com/”
//Using Iterator get text of each link
//Get number of links that has text



import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.stylesheets.LinkStyle;

public class Task3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/olgaturova/Selenium/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.amazon.com/");
		//capture all links
		List <WebElement> links=driver.findElements(By.tagName("a"));
		int count=0;
		
		Iterator<WebElement> linksIt=links.iterator();
		while(linksIt.hasNext()) {
			String linkText=linksIt.next().getText();
			if (!linkText.isEmpty()) {
				System.out.println(linkText); 
				count++;
			}
		}
		System.out.println("Total # of links with text "+count);
		driver.quit(); 
	}
}