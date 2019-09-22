package com.qa.callhub.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.callhub.BaseClass.TestBase;
import com.qa.callhub.Utilities.TestUtility;

public class SearchPage extends TestBase
{
	@FindBy(xpath = "//input[@placeholder='Search for products, brands and more']")
	WebElement searchField;
	
	@FindBy(xpath = "//body/div[@id='container']/div/div[@class='_3ybBIU']/div[@class='_1tz-RS']/div[@class='_3pNZKl']/div[@class='Y5-ZPI']/form[@class='_1WMLwI header-form-search']/div[@class='col-12-12 _2tVp4j']/button[@class='vh79eN']/*[1]")
	WebElement searchButton;

	@FindBy(xpath = "//div[contains(text(),'Apple iPhone 7 (Black, 32 GB)')]")
	WebElement selectPhone;
	
	@FindBy(xpath = "//div[7]//div[1]//div[2]//div[2]//div[2]//button[1]//span[1]//span[1]")
	WebElement addToCart;
	
	@FindBy(xpath = "//div[@class='_3e7xtJ']//div[2]//div[1]//div[2]//div[2]//div[2]")
	WebElement removeFromCart;
	
	public SearchPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void searchPhone(String phone) throws InterruptedException
	{
		TestUtility.clickOn(driver, searchField, 15);
		searchField.sendKeys(phone);
		searchButton.click();
		
		selectPhone.click();
		addToCart.click();
		removeFromCart.click();
	}
}
