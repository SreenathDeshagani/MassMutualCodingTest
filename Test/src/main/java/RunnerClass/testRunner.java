package RunnerClass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features =".\\src\\main\\resources\\FeatureFiles\\DX_QA.feature" //feature file path
		,glue= {"com.stepDefinations.MassMutualTest"}, //step defination file path
		monochrome = true, //to display console output in good readable format
		format = {"pretty","html:test-outout"} //html output
		)


public class testRunner {

}
