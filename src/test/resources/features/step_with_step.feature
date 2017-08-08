Feature: Step with @Step annotation

  Scenario: Scenario which makes call to method with @Step annotation
    Given step with @Step
    When running tests
    Then exception thrown

  Scenario: Without slash in name
    Given feature or scenario has / in description
    When running tests
    Then report.json is not saved