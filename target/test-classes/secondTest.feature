Feature: third test as an example


  Scenario: Verify that user can register for new account -mercury tours
    Given I am on the home page of mercury tours
    When I click on the register link
    And I should see register page
    And I enter all required information
    Then I should see "Thank you for registering"
    Then I close the browser
