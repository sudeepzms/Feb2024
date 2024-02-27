package com.driverDec;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyDriver {
	
	public static WebDriver driver;
	
	static {
//	System.setProperty("webdriver.chrome.driver",".\\src\\Drivers\\chromedriver.exe");
	System.setProperty("webdriver.chrome.driver", "E:\\TESTING\\Selenium_data\\chromedriver.exe");
	driver = new ChromeDriver();
	}
	
	public MyDriver()
	{
		
	}
	
	public static WebDriver getDriver()
	{
		return driver;
	}
}
