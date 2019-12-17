package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage {
		
		WebDriver driver;
	
		public loginPage(WebDriver ldriver) //This constructor will help us to initilize the driver, otherwise it wil not able to identify the driver
		{
			this.driver = ldriver;//ldriver comes from the main TC 
		}
		@FindBy(xpath="//a[@href='https://ui.freecrm.com']") WebElement BfLogin;
		@FindBy(name="email") WebElement uname;
		@FindBy(name="password") WebElement pass;
		//@FindBy(xpath="/html/body/div[1]/div/div/form/div/div[3]") WebElement loginButton;
		
		public void loginToCRM(String usernameApplication,String passwordApplication)
		{
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) 
			{
				//e.printStackTrace();
			}
			BfLogin.click();
			uname.sendKeys(usernameApplication);
			pass.sendKeys(passwordApplication);
			//loginButton.click();
			driver.findElement(By.xpath("/html/body/div[1]/div/div/form/div/div[3]")).click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				
			}
		}
		
}
