package com.class05;
//TC 1: Swag Labs Positive login:

//Open chrome browser
//Go to “https://www.saucedemo.com/”
//Enter valid username and valid password and click login
//Verify robot icon is displayed
//Verify “Products” text is available next to the robot icon

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1test {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/olgaturova/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.saucedemo.com");
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector("input.btn_action")).click();
		Thread.sleep(3000);
		boolean logo = driver.findElement(By.cssSelector("div.peek")).isDisplayed();
		if (logo) {
			System.out.println("The test is passed");
		} else {
			System.out.println("The test is failed");
		}
			// verify product text
			
			WebElement product = driver.findElement(By.cssSelector("div.product_label"));
			boolean displayP = product.isDisplayed();
			String productText = product.getText();

			String expectedText = "Products";
			if (displayP && productText.equals(expectedText)) {
				System.out.println("The product name is displayed and test is passed");
			} else {
				System.out.println("The product name is not displayed and test is failed");

			}

		}

	}


