package com.homepagetestcase;

import java.util.List;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DynamicTable {

	public static WebDriver driver;
	@BeforeTest
	public void before()
	{
		System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
		//WebDriver driver =new FirefoxDriver();
		  DesiredCapabilities capabilities = new DesiredCapabilities();
		  capabilities = DesiredCapabilities.firefox();
		  capabilities.setBrowserName("firefox");
		  capabilities.setVersion("your firefox version");
		  capabilities.setPlatform(Platform.WINDOWS);
		  capabilities.setCapability("marionette", false);
		  driver = new FirefoxDriver(capabilities);
		  driver.manage().window().maximize();
	}
	@Test(enabled=false)
	public void tablehandle() throws InterruptedException
	{
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(5000);
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id = 'customers']/tbody/tr"));
		int row = rows.size();
		System.out.println("Total rows in table : "+row);
		List<WebElement> cols = driver.findElements(By.xpath("//table[@id = 'customers']/tbody/tr[1]/th"));
		int col  = cols.size();
		System.out.println("Total rows in table : "+col);
		String header = "Country";
		
		if(header.equalsIgnoreCase("Company"))
		{
			for(int i = 1 ;i<row;i++)
			{
				String value = driver.findElement(By.xpath("//table[@id = 'customers']/tbody/tr[1]/th[contains(text(),'"+header+"')]/parent::tr/following-sibling::tr["+i+"]/td[1]")).getText();
				System.out.println(value);
			}
			
		}
		
		else if(header.equalsIgnoreCase("Contact"))
		{
			for(int i = 1 ;i<row;i++)
			{
				String value = driver.findElement(By.xpath("//table[@id = 'customers']/tbody/tr[1]/th[contains(text(),'"+header+"')]/parent::tr/following-sibling::tr["+i+"]/td[2]")).getText();
				System.out.println(value);
			}
			
		}
		
		else if(header.equalsIgnoreCase("Country"))
		{
			for(int i = 1 ;i<row;i++)
			{
				String value = driver.findElement(By.xpath("//table[@id = 'customers']/tbody/tr[1]/th[contains(text(),'"+header+"')]/parent::tr/following-sibling::tr["+i+"]/td[3]")).getText();
				System.out.println(value);
			}
			
		}
		else
			System.out.println("Enter valid header name");
			
		
	}
	@Test
	public void checkboxTable() throws InterruptedException
	{
		driver.get("https://www.oracle.com/webfolder/technetwork/jet/jetCookbook.html?component=table&demo=checkboxSelectableTable");
		Thread.sleep(15000);

		String xpath1 = "//th[@id ='table:_hdrCol2']/parent::tr/parent::thead/parent::table/tbody/tr[1]//td[4]/preceding-sibling::td[2]//input";
		driver.findElement(By.xpath(xpath1)).click();
				/*System.out.println(rows);
		for(int i=1;i<=rows;i++)
		{
			String name = driver.findElement(By.xpath("//th[@id ='table:_hdrCol2']/parent::tr/parent::thead/parent::table/tbody/tr["+i+"]//td[4]")).getText();
			System.out.println(name);
			if(name.equalsIgnoreCase("BB"))
			{
				
			}
		
		}*/
		
	}
	@AfterTest
	public void closebrowser()
	{
		driver.close();
	}
}
