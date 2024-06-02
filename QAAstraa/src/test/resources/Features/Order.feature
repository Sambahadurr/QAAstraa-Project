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
Feature: Order

  @tag1
  Scenario Outline: Ordering an Item
    Given User is on QAA Astra page
    When User enters "<item>" in the search box
    And User click on search button
    And User click on the item
    And User increases the quantity by clicking on plus icon
    And User clicks on add to cart button
    And User clicks on checkout button
    And User inputs "<firstname>" and "<lastname>"
    And User selects the country
    And User inputs street "<address>" and city "<city>"
    And User selects state
    And User inputs zipcode "<zipcode>" and email "<email>" and phone number
    And User enters special note
    And User clicks on place order
    Then User should not be able to order and should get an error message

    Examples: 
      | item   | firstname | lastname | address | city      | zipcode | email                  | 
      | iphone | Samarth   | Bhatt    | Verona | Kitchener | N2R1T9  | samarthbhatt@gmail.com |
