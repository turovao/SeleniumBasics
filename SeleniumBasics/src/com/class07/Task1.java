package com.class07;

import org.openqa.selenium.By;

import utils.CommonMethods;

//TC 1: ToolsQA Frame verification
//Open chrome browser
//Go to “https://www.toolsqa.com/iframe-practice-page/”
//Click on “Blogs” link inside first frame
//Verify element “Interactions” is present in second frame
//Navigate to Home Page
//Quit browser
public class Task1 extends CommonMethods {
	

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			CommonMethods.setUpDriver("chrome", "http://uitestpractice.com/Students/Switchto");
			
			driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='iframe_a']")));
			
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Tom");
			
			driver.switchTo().defaultContent();
			
			boolean Switch =driver.findElement(By.xpath("//h2[text()='SwitchTo']")).isDisplayed();
			if(Switch==true) {
				driver.close();	
			}
			
		

		}