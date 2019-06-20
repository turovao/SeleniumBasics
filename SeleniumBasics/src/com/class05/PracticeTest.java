package com.class05;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.class03.LinkText;

public class PracticeTest {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/olgaturova/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.yahoo.com/");
		List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
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