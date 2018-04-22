package com.basic.practice.Assgn2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Assgn2SD {
	
	WebDriver driver;
	
	@Given("^User needs to be on Demo website page$")
	public void User_needs_to_be_on_Demo_page (){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gautam\\Documents\\Esha_Class\\NewChromeDriver_ver_2.37\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
	}
	
	@When("^Firstname is entered as \"([^\"]*)\"$")
	public void enterfirstname(String fname){
		driver.findElement(By.xpath("//input [@placeholder='First Name']")).sendKeys(fname);
	}
		
	@And("^Lastname is entered as \"([^\"]*)\"$")
	public void enterLastname(String lname){
		driver.findElement(By.xpath("//input [@placeholder='Last Name']")).sendKeys(lname);
	}
	
	@And("^emailadd is entered as \"([^\"]*)\"$")
	public void enterEmailID(String emailid){
		driver.findElement(By.xpath("//input [@ng-model='EmailAdress']")).sendKeys(emailid);
	}
	
	@And("^Phone is entered as \"([^\"]*)\"$")
	public void enterPhone(String phone){
		driver.findElement(By.xpath("//input [@ng-model='Phone']")).sendKeys(phone);
	}
	
	@And("^Gender is entered as \"([^\"]*)\"$")
	public void enterGender(String gender){
		
		if (gender.equals("Female")){
			driver.findElement(By.xpath("//input [@value='FeMale']")).click();
		}else {
			driver.findElement(By.xpath("//input [@value='Male']")).click();	
		}
	}
	
	
	@And("^Country is entered as \"([^\"]*)\"$")
	public void enterCountry(String country) throws InterruptedException{
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//select/option[@value='"+country+"']")).click();
		
		Thread.sleep(3000);
	}
	
	
	@Then("^Click on submit$")
	public void click_on_submit (){
		
		driver.findElement(By.id("submitbtn")).click();
		
	}

}
