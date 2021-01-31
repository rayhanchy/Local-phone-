package steps;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions (features="src/test/java/Feature",
glue = "steps",
monochrome = true,
tags= "@WIP"
//snippets = SnippetType.CAMELCASE

	
		)


public class Executionrunner extends AbstractTestNGCucumberTests{

}
