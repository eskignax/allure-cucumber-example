Feature: Step with @Step annotation

  Scenario: Scenario which makes call to method with @Step annotation
    Given step with @Step
    When running tests
    Then exception thrown
