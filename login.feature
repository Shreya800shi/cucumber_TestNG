Feature: Login Test

  Scenario: Successful login with valid credentials
    Given user is on login page
    When user enters username "student" and password "Password123"
    Then user should be logged in successfully
