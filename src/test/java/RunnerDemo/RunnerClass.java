package RunnerDemo;


	import io.cucumber.testng.AbstractTestNGCucumberTests;
	import io.cucumber.testng.CucumberOptions;

	@CucumberOptions
	(features = {"C:\\Users\\S.B.P\\eclipse-workspace\\CucumberBDproject\\AllFeaturefiles\\Login.feature",
			         "C:\\Users\\S.B.P\\eclipse-workspace\\CucumberBDproject\\AllFeaturefiles\\Login1.feature"},
	glue = {"runnersteodefinition"},
	plugin = {"pretty", "html:target/cucumber-reports"},
	monochrome = true,
	dryRun=false,
	publish = true)
	public class RunnerClass extends AbstractTestNGCucumberTests {
	
	}