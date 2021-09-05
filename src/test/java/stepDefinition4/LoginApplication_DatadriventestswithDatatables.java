package stepDefinition4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;

public class LoginApplication_DatadriventestswithDatatables {
	
	WebDriver driver;

	//Type shift+ctrl+O to add dependencies above.	
	//delete the statements.Change the Given,Then,When and And 
	//annotations.
    //as per the Gherkin language FeatureFile.feature file.
	@Given("User navigates to demo application login page")
	public void invokeBrowser()
	{
		System.setProperty("webdriver.chrome.driver", 
	"C:\\Data\\Selenium\\Softwares\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://demo.guru99.com/v4/");
	}
	
	@When("^User enters the username as (.*)$")
	public void enterUsername(String username) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("uid")).sendKeys(username);
	}
	@And("^User enters the password as (.*)$")
	public void enterPassword(String password) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("password")).sendKeys(password);
	}

	@When("^User enters correct credentials$")
	public void enterCredentials(DataTable dataTable) {
	    List <String> dataAsList = dataTable.asList();
	    
	    driver.findElement(By.name("uid")).sendKeys(dataAsList.get(0));
		driver.findElement(By.name("password")).sendKeys(dataAsList.get(1));
	}		
	@And("User clicks the login button")
	public void clickLoginButton() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("btnLogin")).click();
	}
	@Then("User successfully logins to the application")
	public void verifySuccessfulLogin() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Login to Guru99 Demo application successful.");
		String expectedwelcomeText = "Welcome To Manager's Page of Guru99 Bank";
		String actualwelcomeText= driver.findElement(By.xpath("//marquee[@class='heading3']")).getText();
		System.out.println(actualwelcomeText);
		Assert.assertEquals(expectedwelcomeText,actualwelcomeText);
		if(actualwelcomeText.equalsIgnoreCase(expectedwelcomeText)) {
			System.out.println("Login to Guru99 Demo application successful.");
		}
		else {
			System.out.println("Login to Guru99 Demo application unsuccessful.");
			driver.quit();
		}
	}
	
	@Given("User clicks on the Log out button")
	public void clickLogout()
	{
		WebDriverWait wait = new WebDriverWait(driver,1000);
		WebElement logoutButtonlink = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Log out")));		
		logoutButtonlink.sendKeys(Keys.RETURN);
		driver.switchTo().alert().accept();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Then("User logs out of the application")
	public void verifyLogout()
	{
		String expectedTitle = "Guru99 Bank Home Page";
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		Assert.assertEquals(expectedTitle,actualTitle);			
		System.out.println("Logout of Guru99 Demo application successful.");
		driver.quit();
	}
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
