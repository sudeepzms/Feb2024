package RunerTest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"src/test/java/feature"},
		glue = {"stepdefinationDec"},
	//	plugin = {"pretty", "html:src/reports/cucumber-htmlReport.html", "json:src/reports/cucumberReport.json"}, 
				plugin = {"pretty", "html:target/cucumber-htmlReport.html", "json:target/cucumber.json"},
		tags = ("@SmokeTestCase")
		)

public class TestRunner {
	
	

}
