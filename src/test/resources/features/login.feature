Feature: Login Page

 Scenario: Login with valid credentials
  
  Given user should be open url in web browser
  When user input valid username and password
  And user click button login
  Then direct to home page