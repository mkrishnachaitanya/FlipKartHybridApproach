package com.qa.callhub.TestCases;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.callhub.BaseClass.TestBase;
import com.qa.callhub.Pages.LoginPage;

public class LoginPageTest extends TestBase
{
	LoginPage loginPage;
	
	public LoginPageTest()
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
	}

	@Test(priority=1)
	public void verifyHomePageTitleTest(Method method)
	{
		extentTest = extent.startTest(method.getName());		
		String loginPageTitle = loginPage.verifyLoginPageTitle();
		System.out.println("The Login Page Title is ::: " +loginPageTitle);
		Assert.assertEquals(loginPageTitle, "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
		Log.info("Login Page Title Verified");
	}
	
	@Test(priority=2) 
	public void loginTest(Method method)
	{
		extentTest = extent.startTest(method.getName());
		loginPage.login(property.getProperty("PhoneNumber"),property.getProperty("Password"));
		Log.info("Successfully Logged into Flipkart");
	}
}
