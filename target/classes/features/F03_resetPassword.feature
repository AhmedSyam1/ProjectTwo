@smoke
Feature: User could reset his password

  Scenario: user reset his password successfully
    Given user clicks on forgot password
    When user enters a valid email address
    And user clicks on recover button
    Then user got a Displayed Message
    And user could close the Notification Bar


