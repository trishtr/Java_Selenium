package com.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HealthStreamPage {

	WebDriver ldriver;
	
	
	public HealthStreamPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
				
	}
	
	@FindBy(how = How.XPATH, using ="//ul[@class='quick-links']//li[1]//a")
	WebElement aboutBtn;
	
	@FindBy(how = How.XPATH, using = "//div[@class='dropdown-menu']//a[1]")
	WebElement AboutUsBtn;
	
	public void clickAboutBtn() {
		Actions act = new Actions(ldriver);
		act.moveToElement(aboutBtn).build().perform();
	}
	public void clickAboutUsBtn() {
		Actions act = new Actions(ldriver);
		act.moveToElement(AboutUsBtn).click().build().perform();
	}
}
