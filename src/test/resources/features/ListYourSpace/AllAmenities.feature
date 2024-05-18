Feature: All Amenities

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
    And the user enter property name
    And the user enter property size
    And the user click in house parking no
    And the user click street parking no
    And the user click security camera no
    And the user click valet parking no
    And the user enter description of location
    And the user click on save and continue button
    Then location window will appear
    When the user select current location
    And the user click on save and continue button
    Then all amenities window will appear

  Scenario:Amenities(one sub drop down and one without)
    And the user select Air Conditioning
    And the user select balcony by terrace
    And the user click on save and continue button
    Then the user redirect to room spaces window

  Scenario:Amenities(Without sub drop down)
    And the user select balcony by terrace
    And the user select Ev charging station
    And the user click on save and continue button
    Then the user redirect to room spaces window

  Scenario: All Amenities without selection
    And the user click on save and continue button
    Then select atleast two amenities alert will appear

  Scenario: All Amenities with sub drop down selection
    And the user select Air Conditioning
    And the user select indoor swimming pool
    And the user click on save and continue button
    Then the user redirect to room spaces window

  Scenario: All Amenities others option
    And the user click on others button
    And the user enter new amenitys and click submit
    And the user select new amenitys
    And the user click on save and continue button




