Feature: feature to test login functionality

  Scenario: Admin enter a valid password
    Given browser is open and the user in login page
    When user  enters valid credentials and he entered "rand" and "11821655"
    Then the student should be loged in

  Scenario: Admin enter a invalid password
    Given admin on login page
    When Admin enters "sahar" and wrong "11821693"
    Then show error message and still on login page
    	
    	
    	