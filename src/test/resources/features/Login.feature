Feature: Login Functionality


  Background:
    Given the user on home page
    And the user click on loginLogo

  Scenario: Login With Existing account
    And the user enter login email as 'spotlet123@gmail.com'
    And the user enter login password as 'Spotlet@222'
    And the user click on login button
    Then home page is displayed

  Scenario: Unregistered Email
    And the user enter login email as 'spotlet@gmail.com'
    And the user enter login password as 'Spotlet@222'
    And the user click on login button
    Then user does not exist popup is displayed

  Scenario: Wrong Password
    And the user enter login email as 'spotlet123@gmail.com'
    And the user enter login password as 'Spotlet222'
    And the user click on login button
    Then user does not exist popup is displayed

  Scenario: Forgot Password
    And the user enter login email as 'spotlet123@gmail.com'
    And the user click on forgot password
    Then the user enter reset email
    And the user click reset email submit button
    Then please check your email message will appear

  Scenario: Sign in Google existing account
    And the user click on google button
    Then google window will open

  Scenario: Sign in with whatsapp
    And the user click on whatsapp button
    And the user enter whatsapp number
    And the user click whatsapp login button
    Then whatsapp otp window will appear


  Scenario: Sign in Mandatory field validation
    And the user click on login button

