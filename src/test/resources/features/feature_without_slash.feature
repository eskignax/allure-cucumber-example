Feature: FEATURE - without slash in description

  Scenario: With / in name
    Given feature or scenario has / in description
    When running tests
    Then report.json is saved

  Scenario: Without slash in name
    Given feature and scenario do not have / in description
    When running tests
    Then report.json is saved