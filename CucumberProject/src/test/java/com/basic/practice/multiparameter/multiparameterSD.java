package com.basic.practice.multiparameter;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class multiparameterSD {
	
	WebDriver driver;
	
	@Given("^User needs to be on Faceboook login page$")
	public void User_needs_to_be_on_Faceboook_login_page(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gautam\\Documents\\Esha_Class\\NewChromeDriver_ver_2.37\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	}
	
	@When("^User enters user \"([^\"]*)\" as first name and \"([^\"]*)\" as last name$")
	public void User_enters_first_and_lastname(String firstname, String lastname){
		driver.findElement(By.name("firstname")).sendKeys(firstname);
		driver.findElement(By.name("lastname")).sendKeys(lastname);
		
	}
	
	@Then("^User checks user \"([^\"]*)\" first name is present$")
	public void user_checks_firstname_is_present(String expectedName){
		String actualName = driver.findElement(By.name("firstname")).getAttribute("value");
		Assert.assertEquals(expectedName, actualName);
	}

	
	
	@When("^User enters user \"([^\"]*)\" as first name$")
	public void User_enters_firstname(String firstname){
		driver.findElement(By.name("firstname")).sendKeys(firstname);
		
	}
	
	@But("^User enters \"([^\"]*)\" as last name$")
	public void User_enters_first_and_lastname(String lastname){
		driver.findElement(By.name("lastname")).sendKeys(lastname);
		
	}
}
