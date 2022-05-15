@smoke
Feature: User could use login functionality to open his account

  Scenario: user could login with valid email and password
    Given user open login page
    When user can login with valid email and valid password
    Then user could login successfully
    And logged user logs out
