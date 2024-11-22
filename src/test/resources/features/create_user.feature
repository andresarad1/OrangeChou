@Suite @createCandidate
Feature: CP01 - add candidate

  Background: fill out form for new candidate
    Given client navigates to website
    When Enter valid credentials

  @addCandidates
  Scenario: 1 - Add a candidate for hiring
    When Recruitment form opens and clicks add
    When The candidate form is filled out
    Then It is validated that the candidate has been hired
