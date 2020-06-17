@AfterEach
Feature: Test login

  Scenario: invalid login
    Given I am in Landing page
    When I select Mail icon
    And I enter invalid username
    And I enter invalid password
    And I select submit button
    Then I am navigated to Moodle
    And I enter valid username
    And I enter valid password
    Then I see warning about invalid login