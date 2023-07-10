

Feature: Login functionality
 

  Scenario: Logging in with valid credentials
   
    Given I am at the Audio Digest Home page and validate
    And I click the Login profile and validate
    And enter the username 
    And enter the password 
    And I will click the Login button
    And I validate the outcome dashboard page
    Then logout.
    
    
