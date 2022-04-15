package com.PageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.How;

public class GooglePage {
		
	WebDriver ldriver;
	
		
	public GooglePage(WebDriver rdriver) 
	{
		
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
			
	}
		 
	@FindBy(how = How.XPATH , using = "//input[@class='gLFyf gsfi']")
	WebElement searchfield;
	
	public void enterSearchTxt(String keyword) {
		searchfield.sendKeys(keyword);
		searchfield.sendKeys(Keys.ENTER);
	}
	
	
}
