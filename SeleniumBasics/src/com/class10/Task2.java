package com.class10;
//TC 1: Table headers and rows verification
//
//Open chrome browser
//Go to “http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx”
//Login to the application
//Verify customer “Susan McLaren” is present in the table
//Click on customer details
//Update customers last name
//Verify updated customers name is displayed in table
//Close browser

import utils.CommonMethods;

public class Task2 extends CommonMethods {
	public static void main(String[] args) {
		
		setUpDriver("chrome", "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
		
		
		
		
	}

}
