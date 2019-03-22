package com.datadriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	public static WebDriver driver;
	
	public static void Simplewaits(int option) 
	{
		
		driver.manage().timeouts().implicitlyWait(option,TimeUnit.SECONDS);
		

	}

	
	
	public static void Conditionwaits(int option, WebElement element) 
	{
		
		WebDriverWait wait = new WebDriverWait(driver, option);
		wait.until(ExpectedConditions.visibilityOfElementLocated((By) element));
		

	}
}
