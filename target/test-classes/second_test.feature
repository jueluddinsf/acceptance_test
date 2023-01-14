Feature: As a user I want to use google Search
  in order to find what I need.


  Scenario: Verify that user can search for address
    Given I am on google search page
    And I enter "34-18 Northern Blvd" into the search box
    Then I should see search result showing the same search "34-18 Northern Blvd" item
    Then I close the browser