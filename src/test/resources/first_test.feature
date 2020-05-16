Feature: As a user I want to use google Search
  in order to find what I need.


  Scenario: Verify that user can search for address
    Given I am on google search page
    And I enter "34-18 Northern Blvd" into the search box
    Then I should see search result showing the same search "34-18 Northern Blvd" item
    Then I close the browser

  @myTest
  Scenario Outline: Verify that user can search business with business name
    Given I am on google search page
    When I enter "<business_name>" into the search box
    Then I should see search result showing the same search "<expected_result>" item
    Then I close the browser

    Examples:
      | business_name | expected_result |
      | apple         | apple           |
      | chase         | chase           |
      | amazon        | amazon          |


  Scenario: Verify that user can register for new account -mercury tours
    Given I am on the home page of mercury tours
    When I click on the register link
    And I should see register page
    And I enter all required information
    Then I should see "Thank you for registering"
    Then I close the browser
