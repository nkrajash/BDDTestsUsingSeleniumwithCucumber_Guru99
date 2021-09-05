package stepDefinition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginApplication {
	
		WebDriver driver;
	
		//Type shift+ctrl+O to add dependencies above.	
		//delete the statements.Change the Given,Then,When and And 
		//annotations.
	    //as per the Gherkin language FeatureFile.feature file.
		@Given("User navigates to demo application login page")
		public void invokeBrowser()
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Data\\Selenium\\Softwares\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("http://demo.guru99.com/v4/");
		}
		
		@When("User enters the username as mngr332061")
		public void enterUsername() {
		    // Write code here that turns the phrase above into concrete actions
			driver.findElement(By.name("uid")).sendKeys("mngr332061");
		}
		@And("User enters the password as bUqened")
		public void enterPassword() {
		    // Write code here that turns the phrase above into concrete actions
			driver.findElement(By.name("password")).sendKeys("bUqened");
		}
		@And("User clicks the login button")
		public void clickLoginButton() {
		    // Write code here that turns the phrase above into concrete actions
			driver.findElement(By.name("btnLogin")).click();
		}
		@Then("User successfully logins to the application")
		public void verifySuccessfulLogin() {
		    // Write code here that turns the phrase above into concrete actions

			String expectedTitle = "Guru99 Bank Manager HomePage";
			String actualTitle = driver.getTitle();
			Assert.assertEquals(expectedTitle,actualTitle);
			System.out.println("Login to Guru99 Demo application successful.");
		}
		
		
}
