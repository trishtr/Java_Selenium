package com.testUtilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

	Properties pro;

	public ReadConfig() 
	{
		File src = new File("./Configurations/config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
			
		}
		catch (IOException e)
		{
			System.out.println("Exception is" + e.getMessage());
			
		}
	}
		
	public String getURL() 
	{
		String url = pro.getProperty("baseURL");
		return url;
	}
	public String getEmail()
	{
		String email = pro.getProperty("email");
		return email;
	}
	public String getReceiver()
	{
		String email_receiver = pro.getProperty("email_receiver");
		return email_receiver;
	}
	public String getPassword()
	{
		String password = pro.getProperty("password");
		return password;
	}
	public String getKeyWord()
	{
		String keyword = pro.getProperty("keyword");
		return keyword;
	}
	
}

