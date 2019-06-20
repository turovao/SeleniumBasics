package com.class10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class GroupTask1 extends CommonMethods {
	/*
	 * TC 1: Users Application Form Fill 1.Open chrome browser 2.Go to
	 * “http://uitestpractice.com/” 3.Click on “Forms” link 4.Fill out the entire
	 * form 5.Close the browser MUST USE Functions:
	 */
	public static void main(String[] args) throws InterruptedException {
		// 1/2- Launching Browser and Website
		setUpDriver("chrome", "http://uitestpractice.com");
		Thread.sleep(1000);
		
		// 3- Clicking on Forms Tab
		driver.findElement(By.xpath("//a[text()='Form']")).click();
		
		// Adding First name and Last name
		sendText(driver.findElement(By.cssSelector("input#firstname")), "Hussain");
		sendText(driver.findElement(By.cssSelector("input#lastname")), "Ahmad");
		Thread.sleep(1000);
		
		// Selecting Radio Button By using Function
		selectRadio(driver.findElement(By.xpath("//label[3]/input[@name='optradio']")));
		Thread.sleep(1000);
		
		// Selecting CheckBox By using Function
		selectCheckBox(driver.findElement(By.xpath("//input[@value='cricket']")));
		Thread.sleep(1000);
		
		// Selecting DropDown By using Function
		selectValueFromDD(driver.findElement(By.cssSelector("select#sel1")), "Canada");
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		Thread.sleep(1000);
		
		// Selecting Date
		String expectedDate = "17";
		selectValueFromDD(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")), "Apr");
		selectValueFromDD(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")), "1995");
		List<WebElement> cells = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));

		for (WebElement cell : cells) {
			String cellText = cell.getText();
			if (cellText.equals(expectedDate)) {
				cell.click();
			}
		}
		Thread.sleep(1000);
		
		// Providing Phone NUmber
		sendText(driver.findElement(By.cssSelector("input#phonenumber")), "2403743578");
		Thread.sleep(1000);
		
		// Providing UserName
		sendText(driver.findElement(By.cssSelector("input#username")), "hussain95");
		Thread.sleep(1000);
		
		// Providing Email Address
		sendText(driver.findElement(By.cssSelector("input#email")), "hahmad95@gmail.com");
		Thread.sleep(1000);
		
		// About YourSelf
		sendText(driver.findElement(By.cssSelector("textarea#comment")),
				"I am a student at Syntax Technologies and I am learning Software Testing");
		Thread.sleep(1000);
		
		// Providing Password
		sendText(driver.findElement(By.cssSelector("input#pwd")), "test123");
		Thread.sleep(1000);
		
		// Clicking Submit
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		Thread.sleep(2000);
		driver.quit();
	}
}
