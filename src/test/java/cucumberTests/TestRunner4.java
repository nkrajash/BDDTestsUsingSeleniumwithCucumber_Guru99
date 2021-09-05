package cucumberTests;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//Annotations
@RunWith(Cucumber.class)
@CucumberOptions(features = "FeatureFile4",glue= {"stepDefinition4"}, tags = "@Sanity" )
public class TestRunner4 {
	
}
