package com.testBase;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class LaunchBrowser {
	
	public static WebDriver driver;
	
	public static  void launch(String URL) {
		  /*System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
		  DesiredCapabilities capabilities = new DesiredCapabilities();
		  capabilities = DesiredCapabilities.firefox();
		  capabilities.setBrowserName("firefox");
		  capabilities.setVersion("36.0");
		  capabilities.setPlatform(Platform.WINDOWS);
		  capabilities.setCapability("marionette", false);
		  FirefoxOptions options = new FirefoxOptions();
		  driver = new FirefoxDriver(capabilities);*/
		  
		  System.setProperty("webdriver.chrome.driver","E:\\Java_Selenium\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get(URL);
		  Waits.Simplewaits(10);
		  
	}
	
}
