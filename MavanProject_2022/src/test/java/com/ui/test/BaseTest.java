package com.ui.test;

import java.io.IOException;
import java.util.Properties;

import org.junit.Before;

public class BaseTest {
	Properties pro;
	@Before
		public void openBrowser() throws IOException {
//			pro= Shared.readPropFile("C:\\Users\\tanvi\\eclipse-workspace\\MavanProject_2022\\src\\main\\resources\\db\\project.properties");
//			
//			String br = pro.getProperty("Browser");
//			
//			if (br.equals("Chrome"))	{
//				System.out.println("Open Chrome");
//				
//			}else if (br.equals("FireFox")) {
//				System.out.println("Open FireFox");
//				
//			}else if (br.equals("Safari"))	{
//				System.out.println("Open Safari");
//			}
//		}

		// From command line
	String br = pro.getProperty("Browser");
	
	if (br.equals("Chrome"))	{
		System.out.println("Open Chrome");
		
	}else if (br.equals("FireFox")) {
		System.out.println("Open FireFox");
		
	}else if (br.equals("Safari"))	{
		System.out.println("Open Safari");
	}
}
}

