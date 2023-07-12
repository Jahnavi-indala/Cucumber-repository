
Feature: Searching functionalities
  

  
  #Scenario: Verify to validate search enter a topic filter
   #Given I am at the Audio Digest dashboard page with login as prereqist
   #And enter coursename on searchbox and validate courses panel
   #And enter type of disease on topic filter and validate 
   #And select type of disease on search results and validate
   #And click on cross icon and verify the results
   #Then logout.
   
   
   
   
  Scenario: Verify to validate search enter a institution filter
   Given I am at the Audio Digest dashboard page with login as prereqist
   And enter coursename on searchbox and validate courses panel
   And click on cross icon and verify the results 
   And enter institute name in institution and validate 
   And select institute name in institution and verify lectures
   And click on cross icon and verify the results
   Then logout.
   