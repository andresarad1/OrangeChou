@Suite @Login
Feature: CP01 - Validate login

  Background: Validate login with valid credentials

    Given client navigates to website
  @ValidCredentials
  Scenario: 1 - validate with correct credentials
    When Enter valid credentials
