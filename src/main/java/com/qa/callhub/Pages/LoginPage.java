package com.qa.callhub.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.callhub.BaseClass.TestBase;

public class LoginPage extends TestBase
{
	@FindBy(xpath = "//a[contains(text(), 'Login & Signup')]")
	WebElement clickOnLoginSignUp;
	
	@FindBy(xpath = "//input[@class='_2zrpKA _1dBPDZ']")
	WebElement userName;
	
	@FindBy(xpath = "//input[@class='_2zrpKA _3v41xv _1dBPDZ']")
	WebElement password;
	
	@FindBy(xpath = "//button[@class='_2AkmmA _1LctnI _7UHT_c']")
	WebElement clickOnLogin;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	public void login(String uname, String pword)
	{
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("arguments[0].click();", clickOnLoginSignUp);
		
		userName.sendKeys(uname);
		password.sendKeys(pword);
		JavascriptExecutor js2 = (JavascriptExecutor)driver;
		js2.executeScript("arguments[0].click();", clickOnLogin);
	}
}
