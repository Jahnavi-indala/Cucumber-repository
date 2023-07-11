
Feature: Library functionality


 
  Scenario: Verify validate user should not be able to add blank playlist
     
      Given I am at the Audio Digest dashboard page with login as prereqist 
      And I click on library tab on dashboard page
      And I validate Audio Digest library page
      And I click on add to playlist link on any playlist 
      And validate displayed popup
      And click on save button and observe the popup message
      Then logout.
     
  
  Scenario: Verify validate user is able to add new playlist from library page
     
      Given I am at the Audio Digest dashboard page with login as prereqist
      And I click on library tab on dashboard page
      And I validate Audio Digest library page
      And I click on add to playlist link and validate displayed popup 
      And I click on close button on popup and validate
      And I click on add to playlist link and validate displayed popup
      And enter the playlist name in the textbox and click on save button
      And validate display popup and dismiss popup
      Then logout. 
      
      
      
  