Feature: check login functionality
@smoke
  Scenario: 
    Given user on login page
    When user enter username and password
    And click on login button
    Then user navigate to home page
@smoke @regression
    Scenario: 
    Given user on login page
    When user enter username and password
    And click on login button
    Then user navigate to home page