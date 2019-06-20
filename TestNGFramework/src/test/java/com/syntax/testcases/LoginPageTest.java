package com.syntax.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.SendKeysAction;
import org.testng.annotations.Test;

import com.syntax.pages.LoginPage;
import com.syntax.pages.LoginPageWithoutPageFactory;
import com.syntax.utils.BaseClass;
import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class LoginPageTest extends BaseClass{

	@Test
	public void loginToOrangeHRM() {
		LoginPageWithoutPageFactory login=new LoginPageWithoutPageFactory();
		
		CommonMethods.sendText(login.username, "Admin");
		CommonMethods.sendText(login.password, "06I@PjFbgM"); 
		CommonMethods.click(login.btnLogin);
		
	}
	
	@Test
	public void doLogin() throws InterruptedException {
		LoginPage login=new LoginPage();
		CommonMethods.sendText(login.userName, ConfigsReader.getProperty("username"));
		CommonMethods.sendText(login.password, ConfigsReader.getProperty("password"));
		CommonMethods.click(login.loginBtn); 
		 
		 
	}
}
