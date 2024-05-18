Feature: Listing Your Space

  Background:
    Given the user on home page
    When the user click on list your space

  Scenario:without Login
    When the user click login in registation page
    And the user enter email as 'spotlet123@gmail.com'
    And the user enter password as 'Spotlet@222'
    And the user click on login button
    Then select your plan window will display

  Scenario:without Signup
    Then the user enter first name as 'spot'
    And the user enter last name as 'let'
    And the user enter email as 'spotlet@gmail.com'
    And the user enter phone number as 8888888889
    And the user enter password as 'Spotlet@222'
    And the user click on terms and conditions
    And the user click on register submit button
    Then otp window will appear





