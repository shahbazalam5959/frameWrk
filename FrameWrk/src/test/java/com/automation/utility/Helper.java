package com.automation.utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {

		//screenshot,Alert,frames,windows,sync issue,javascript executor.
	
		public static String captureScreenshot(WebDriver driver)
		{
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			String screenshotPath=System.getProperty("user.dir")+"/Screenshots/FreeCRM_"+getCurrentDateTime()+".png";
			
			System.out.println("Screenshot captured!");
			
			try {
				
				FileHandler.copy(src, new File(screenshotPath));
			
				} 
			catch (IOException e) {
				
				System.out.println("Unable to capture screenshot "+e.getMessage());
			}
			
			return screenshotPath;
		}

		public static String getCurrentDateTime()
		{
			DateFormat df = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
			
			Date currentDate = new Date();
			
			return df.format(currentDate);
		}
		

}



