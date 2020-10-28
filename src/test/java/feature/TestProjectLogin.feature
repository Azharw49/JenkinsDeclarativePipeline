Feature: Login Action


  Background:
    Given Driver is launched
    Then Open chrome

@Test_Project
  Scenario Outline: Login with different credentials
    Given TestUser in the login page
    When TestUser gives <username> and <password>
    And TestUser Clicks on the Login Button
    Then TestUser is navigated to HomePage

  Examples:
  | username | password|
  | Azhar    | 12345  |
  | Libin    | 12345  |
  | Navi     | 12345  |



