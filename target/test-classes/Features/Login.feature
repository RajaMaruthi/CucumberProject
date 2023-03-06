Feature: Login page validation

  Scenario Outline: Login page with valid credentilas
    Given user is on the login page
    When user is enters the <username> and <password>
    And click on the login button
    Then the user should navigates to home page
    And click on the logout button

    Examples: 
      | username | password    |
      | student  | Password123 |
      | student  | password12  |
