Feature: Login Page

 Scenario: Login with invalid credentials
  
  Given user should be open url
  When user input invalid uname and pwd
  And click button login
  Then cannot sign in