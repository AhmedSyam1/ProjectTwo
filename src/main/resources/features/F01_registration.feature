@smoke
Feature: New user could register his Data

  Scenario: new user could register with valid data

    Given new user open registration page
    And new user registers with valid data
    When new user can register
    Then a success message is displayed
    And user logs out after registering

