package com.basic.FirstFeatureFile;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyFirstStepDef {

	WebDriver driver;
	
	@Given("^User needs to be on Faceboook login page$")
	public void User_needs_to_be_on_Faceboook_login_page() throws InterruptedException{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gautam\\Documents\\Esha_Class\\NewChromeDriver_ver_2.37\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		Thread.sleep(4000);
	}
	
	@When("^User enters user \"([^\"]*)\" as first name$")
	public void User_enters_user__as_first_name(String uName){
		driver.findElement(By.name("firstname")).sendKeys(uName);
	}
	
	@Then("^User checks user \"([^\"]*)\" first name is present$")
	public void User_checks_user__first_name_is_present(String uName){
		String userNameActual = driver.findElement(By.name("firstname")).getAttribute("value");
		Assert.assertEquals(uName, userNameActual);		
				
	}
}
