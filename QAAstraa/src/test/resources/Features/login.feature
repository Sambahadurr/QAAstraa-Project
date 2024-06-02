#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: QA Astraa Login Feature

  @tag1
  Scenario: QA Page Title
    Given User is on QAAstraa page
    When User get the title of the QA Astraa page
    Then User should get page title as "QA-Astraa"

  @tag2
  Scenario: QA Astraa Forgot password Link
    Given User is on QAAstraa page
    When User clicks on person icon
    Then QA Astraa forgot password link should be present

  @tag3
  Scenario Outline: QA Astraa Login Functionality
    Given User is on QAAstraa page
    When User clicks on person icon
    And User inputs username "<username>"
    And User inputs password "<password>"
    And User clicks on sign-in button
    Then User should not be able to login and should get an error message

    Examples: 
      | username | password |
      | Demo1    | Demo123  |
      | Demo12   | Demo1234 |
