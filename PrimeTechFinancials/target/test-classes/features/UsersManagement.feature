@userManagement
 Feature: User MAngrmrnt / access mangemnt
 @validLogin
 Scenario: User should be able to login with valid credentials
 Given As a user, I am on the login page
 When I enter valid useremail and valid password
 And click on  login button
 Then i should be logged in
 
  @invalidEmailLogin
  Scenario: Invalid email login attempts
    Given As a user, I am on the login page
    When I enter invalid username and valid password
    And Click on login button
    Then I should see an error message "These credentials do not match our records." displays
    And I should not be logged in
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
