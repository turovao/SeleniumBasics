package com.class10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

//TC 1: Table headers and rows verification1.Open chrome browser
//2.Go to “https://jqueryui.com/”
//3.Click on 	“Datepicker”
//4.Select August 10 of 2019
//5.Verify date “08/10/2019” has been entered succesfully
//6.Close browser

public class GroupTask3 extends CommonMethods {
	
	
		public static void main(String[] args) throws InterruptedException {
			// Initializing Variables
			String month = "August";
			String expectedDate = "10";

			    // 1- Launching Browser and Website
			setUpDriver("chrome", "https://jqueryui.com");

			    // 2- Clicking on Datepicker
			driver.findElement(By.xpath("//a[text()='Datepicker']")).click();

			        // Switching to frame
			WebElement frame = driver.findElement(By.cssSelector("iframe.demo-frame"));
			driver.switchTo().frame(frame);
			
	            //3- Selecting date August 10 of 2019
			
			WebElement date = driver.findElement(By.cssSelector("input#datepicker"));
			date.click();
			while (true) {
				String text = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div/span")).getText();

				if (text.equals(month)) {
					break;
				} else {
					driver.findElement(By.xpath("//span[text()='Next']")).click();
				}
			}
			// Getting all values in cell
			
			List<WebElement> cells = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
			for (WebElement cell : cells) {
				String cellText = cell.getText();
				if (cellText.equals(expectedDate)) {
					cell.click();
				}
			}
			// 4- Verifying date
			
			String dateToBe = "08/10/2019";
			String verifyDate = driver.findElement(By.xpath("//input[@id='datepicker']")).getAttribute("value");
			if (dateToBe.equals(verifyDate)) {
				System.out.println("Date  " + dateToBe + " been entered successfully");
			} else {
				System.out.println("Date has not been entered successfully");
			}

			Thread.sleep(2000);
			driver.close();
		}}