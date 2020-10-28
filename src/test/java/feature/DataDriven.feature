@data_driven
Feature: This feature file is to test to datadriven capability

  Background: Connect to database
    Given SQL oracle is launched
    Then Database is connected


  Scenario: Simple One
    Given User is on Home Page
    When User Navigate to LogIn Page
    And User enters "testuser_1" and "Test@123"
    Then Message displayed Login Successfully

  Scenario: DataTables
    Given User is on Home Page
    When User Navigate to LogIn Page
    And User enters Credentials to LogIn
      | testuser_1 | Test@153 |
    Then Message displayed Login Successfully

  Scenario Outline: Scenario Outline with examples
    Given User is on Home Page
    When User Navigate to LogIn Page
    And User gives the "<username>" and "<password>"
    Then Message displayed Login Successfully
    Examples:
      | username   | password |
      | testuser_1 | Test@153 |
      | testuser_2 | Test@153 |

