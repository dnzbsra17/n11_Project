Feature:Login Functionaliy

  Scenario: Login functionality with valid username and password
    Given Navigate to web site
    When Enter valid username and password
    And Click on the login button
    Then User should login successfully
