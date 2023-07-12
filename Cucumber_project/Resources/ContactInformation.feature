
Feature: Contact Information Functionalities
  
  
  Scenario: Verify validate user is able to view the contact information
   
        Given I am at the Audio Digest dashboard page with login as prereqist 
        And I click on the User profile and verify the dropdown
        And click the My information and verify all contact informations
        Then logout.
    