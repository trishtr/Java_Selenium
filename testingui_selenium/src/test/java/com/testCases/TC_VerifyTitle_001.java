package com.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_VerifyTitle_001 extends BaseClass {

	@Test
	public void GoogleTitleTest() throws IOException {
		//test = extent.createTest("GoogleTitleTest");
		System.out.println("Open Google on browser");
		String title1 = driver.getTitle();
		
		Assert.assertEquals(title1,"Google");
		
	}
}
