package com.homepagetestcase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.testBase.CloseBrowser;
import com.testBase.LaunchBrowser;

public class FillformTestCase {
	
public static WebDriver driver;

	@Parameters({"URL"})
	@BeforeTest
	public void lauchURL(String URL)
	{
		LaunchBrowser.launch(URL);
		
	}


	@Test
	public void selectactions() throws InterruptedException
	{
		
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
		
		
	}
	
	@AfterTest
	public void closeBrowser()
	{
		CloseBrowser.closeBrowser();
	}
}
