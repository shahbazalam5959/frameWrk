package com.automation.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TCwithoutFrameWork {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shahzad\\Desktop\\Selenium Webdriver Tutorial Basics+Advanced+Interview Guide\\Browswer_Driver\\chromedriver3.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://Athomediva.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/form/div[2]/div/div[1]/div/div/input")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/form/div[2]/div/div[1]/div/div/ul/li[2]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/form/div[2]/div/div[2]/div/div/input")).sendKeys("Adyar");
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/form/div[2]/div/div[2]/div/div/ul/li[1]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/form/div[2]/div/div[3]/div/div/button")).click();
		driver.findElement(By.xpath("//a[text()='Sign In']")).click();
		driver.findElement(By.id("mobile")).sendKeys("7003800041");
		driver.findElement(By.id("login")).click();
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[3]/div[1]/div[3]/div/div/div[1]/div/div[2]/a/div/i")).click();
		
	}

}
