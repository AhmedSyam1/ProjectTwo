@smoke
Feature: user could switch between currencies

  Scenario: user can switch currency
    Given user selects a product
    When user changes the currency
    Then user could find the selected currency


