package com.class10;
//TC 1: Table headers and rows verification
//
//Open chrome browser
//Go to “https://the-internet.herokuapp.com/”
//Click on “Click on the “Sortable Data Tables” link
//Verify tables consist of 4 rows and 6 columns
//Print name of all column headers
//Print data of all rows

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class Task1  extends CommonMethods{
	public static void main(String[] args) {
		
		setUpDriver("chrome", "https://the-internet.herokuapp.com/");
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
		System.out.println("Numbers of rows is"+rows.size());
		Iterator<WebElement> it=rows.iterator();
		while(it.hasNext()) {
			String rowText=it.next().getText();
			System.out.println(rowText);
		
	}

	}}
////GET NUMBER OF ROWS
//		List <WebElement> rows=driver.findElements(By.xpath("//table[@summary='Sample Table']/tbody/tr"));
//		System.out.println("Number of rows ="+rows.size());
//		
//		System.out.println("-----------ROW DATA-----------------");
//		Iterator<WebElement> it=rows.iterator();
//		while(it.hasNext()) {
//			String rowText=it.next().getText();
//			System.out.println(rowText);
//		}
//		//GET NUMBER OF COLUMNS
//		List <WebElement> cols=driver.findElements(By.xpath("//table[@summary='Sample Table']/thead/tr/th"));
//		System.out.println("Number of colums ="+cols.size());
//		
//		System.out.println("-----------COLUMNS HEADERS-----------------");
//		for (WebElement col: cols) {
//			String colText=col.getText();
//			System.out.println(colText);
//		}
//
//		Thread.sleep(3000);
//		driver.quit();