

Feature: Playlists functionality
  

 
  Scenario: Verify validate user are able to add new playlist
   
    Given I am at the Audio Digest dashboard page with login as prereqist 
    And I click on playlists tab on dashboard page
    And I validate Audio Digest playlists page
    And I click on create playlist
    And I validate Audio Digest create playlist popup
    And enter new playlist name and click on create button 
    Then logout.

 
  Scenario: Verify validate status on my playlist screen
    
     Given I am at the Audio Digest dashboard page with login as prereqist 
     And I click on playlists tab on dashboard page
     And I validate Audio Digest playlists page
     And I click on any playlist     
     Then observe the status of that playlist and logout.
    
    
    
  
     
     
     
         