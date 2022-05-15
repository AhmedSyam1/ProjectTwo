@smoke
Feature: user could add different products to Compare list

  Scenario: user could add different products to Compare list
    Given user can add First Product to Compare
    And user can add Second Product to Compare
    And user can add Third Product to Compare
    When user navigates to Compare products
    Then user could compare between the selected products
    And user can clear a product from list
    And user deletes all the list

