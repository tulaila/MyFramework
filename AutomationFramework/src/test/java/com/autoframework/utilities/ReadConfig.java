package com.autoframework.utilities;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadConfig {

	Properties pro;  // Create an object properties class

	// Constructor
	public ReadConfig()  
	{
		File scr = new File("./Configuration/config.properties");  //property file

		FileInputStream fis;
		try {
			fis = new FileInputStream(scr); // READ the DATA (read mode)
			pro = new Properties(); // pro object
			pro.load(fis); // Load method -load at the 

		} catch (final Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Except is " + e.getMessage());
		} 
	}

	// Every method should Read the value and Return the value
	public String getApplicationURL()
	{
		String url=pro.getProperty("baseURL");
		return url;
	}
	public String getUsername()
	{
		String username=pro.getProperty("username");
		return username;
	}
	public String getPassword()
	{
		String password=pro.getProperty("password");
		return password;
	}
}
