package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

//         Navigate to https://www.toolsqa.com
//             Hover over the Tutorial menu
//             Click on Software Testing Tutorial
//             Close the browser

public class hoverPractice extends CommonMethods{

	public static void main(String[] args) {
	
        setUpDriver("chrome","https://www.toolsqa.com");
       WebElement tutorial= driver.findElement(By.xpath("//span[text()='Tutorial']"));
       
	}

}
