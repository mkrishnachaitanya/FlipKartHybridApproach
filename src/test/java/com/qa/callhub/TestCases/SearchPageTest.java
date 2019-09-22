package com.qa.callhub.TestCases;

import java.lang.reflect.Method;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.callhub.BaseClass.TestBase;
import com.qa.callhub.Pages.LoginPage;
import com.qa.callhub.Pages.SearchPage;

public class SearchPageTest extends TestBase
{
	LoginPage loginPage;
	SearchPage searchPage;
		
	public SearchPageTest()
	{
		super();
	}
		
	@Parameters("Browser")
	@BeforeMethod
	public void setUp(String Browser)
	{		
		initialization(Browser);
		Log.info("Browser Launched Successfully");
			
		loginPage = new LoginPage();
		searchPage = new SearchPage();
			
		loginPage.login(property.getProperty("PhoneNumber"),property.getProperty("Password"));
		Log.info("Successfully Logged into Flipkart");
	}

	@Test(priority=1)
	public void searchIPhone(Method method) throws InterruptedException
	{
		extentTest = extent.startTest(method.getName());		
		searchPage.searchPhone(property.getProperty("Phone"));
		Log.info("Iphone7 is Searced and List of Iphone's are Displayed and Printed");		
	}
}
