Feature: Login to SpiceJet Website 

Scenario: User successfully logs in with valid credentials 
	Given First user is on the SpiceJet login page 
	When First user enters valid userid <validUserId> 
	And First user enter valid password    <validPassword>
	And First user clicks on the login button 
	Then First user validate the login successfully or not 
	
	
Scenario: User logs in with invalid credentials 
	Given  second user is on the SpiceJet login page 
	When  second user enters invalid userid  <invalidUserId> 
	And  second user enter valid password  <validPassword>
	And  second user clicks on the login button 
	Then  second user validate the login successfully or not 
	
Scenario: logs in with invalid credentials 
	Given  Third user is on the SpiceJet login page 
	When  Third user enters valid userid  <validUserId>
	And  Third user enter invalid password  <invalidPassword>
	And  Third user clicks on the login button 
	Then  Third user validate the login successfully or not 
	
	
Examples: 
	|validUserId|validPassword|invalidUserId|invalidPassword|
	|5676567678|as2d3@hj|5878585|jhku#hgh|