#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Login to Guru99 Bank Application

 Scenario: User login with correct credentials
 	Given User navigates to demo application login page
 	When User enters the username as mngr332061
 	And User enters the password as bUqened
 	And User clicks the login button
 	Then User successfully logins to the application
	Given User clicks on the Log out button
	Then User logs out of the application 	
