Feature: As a user I would like to be able to
  login to flight reservation application

  Scenario: verify login using a valid user name and valid password
    Given I am on the home page
    When I enter valid username and password
    Then I should logged in