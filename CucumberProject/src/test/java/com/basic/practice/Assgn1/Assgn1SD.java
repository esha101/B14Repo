package com.basic.practice.Assgn1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Assgn1SD {
	
	WebDriver driver;
	
	@Given("^User needs to be on Demo website page$")
	public void User_needs_to_be_on_Demo_page (){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gautam\\Documents\\Esha_Class\\NewChromeDriver_ver_2.37\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
	}
	
	@When("^Enter the following data$")
	public void enter_the_foll_data (DataTable table) throws InterruptedException{
		List<List<String>> data = table.raw();
		
		String value10 = data.get(1).get(0);
		String value11 = data.get(1).get(1);
		String value12 = data.get(1).get(2);
		String value13 = data.get(1).get(3);
		String value14 = data.get(1).get(4);
		String value15 = data.get(1).get(5);
		
		
		driver.findElement(By.xpath("//input [@placeholder='First Name']")).sendKeys(value10);
		driver.findElement(By.xpath("//input [@placeholder='Last Name']")).sendKeys(value11);
		driver.findElement(By.xpath("//input [@ng-model='EmailAdress']")).sendKeys(value12);
		driver.findElement(By.xpath("//input [@ng-model='Phone']")).sendKeys(value13);
		
		if (value14.equals("Female")){
			driver.findElement(By.xpath("//input [@value='FeMale']")).click();
		}else {
			driver.findElement(By.xpath("//input [@value='Male']")).click();	
		}
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//select/option[@value='"+value15+"']")).click();
		
		Thread.sleep(3000);
		
	}
	
	
	
	@Then("^Click on submit$")
	public void click_on_submit (){
		
		driver.findElement(By.id("submitbtn")).click();
		
	}

}
