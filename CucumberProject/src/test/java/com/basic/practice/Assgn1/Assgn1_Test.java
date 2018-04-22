package com.basic.practice.Assgn1;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome = true,
		//dryRun = true,
		
		features = {"src/test/resources/com/basic/practice/Assgn1FF/"},
		glue = {"com/basic/practice/Assgn1/"}
		
		
		
		)
public class Assgn1_Test {

}
