Feature: Book One-Way Trip on SpiceJet Website 

Scenario: Book a One-Way Trip 
	Given I am on the SpiceJet website homepage 
	When I select the oneway trip option 
	And I enter the departure city as "<DepartureCity>" and destination city as "<DestinationCity>" 
	And I select the departure date as "<DepartureDate>" 
	And I select the passengers 
	And I select the currency 
	And I click on the search flights button 
	Then I should see a list of available flights for the specified route and date 
	
	Examples: 
	|DepartureCity|DestinationCity|DepartureDate|
	|Bangkok|Chennai|Sat, 30 Mar 2024|