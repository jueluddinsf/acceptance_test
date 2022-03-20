Feature: As a mercury tours user
  I need to be able to use the application
  In order to book flight, car, hotel and cruses.


  Background: Verify the user can register for new account
    Given I am on the home page
    When I click link "REGISTER"
    And I fillout all information in register page
    Then I should have an account created

# this test needs to be updated.
  Scenario: Verify that if user do not have a preference for airline they should see all avilable airlines for arrival and depeture flights
     Given user clicks on flight
    When user clicks continue from flight page
    Then user should see "Blue Skies Airlines 360"
    Then user should see "Pangaea Airlines 362"
    Then user should see "Unified Airlines 363"
    Then user should see "Unified Airlines 363"


