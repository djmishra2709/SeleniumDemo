package com.testcases;

import org.testng.annotations.Test;

import com.datadriven.LaunchBrowser;
import com.datadriven.Waits;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.BeforeClass;

import java.sql.Driver;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestCase1 extends LaunchBrowser{
	
	 @Parameters({"URL"})
	 @BeforeClass
	  public void beforeMethod(String URL) {
		  launch(URL);   
	  }
	 
  @Test
   public void login() 
  {
	 System.out.println("test case is executing");
	 Waits.Simplewaits(10);
	 
  }
 
  @AfterTest
  public void afterMethod() 
  {
	closebrowser();
  }
 
}
