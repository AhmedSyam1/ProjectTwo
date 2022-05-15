@smoke
Feature: user could Create Successful Order

  Scenario: user could Create Successful Order
    Given  user agrees with terms and proceed to Checkout
    When user fills out Billing address to Create Order
    And user confirms Billing address
    And user selects Shipping Method to Continue
    And user selects Payment Method to Continue
    When user fills out Payment Information
    Then user could confirm his order
    And user can check order details
    And user could save invoice
    And user could print invoice







