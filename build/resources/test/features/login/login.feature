Feature: Login
  As a web user, this feature seeks to log in to the page

  Background:
    Given the user enters the page "demo"
    #When the user enters the User option

    Scenario: Login with correct credentials
      And the user enters the Username "jhorfana"
      And the user enters the password "As1234"
      And the user selects the Sing in button
