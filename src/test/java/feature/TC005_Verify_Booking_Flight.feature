Feature: Select and Proceed to Booking Page on SpiceJet Website 

Scenario: Select a Flight and Proceed to Booking 
	Given I am on the SpiceJet website homepage for booking 
	When I search for flights from "<DepartureCity>" "<DestinationCity>" "<DepartureDate>" 
	And I select a flight from the search results 
	And I proceed to the booking page "<title>" "<lastName>" "<mobileNumber>" "<firstName>" "<email>" "<city>" "<titleforpassenger>" "<lastNameforpassenger>" "<mobilenumberforpassenger>" "<cardnumber>" "<cardholdername>" "<cardmonth>" "<cardyear>" 
	Then I should be directed to the booking page to complete the reservation 
	
	
	Examples: 
	|DepartureCity|DestinationCity|DepartureDate|title|lastName|mobileNumber|firstName|email|city|titleforpassenger|lastNameforpassenger|cardnumber|cardholdername|cardmonth|cardyear|
	|MAA|DEL|Wed, 10 Apr 2024|Thu, 11 Apr 2024|Mr|jack|6756787678|john|john@gmail.com|chennai|Mr|god|1234 5678 9012 2587|john|05|2026|
	
	
	
	
	
	
	
	