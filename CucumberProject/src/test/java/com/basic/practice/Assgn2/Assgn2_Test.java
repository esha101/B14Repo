package com.basic.practice.Assgn2;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome = true,
		//dryRun = true,
		
		features = {"src/test/resources/com/basic/practice/Assgn2FF/"},
		glue = {"com/basic/practice/Assgn2/"}
		
		
		
		)
public class Assgn2_Test {

}
