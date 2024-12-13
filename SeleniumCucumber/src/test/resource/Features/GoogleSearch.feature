Feature: Feature to test google search functionality
@smoke
  Scenario: Check google search
    Given open browser
    And click on search page
    When user enters text
    And click on enter
    Then user is navigate to result
 