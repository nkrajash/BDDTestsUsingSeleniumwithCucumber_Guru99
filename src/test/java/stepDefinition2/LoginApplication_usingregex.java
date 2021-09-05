package stepDefinition2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;

public class LoginApplication_usingregex {
	
		WebDriver driver;
	
		//Type shift+ctrl+O to add dependencies above.	
		//delete the statements.Change the Given,Then,When and And 
		//annotations.
	    //as per the Gherkin language FeatureFile.feature file.
		@Given("User navigates to demo application login page")
		public void invokeBrowser()
		{
			System.setProperty("webdriver.chrome.driver", 	"C:\\Data\\Selenium\\Softwares\\chromedriver_win32\\chromedriver.exe");
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
		@And("User clicks the login button")
		public void clickLoginButton() {
		    // Write code here that turns the phrase above into concrete actions
			driver.findElement(By.name("btnLogin")).click();
		}
		@Then("User successfully logins to the application")
		public void verifySuccessfulLogin() {
		    // Write code here that turns the phrase above into concrete actions
			System.out.println("Login to Guru99 Demo application successful.");
			String expectedTitle = "Guru99 Bank Manager HomePage";
			String actualTitle = driver.getTitle();
			Assert.assertEquals(expectedTitle,actualTitle);
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

