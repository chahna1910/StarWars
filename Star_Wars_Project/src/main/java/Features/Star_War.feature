Feature: Verifying the functionality of Swapi website.
@Regression
Scenario: Checking all starwars characters valid data scenario
Given User should launch swapi.dev
When  enter valid service URL for all characters
Then click on the request button
And check final result

@Regression
Scenario: Checking starwars all characters by using invalid data scenario
Given User must open swapi.dev 
When User enters invalid data in starwars characters 
Then clicks on request button
And will check the displayed result

@Regression
Scenario: Checking specific character output with valid data
Given User must be on swapi.dev
When enter valid service_URL for starwars specific character
Then clicks on the request box
And Confirm the result

@Regression
Scenario: Checking starwars specific character using invalid service URL
Given User should launch the website
When enter invalid service URL for specific character
Then Click on the request button
And Confirm if the end result displayed 

@Regression
Scenario: Checking searching with valid data scenario
Given User should open firefox and type swapi URL
When Enter valid planets/characters valid service URL
Then Clicks on the request button
And Check the results

@Regression
Scenario: Searching with invalid data result scenario
Given User must be on homepage of swapi.dev 
When enter invalid service URL to search planets/characters
Then User clicks on request
And checks if the final result is available

@Regression
Scenario: Checking the blank input functionality scenario
Given User should be on homepage of swapi.dev
When keep service URL field blank
Then click on the request
And check if the result is displayed