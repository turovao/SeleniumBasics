package com.class06;
//TC 1: Amazon Department List Verification
//Open chrome browser
//Go to “http://amazon.com/”
//Verify how many department options available.
//Print each department
//Select Computers
//Quit browser

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task1 { 
	

		public static void main(String[] args) throws InterruptedException {
		        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mrlep\\Selenium\\chromedriver.exe");
		        WebDriver driver = new ChromeDriver();
		        driver.manage().window().fullscreen();
		        driver.get("http://amazon.com/");
		    WebElement Department=    driver.findElement(By.cssSelector("select#searchDropdownBox"));
		    Select select = new Select(Department);
		    List<WebElement> allDep = select.getOptions();

		    System.out.println("# of option in Department=" + allDep.size());

		    System.out.println("------ all options from Department -------");

		    Iterator<WebElement> it = allDep.iterator();

		    while (it.hasNext()) {

		        String obj = it.next().getText();

		        System.out.println(obj);

		    }
		    select.selectByVisibleText("Computers");

		    Thread.sleep(3000);
		    driver.quit();
		    }

		}
		
	


