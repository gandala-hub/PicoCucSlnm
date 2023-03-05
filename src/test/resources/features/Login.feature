Feature: Login Test
  @1 @smoketest
  Scenario: Login Test
    Given navigate to the url
    And enters credentials and clicks login
      |userId| TestUser_AKL|
      |password| Pa$$word@123|
    Then login successful
    Then click logout
