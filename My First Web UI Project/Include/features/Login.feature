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
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario Outline: Login
    Given I am on 'Login' site
    When I input email 'hoangmen200799@gmail.com'
    And I input pass 'hoangmen99'
    And I click 'Login'
    Then I will navigate to Home page
    But login failed
    Then I verify notifycation

    Examples: 
      | name  | value | status  |
      | email | "hoangmen200799@gmail.com" | success |
      | pass | "hoangmen99" | Fail    |
      
      