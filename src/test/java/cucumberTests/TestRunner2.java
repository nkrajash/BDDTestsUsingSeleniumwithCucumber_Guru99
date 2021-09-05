package cucumberTests;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//Annotations
@RunWith(Cucumber.class)
@CucumberOptions(features = "FeatureFile2",glue= {"stepDefinition2"})
public class TestRunner2 {
	
}