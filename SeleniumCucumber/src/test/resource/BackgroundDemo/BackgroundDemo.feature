Feature: check homepage functionality
  
  Background: user is loggedin
  Given user is loggedin
  When user enters username and password
  And clicks on login button
  Then user is navigated to the homepage

  Scenario: check logout link
    #Given user is loggedin
    When user clicks on welcome link
    Then logout link is displayed

  Scenario: verify quick launch toolbar is present
    #Given user is loggedin
    When user clicks on dashboard link
    Then quick launch toolbar is displayed
    
