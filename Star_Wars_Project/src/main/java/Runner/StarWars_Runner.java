package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

public class StarWars_Runner {

	@RunWith(Cucumber.class)
	@CucumberOptions(features = "Users/BlacK_BearD/eclipse-workspace/Cucumber_1/src/main/java/Features/Star_War.feature", glue = { "StarWars_StepDefination.java" }, plugin = { "pretty", "html:test-output",
			"json:json-output/cucumber.json",
			"junit:target/cucumber-reports/Cucumber.xml" }, monochrome = true, dryRun =false)

	public class runner {

	}

}
