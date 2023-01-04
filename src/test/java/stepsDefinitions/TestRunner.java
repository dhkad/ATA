package stepsDefinitions;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		 plugin = {"json:target/cucumber/cucumber.json"},


		monochrome = true,
		features = "src/test/resources/features"
		,glue={"stepsDefinitions"}
		)

public class TestRunner {

}




