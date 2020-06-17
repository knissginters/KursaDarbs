@AfterEach
Feature: Search
Scenario: Make a invalid search
    Given I am in Landing page
    When I select Search Icon
    Then I am navigated to Search page
    When I uncheck the filters
    And I do search by 'Ginters'
    Then I get a warning message

@AfterEach
Scenario: Make a invalid search
    Given I am in Landing page
    When I select Search Icon
    Then I am navigated to Search page
    When I do search by 'Ginters'
    Then Search results contain search parameter
