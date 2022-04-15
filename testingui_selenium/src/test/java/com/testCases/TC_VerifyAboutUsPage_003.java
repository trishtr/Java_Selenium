package com.testCases;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.PageObjects.GooglePage;
import com.PageObjects.HealthStreamPage;
import com.PageObjects.ResultsPage;

import jdk.javadoc.internal.doclets.toolkit.util.DocFinder.Output;

public class TC_VerifyAboutUsPage_003 extends BaseClass {

	@Test
	public void AboutUsTitleTest() throws InterruptedException, IOException
	{	
		//test = extent.createTest("AboutUs_Page_Test");
		System.out.println("Verify About Us Page");
		GooglePage gp = new GooglePage(driver);
		gp.enterSearchTxt("HealthStream");
		ResultsPage rp = new ResultsPage(driver);
		rp.clickFirstLink();
		Thread.sleep(4000);
		
		HealthStreamPage hp = new HealthStreamPage(driver);
		hp.clickAboutBtn();
		Thread.sleep(1000);
		hp.clickAboutUsBtn();
		
		Thread.sleep(3000);
		String title3 = driver.getTitle();
		System.out.println(title3);
		
		Assert.assertEquals(title3, "About Us");
		
	}
}
