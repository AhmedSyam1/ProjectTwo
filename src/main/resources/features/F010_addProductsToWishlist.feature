@smoke
Feature: user could add different products to Wishlist

  Scenario: user could add different products to his Wishlist
    Given user selects his favorite product
    When user adds a product to the Wishlist
    And user adds another product to the Wishlist
    Then logged user navigates to his Wishlist page
