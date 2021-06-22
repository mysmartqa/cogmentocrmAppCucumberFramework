package cogmentocrmApp.QA.CucumberTestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)


@CucumberOptions(
		features = "C:\\MavenProject\\cogmentocrmAppCucumberFramework\\src\\main\\java\\cogmentocrmApp\\QA\\CucumberFeatures\\LoginFeature",
		glue = {"cogmentocrmApp/QA/CucumberStepsDefinition"},
		//tags = {"@Ignore"},
		format = { "pretty", "html:test-output", "json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},
		monochrome = true,
		plugin = "json:target/cucumber-reports/CucumberTestReport.json",		
		strict = true,
		dryRun = true)

public class CucumberTestRunner {

}
