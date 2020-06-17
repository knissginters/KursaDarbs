@AfterEach
Feature: Test privacy policy message

  Scenario: Read privacy policy
    Given I am in Landing page
    And I see the privacy policy banner
    When I select the privacy policy banner's hyperlink
    Then PDF file is opened