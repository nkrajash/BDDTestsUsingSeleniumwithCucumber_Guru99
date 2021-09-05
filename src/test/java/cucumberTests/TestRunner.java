package cucumberTests;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//Annotations
@RunWith(Cucumber.class)
@CucumberOptions(features = "FeatureFile",glue= {"stepDefinition"})
public class TestRunner {
	
}


/*Quiz:
Test scenarios in features file use which syntax?

1 / 1 point

JUnit


TestNG


Gherkin


Plain English

Correct
Correct! Gherkin syntax has keyword which are used in feature files

2.
Question 2
Files which has actual code to perform actions in Cucumber are known as?

1 / 1 point

Feature Files


Step-Definition


Application Layer


Logic layer

Correct
Correct! Step-definition files have the code to perform actions

3.
Question 3
An effective test scenario must have at least one Assertion?

1 / 1 point

True


False

Correct
Correct! A test scenario without an assertion will not be an effective test case

4.
Question 4
Keyword used in place of Scenario to pass multiple test data is? 

1 / 1 point

Scenario Outline


Scenario Data


Feature Outline

Correct
Correct! Scenario Outline keyword is used in place of Scenario to pass multiple test data

5.
Question 5
Initial common steps within a feature file can be written under? 

1 / 1 point

BeforeScenario


BeforeTest


Foreground Keyword


Background keyword

Correct
Correct! Background keyword is used to run initial common steps

6.
Question 6
To execute only a some of the scenario say for example Sanity Scenario we can use?

1 / 1 point

Tags before a test scenario


Annotations

Correct
Correct! Add a tag before a scenario to run only a particular set of test case

7.
Question 7
Which attribute under CucumberOptions connect feature file with Step-definition?

1 / 1 point

features = "path of feature file", connect = "path of step-definition"


features = "path of feature file", glue = "path of step-definition"


features = "path of feature file", paste = "path of step-definition"

Correct
Correct! features and glue attributes are used to connect features and step-definition file

*/