package com.class09;

//TC 2: Verify element is clickable1.Open chrome browser2.Go to “https://the-internet.herokuapp.com/”3.Click on 
//	“Click on the “Dynamic Controls” link4.Select checkbox and click Remove5.Click on Add button and verify 
//	“It's back!” text is displayed6.Close the browser

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.CommonMethods;

public class Task2 extends CommonMethods {
	
	
	public static void main(String[] args) {
		String url="https://the-internet.herokuapp.com/";
		setUpDriver("chrome", url);
	        driver.findElement(By.linkText("Dynamic Controls")).click();
	        WebElement ele=driver.findElement(By.xpath("//input[@type='checkbox']"));
	        if(ele.isEnabled()) {
	            ele.click();
	            }else {
	                System.out.println("element is NOT enabled");
	            }
	        
	        ele=driver.findElement(By.xpath("//button[text()='Remove']"));
	        ele.click();
	        WebDriverWait wait=new WebDriverWait(driver,20);
	        wait.until(ExpectedConditions.visibilityOf(ele));
	        
	        if(ele.isDisplayed()) {
	            String text=ele.getText();
	            System.out.println(text);
	            
	        }else {
	            System.out.println(" element is Not displayed");
	        }
	        
	        ele=driver.findElement(By.xpath("//button[text()='Add']"));
	        ele.click();
	        wait.until(ExpectedConditions.visibilityOf(ele));
	        if(ele.isDisplayed()) {
	            String text=ele.getText();
	            System.out.println(text);
	            
	        }else {
	            System.out.println(" element is Not displayed");
	        }
	        driver.quit();
}}

