

Feature: Playlists functionality
  

 
  Scenario: Verify validate user are able to add new playlist
   
    Given I am at the Audio Digest dashboard page with login as prereqist 
    And I click on playlists tab on dashboard page
    And I validate Audio Digest playlists page
    And I click on create playlist
    And I validate Audio Digest create playlist popup
    And enter new playlist name and click on create button 
    And playlist created successfully
    Then logout.

 
  Scenario: Verify validate status on my playlist screen
    
     Given I am at the Audio Digest dashboard page with login as prereqist 
     And I click on playlists tab on dashboard page
     And I validate Audio Digest playlists page
     And I click on any playlist and check playlist status not started  
     And I click on any playlist and check playlist status in progress     
     And observe the status of that playlist once audio finished
     Then logout.
     
     
     
     
     
         