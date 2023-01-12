package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		
		
		// dryRun=false,
		// extraGlue=false,
		features = { "Features" }, 
		glue = { "Stepdefination" },
		// monochrome = true,
		// name=false,
		// objectFactory=false,
		// plugin={"json:target/cucumber.json"}

		plugin = { "pretty", "html:target/Anucucumber-reports.html"
					//"errorDescription.MyTestListener"
		// "json:Folder_Name/cucumber.json",
		// "junit:Folder_Name/cucumber.xml"
		}
// publish=false
// snippets=false,
// tags = "@SeleniumTestcases" // Tags are nothing but filters

)

public class TestRunner extends AbstractTestNGCucumberTests {

}
