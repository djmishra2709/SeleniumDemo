package com.homepagetestcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.testBase.CloseBrowser;
import com.testBase.LaunchBrowser;
import com.testBase.Waits;

import readExcelData.ReadByDatarovider;

public class LoginTestCase {
	public WebDriver driver;
	
	@Parameters({"URL"})
	@BeforeTest
	public void lauchURL(String URL)
	{
		LaunchBrowser.launch(URL);
	}
	
	@Test(dataProvider = "testdataprovider")
	public void login( String user,String pass)
	{
		WebElement username = driver.findElement(By.xpath("//input[@id = 'email']"));
		Waits.Conditionwaits(15, username);
		username.sendKeys(user);
		WebElement password = driver.findElement(By.xpath("//input[@id = 'pass']"));
		Waits.Conditionwaits(15, password);
		username.sendKeys(pass);
		driver.findElement(By.xpath("//input[@type = 'submit']")).click();
		
		
	}
	
	@DataProvider
	public Object[][] testdataprovider() throws Exception
	{
		Object[][] testdata = ReadByDatarovider.readData("E:\\Java_Selenium1\\DataDriven\\TestData.xlsx");
		return testdata;
	}

	@AfterTest
	public void closeBrowser()
	{
		CloseBrowser.closeBrowser();
	}
}
