Feature: Book Round Trip on SpiceJet Website 

Scenario: Book a Round Trip 
	Given I am on the SpiceJet website homepage for roundtrip 
	When I select the round trip option for roundtrip 
	And I enter the departure city for roundtrip  "<DepartureCity>" "<DestinationCity>"
	And I select the departure date for roundtrip "<DepartureDate>"
	And I select the return date for roundtrip  "<ReturnDate>"
	And I select the passengers for roundtrip 
	And I select the currency for roundtrip 
	And I click on the search flights button for roundtrip 
	Then I should see a list of available flights for the specified route and date for roundtrip 
	

	Examples: 
	|DepartureCity|DestinationCity|DepartureDate|ReturnDate|
	|Bangkok|Chennai|Sat, 30 Mar 2024|Sun, 31 Mar 2024|