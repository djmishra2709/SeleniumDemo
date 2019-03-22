package com.testBase;

import org.openqa.selenium.WebDriver;

public class CloseBrowser {
	
	public static WebDriver driver;
	
	public static void closeBrowser()
	{
		System.out.println("Closing browser1");
		driver.close();
	}

}
