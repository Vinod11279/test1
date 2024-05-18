Feature: Basic info functionalities

  Background:
    Given the user on home page
    When the user click on loginLogo
    And the user enter login email as 'spotlet123@gmail.com'
    And the user enter login password as 'Spotlet@222'
    And the user click on login button
    Then home page is displayed
    When the user click on list your space
    Then the user click on basic plan
    And the user select cafe
    And the user click on save and continue button

  Scenario: Basic Info
    And the user enter property name
    And the user enter property size
    And the user click in house parking no
    And the user click street parking no
    And the user click security camera no
    And the user click valet parking no
    And the user enter description of location
    And the user click on save and continue button
    Then location window will appear

  Scenario: Basic Info In house parking enabled
    And the user enter property name
    And the user enter property size
    And the user click in house parking yes
    And the user enter no cars as 10
    And the user click street parking yes
    And the user click security camera yes
    And the user click valet parking yes
    And the user enter description of location
    And the user click on save and continue button
    Then location window will appear

  Scenario: Basic info mandatory field validation

