#Feature: Feature to test login functionality
#@smoke
#Scenario: Check login
#Given browser opens
#And user on login page
#When user enters username and password
#And click on login
#Then user is navigate to homepage
Feature: Feature to test login functionality with parameter

  @smoke1
  Scenario Outline: Check login
    Given browser opens
    And user on login page
    When user enters <username> and <password>
    And click on login
    Then user is navigate to homepage

    Examples: 
      | username | password    |
      | student  | Password123 |
      #| student  | Password123 |
