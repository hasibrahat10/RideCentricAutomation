Feature: RideCentric Login Screen Automation

  @login-01
  Scenario: I want to login Ride centric as an admin User
    Given I have entered email and click next button
    Then I have entered password and click login
    And I click on logout button
