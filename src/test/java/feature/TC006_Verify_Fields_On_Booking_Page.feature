Feature: Validate Fields on Booking Page 


Scenario: Verify presence of Check-in field 
	Given I am on the booking page Check-in field  "<pnrNumber>" "<email>" 
	Then I should see the Check-in field 
	
Scenario: Verify presence of Flight Status field 
	Given I am on the booking page Flight Status field  "<from>"  "<to>" 
	Then I should see the Flight Status field 
	
Scenario: Verify presence of Manage Booking field 
	Given I am on the booking page Flight Status field  "<pnrNumber>" "<email>" 
	Then I should see the Flight Status field 
	
	Examples: 
	|pnrNumber|email|from|to|
	|y5875|john@gmail.com|MAA|DEL|