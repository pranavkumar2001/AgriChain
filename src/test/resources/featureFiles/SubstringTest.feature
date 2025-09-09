@regression
Feature: Longest substring without repeating character
  Description: The purpose of this feature is to check Longest substring without repeating character

  Scenario Outline: Verify user can create a campus
    Given User navigates to the url "<url>"
    When User enter the string "<string>" in the textbox
    And User clicks the submit button
    Then User validates the output "<output>"

    Examples:
      | url                   | string   | output |
      | https://agrichain.com | abcabcbb | abc    |

