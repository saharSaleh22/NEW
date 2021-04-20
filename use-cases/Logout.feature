Feature: logoutFeatur
Description: The purpose of this feature is to test the Background keyword
 
Background: 
 Given I am logged in




 Scenario: Administrator logs out
 Given browser is open and the user in log out page
 When admin is choose logout
    Then the Admin should be loged out
    And return to login page
    
    
    
    
    