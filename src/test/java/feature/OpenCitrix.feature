Feature: Open Citrix

  @citrix
  Scenario: Open Citrix
    Given User have opened Citrix
    When User have gave the credentials
    Then Citrix is launched