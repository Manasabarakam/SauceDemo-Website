package org.run;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.step.CucumberReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Featurefile\\tc_SauceDemo.feature",
glue = "org.step", 
plugin = { "pretty",
		
"junit:target\\MavenReport\\sample.xml",
"html:target\\MavenReport\\index.html",
"json:target\\MavenReport\\sample.json"
}

)

public class RunnerClass {
	
	
	@AfterClass
	public static void viewReport() {
		
		CucumberReport.generateReport("target/MavenReport/sample.json");
	}
}
