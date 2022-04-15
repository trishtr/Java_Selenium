package com.testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.testUtilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;


public class BaseClass {

	static ReadConfig readconfig = new ReadConfig();
	public static WebDriver driver = null;
	public String baseURL = readconfig.getURL();
	

	@Parameters("browserName")
	@BeforeClass
	
	public void setUp(String browserName)
	{
		System.out.println("HealStream_search");
		
		ReadConfig readconfig = new ReadConfig();
		
		//WebDriverManager.chromedriver().setup();
		//driver = new ChromeDriver();
		 if(browserName.equalsIgnoreCase("chrome")) {
			 WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
		 }
		 else if (browserName.equalsIgnoreCase("firefox")) {
			 WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
		 }
		 else if (browserName.equalsIgnoreCase("safari")) {
			 WebDriverManager.safaridriver().setup();
			 driver = new SafariDriver();
		 }
		 else if (browserName.equalsIgnoreCase("edge")) {
			 WebDriverManager.edgedriver().setup();
			 driver = new EdgeDriver();
		 }
		
		driver.get(baseURL);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		
	
	}
	
	
	@AfterClass
		public void tearDown() 
	{
		driver.quit();
	}
	
	public static void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File target = new File("./Screenshots/" + tname + ".png");
		FileUtils.copyFile(src, target);
		System.out.println("Screenshot is taken");
	}
}
	 
	
		
	
	
	
	 


	
	

