package com.class08;
//Task for doubleClick
//Navigate to https://www.saucedemo.com
//senkeys  to the password textbox
//	 double click on the password text
//	 Close the browser 




import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class doubleClickTask extends CommonMethods {
	
	public static void main(String[] args) throws InterruptedException {
        setUpDriver("chrome","https://www.saucedemo.com/");;
        
        driver.findElement(By.cssSelector("input#user-name")).sendKeys("Musti");
    
        
        Actions action=new Actions(driver);
        WebElement musti=driver.findElement(By.cssSelector("input#user-name"));
        action.doubleClick(musti).perform();
        
        Thread.sleep(4000);
        
    
    
    }}

