package com.homepagetestcase;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.testBase.CloseBrowser;
import com.testBase.LaunchBrowser;
import com.testBase.Waits;

public class LaunchURLTestCase extends LaunchBrowser{
	
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
	public void closeBrowser()
	{
		CloseBrowser.closeBrowser();
	}
 
}
