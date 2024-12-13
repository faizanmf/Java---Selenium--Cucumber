Feature: Feature to test login functionality
@smoke
  Scenario: Check login
    Given user on login page
    When user enters username and password
    And click on login
    Then user is navigate to homepage
  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
