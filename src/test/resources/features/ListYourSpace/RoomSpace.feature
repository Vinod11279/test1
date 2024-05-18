Feature: RoomSpace

  Background:
    Given the user on home page
    When the user click on loginLogo
    And the user enter email as "spotlet123@gmail.com"
    And the user enter password as "Spotlet@222"
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
    And the user select balcony by terrace
    And the user select Ev charging station
    And the user click on save and continue button
    Then the user redirect to room spaces window

  Scenario: Add one room
    Then the user enter name in room or space as "Bed1"
    And the user enter dimension of the roomspace and description
    And the user click on save option for name
    And the user click on save and continue button
    Then pricing and timing window will open

  Scenario:Added two rooms and edit one room and save one room without editing
    Then the user enter name in room or space as "Bed1"
    And the user enter dimension of the roomspace and description
    And the user click on save option for name
    And the user click add new button
    Then the user enter name as balcony in roomspace
    And the user enter dimension of the roomspace and description
    And the user click on save option for name
    And the user select first room and edit details
    And the user click on save option for name
    And the user click on save and continue button
    Then pricing and timing window will open

  Scenario:Added two rooms and delete one room and save one room
    Then the user enter name in room or space as "Bed1"
    And the user click on save option for name
    And the user click add new button
    Then the user enter name as balcony in roomspace
    And the user click on save option for name
    And the user delete the first name
    And the user click on save and continue button
    Then pricing and timing window will open

  Scenario:Mandatory feild validation for roomspace
    Then save and continue button will disable until room name is saved
    Then the user enter name in room or space as "Bed1"
    And the user click on save option for name
    Then save and continue button will enable

