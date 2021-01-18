package com.autoframework.testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.autoframework.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass
{
	@Test
	public void loginTest() throws IOException
	{
		// driver.get(baseURL);  //moving to BaseClass
		logger.info("URL is opened");

		LoginPage lp = new LoginPage(driver); //create an Object and call methods from LoginPage class
		lp.setUserName(username);
		logger.info("Entered User name");
		lp.setPassword(password);
		logger.info("Entered Password");

		lp.clickSubmit();

		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("Login Test Passed");
		}
		else
		{
			captureScreen(driver, "LoginTest");
			Assert.assertTrue(false);	
			logger.info("Login Test Failed");
		}

	}

}