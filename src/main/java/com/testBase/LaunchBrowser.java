package com.testBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class LaunchBrowser {
	
	public static WebDriver driver;
	public static  void launch(String URL) {
		System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
		  DesiredCapabilities capabilities = new DesiredCapabilities();
		  capabilities = DesiredCapabilities.firefox();
		  capabilities.setBrowserName("firefox");
		  capabilities.setVersion("your firefox version");
		  capabilities.setPlatform(Platform.WINDOWS);
		  capabilities.setCapability("marionette", false);
		  driver = new FirefoxDriver(capabilities);
		  driver.manage().window().maximize();
		  driver.get(URL);
		  Waits.Simplewaits(10);
		  
	}
	
}
