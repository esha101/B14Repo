package com.basic.MyFirstDifferentFolder;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome=true,
		dryRun=true,
		features={"src/test/resources/com/basic/MyFirstDifferentFolderFF/"},
		glue={"com/basic/MyFirstDifferentFolder/"}
		
		
		)

public class RunnerMyDifferentFolderTest1 {

}
