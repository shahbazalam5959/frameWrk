package com.automation.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.pages.BaseClass;
import com.automation.pages.loginPage;
import com.automation.utility.BrowserFactory;
import com.automation.utility.ExcelDataProvider;

public class LoginTestCRM extends BaseClass{
	
	
	
	@Test
	public void Login()//Eg:of Abstraction
	{	
		logger=report.createTest("Login to CRM");
		
		loginPage Loginpage = PageFactory.initElements(driver, loginPage.class);// it vl go to loginPage chk all the locators it vl initilize and once all is done,it vl return the object of same class
		
		logger.info("Starting Application");
	
		Loginpage.loginToCRM(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));
		
		logger.pass("Login Success");
	}

	
}
