package com.homepagetestcase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectAction {
	
public static WebDriver driver;
@Test
	public void selectactions() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
		
		  DesiredCapabilities capabilities = new DesiredCapabilities();
		  capabilities = DesiredCapabilities.firefox();
		  capabilities.setBrowserName("firefox");
		  capabilities.setVersion("your firefox version");
		  capabilities.setPlatform(Platform.WINDOWS);
		  capabilities.setCapability("marionette", false);
		  driver = new FirefoxDriver(capabilities);
		  driver.manage().window().maximize();
		  driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		
		WebElement select = driver.findElement(By.xpath("//div[contains(text(),'Birthday')]/parent::div/div[2]//select[@id ='year']"));
		Select sel =new Select(select);
		List<WebElement>days = sel.getOptions();
		
		for(WebElement a :days)
		{
			//String option = a.getText();
			String option = a.getAttribute("value");
			if(option.contains("2000"))
			{
				sel.selectByValue(option);
			}
		}
		Thread.sleep(5000);
		driver.close();
		
	}
}
