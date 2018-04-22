package com.basic.sharedataSD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class SharedClass {
	
	WebDriver driver;

	
	@Before
	public WebDriver setup(){
		if(driver==null){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gautam\\Documents\\Esha_Class\\NewChromeDriver_ver_2.37\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		return driver;
		
	}
	
	
	@After
	public void tearDown(){
		driver.quit();
		driver =null;
	}
	
	

}
