package cucumberTests;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//Annotations
@RunWith(Cucumber.class)
@CucumberOptions(features = "FeatureFile3",glue= {"stepDefinition3"})
public class TestRunner3 {
	
	
}
