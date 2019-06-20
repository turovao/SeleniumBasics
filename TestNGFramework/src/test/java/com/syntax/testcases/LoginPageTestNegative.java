package com.syntax.testcases;

import org.openqa.selenium.interactions.SendKeysAction;
import org.testng.annotations.Test;

import com.syntax.pages.LoginPage;
import com.syntax.pages.LoginPageWithoutPageFactory;
import com.syntax.utils.BaseClass;
import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class LoginPageTestNegative extends BaseClass{

	@Test
	public void loginToOrangeHRM() throws InterruptedException {
		LoginPageWithoutPageFactory login=new LoginPageWithoutPageFactory();
		
		CommonMethods.sendText(login.username, "Admin");
		CommonMethods.sendText(login.password, "06I@P 46756");
		CommonMethods.click(login.btnLogin);
		Thread.sleep(5000);
		
	}}
	