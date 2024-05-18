Feature: TypeofProperty

  Background:
    Given the user on home page
    When the user click on loginLogo
    And the user enter login email as 'spotlet123@gmail.com'
    And the user enter login password as 'Spotlet@222'
    And the user click on login button
    Then home page is displayed
    And the user click on list your space
    And the user click on basic plan

  Scenario: select any property
    And the user select cafe
    Then the user click on save and continue button

  Scenario: select type of property in search
    When the user enter cafe in search
    And the user select cafe
    Then the user click on save and continue button

  Scenario: Select Others
    When the user selects type of property others
    Then the user enter property name in others
    And the user click on property name submit button
    And the user click on save and continue button
