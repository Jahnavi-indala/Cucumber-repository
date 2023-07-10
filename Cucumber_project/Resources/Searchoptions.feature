
Feature: Searching functionalities
  

  
  Scenario: Verify to validate search enter a topic filter
   Given I am at the Audio Digest dashboard page with login as prereqist
   And enter "resuscitation Literature Review" on search and validate courses panel
   And enter "virus" on topic filter and validate 
   And select "Humans papilloma virus" on search results and validate
   And observe the search result and check the result with credits and courses
   And click on cross icon and verify the results
   And user should be on original course
   Then logout.
   
   
   
   
  Scenario: Verify to validate search enter a institution filter
   Given I am at the Audio Digest dashboard page with login as prereqist
   And enter "resuscitation Literature Review" on search and validate courses panel
   And click on cross icon and verify the results 
   And validate user should be on original course
   And enter "American academy of pedatrics callifornia" in institution and validate 
   And select "American academy of pedatrics callifornia" in institution and verify lectures
   And observe the search result and check the result with credits and courses
   And click on cross icon and verify the results
   And user should be on original course
   Then logout.
   