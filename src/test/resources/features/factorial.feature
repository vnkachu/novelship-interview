Feature: feature to test login Functionality

  Scenario Outline: Verify the factorial of number
    Given Browser is Open
    And User is on the given page
    When User enter "<number>" in the input field
    And clicks on Calculate button
    Then the factorial of the number "<number>" should be shown as "<factorial>"

    Examples:
      |number |factorial   |
      | 5     | 120        |
      | 4     | 24         |
