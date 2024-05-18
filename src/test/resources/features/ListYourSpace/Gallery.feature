Feature: Gallery images
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
    And the user select balcony by terrace
    And the user select Ev charging station
    And the user click on save and continue button
    Then the user redirect to room spaces window
    Then the user enter name in room or space as "Bed1"
    And the user enter dimension of the roomspace and description
    And the user click on save option for name
    And the user click on save and continue button
    Then pricing and timing window will open
    Then the user select INR in select currency
    And the user click film as yes
    And the user enter hourly price ans 100
    And the user enter no of attendees allowed as 100
    And the user select minimum booking hours as four hours
    And the user select booking available for '24' hours
    And the user click on save and continue button
    Then Gallery window will open

  Scenario:Minimum Images in main property and rooms/space
    Then the user upload 5 images in main property
    Then the user upload 2 images in room or space
    Then the user click on save and continue button
    Then policies window will open

  Scenario:Maximum Images in main property and rooms/space and given name for it
    Then the user upload 30 images in main property
    Then add more images button invisible
    Then the user upload 4 images in room or space
    Then the user click on save and continue button
    Then policies window will open

  Scenario:Adding duplicate images
    Then the user upload 5 images in main property
    Then only JPEG and PNG pop up error will appear

  Scenario: Mandatory field validation
    Then the user click on save and continue button
    Then please upload min 5 images pop up will appear





