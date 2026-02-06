Feature: New Account

  Background:
    Given user should be on Home page

  Scenario: TC01
    When User click on New Account Link
    Then Account Information page should be display
    When User should me enter Account Name
    And Click on Save button
    Then Account page should be display.