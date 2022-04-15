package com.PageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ResultsPage {

	WebDriver ldriver;
	
	
	public ResultsPage(WebDriver rdriver) 
	{
		
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
			
	}
		 
	@FindBy(how = How.XPATH , using = "//div[@class='yuRUbf']//a[1]")
	WebElement firstLink;
	
	public void clickFirstLink()
	{
		firstLink.click();
	}
	
}
