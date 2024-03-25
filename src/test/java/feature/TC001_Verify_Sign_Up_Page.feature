Feature: Sign up Functionality of Spice Jet Flight Booking System 


Scenario Outline: Sign Up testcase 
	Given Launch the url 
	When User click the sign up menu 
	And User select the title option <value> 
	And User enter the firstname <firstName> 
	And User enter the lastname <lastName> 
	And User select the country <country> 
	And User select the date of birth <dob> 
	And User enter the mobile number <mobileNumber> 
	And User enter the email id <mailId> 
	And User enter the password <password> 
	And User enter the confirm password <confirmPassword> 
	And User click the agree 
	And User click the submit 
	Then Validate the sign up successfully or not 
	
	
	Examples: 
		|value|firstName|lastName|country|dob|mobileNumber|mailId|password|confirmPassword|
		|Mr||Tomnic|T|India |07/13/1991|6756787656|tomnic@gmail.com|tomni@123|tomni@123|
		
		
		
		
		
