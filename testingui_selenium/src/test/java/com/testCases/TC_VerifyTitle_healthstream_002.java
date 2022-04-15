package com.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.PageObjects.GooglePage;
import com.PageObjects.ResultsPage;

public class TC_VerifyTitle_healthstream_002 extends BaseClass {

	@Test
	public void HeatlhStreamTitleTest() throws InterruptedException {
		
		//test = extent.createTest("HealthStream_Title_Test");
		GooglePage gp = new GooglePage(driver);
		gp.enterSearchTxt("HealthStream");
		Thread.sleep(3000);
		ResultsPage rp = new ResultsPage(driver);
		rp.clickFirstLink();
		Thread.sleep(2000);
		String title2 = driver.getTitle();
		Assert.assertEquals(title2,"HealthStream - Healthcare Workforce Solutions");
	}
	
}
