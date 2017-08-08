Feature: FEATURE/with slash in description

  Scenario: With / in name
    Given feature or scenario has / in description
    When running tests
    Then report.json is not saved

  Scenario: Without slash in name
    Given feature or scenario has / in description
    When running tests
    Then report.json is not saved