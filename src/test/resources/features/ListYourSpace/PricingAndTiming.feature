Feature: Pricing And Timing functionalities
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
    Then the user enter name in room or space as 'Bed1'
    And the user enter dimension of the roomspace and description
    And the user click on save option for name
    And the user click on save and continue button
    Then pricing and timing window will open

  Scenario: Selected Currency as USD and enabled film shooting
    Then the user select USD in select currency
    And the user click film as yes
    And the user enter hourly price ans 100
    And the user enter no of attendees allowed as 100
    And the user select minimum booking hours as '8' hours
    And the user select booking available for '24' hours
    And the user click on save and continue button
    Then Gallery window will open

  Scenario:Selected Currency as USD and enabled film shooting and set hrs as  before start time
    Then the user select USD in select currency
    And the user click film as yes
    And the user enter hourly price ans 100
    And the user enter no of attendees allowed as 100
    And the user select minimum booking hours as four hours
    And the user select booking available hours set hours as '5' to '4'
    Then end time cannot be before start popup will be display

  Scenario:Selected Currency as USD and enabled film shooting and mentioned set hrs as 1 hr given duration 4 hr
    Then the user select USD in select currency
    And the user click film as yes
    And the user enter hourly price ans 100
    And the user enter no of attendees allowed as 100
    And the user select minimum booking hours as four hours
    And the user select booking available hours set hours as '5' to '6'
    Then end time cannot be before start popup will be display

  Scenario:Selected Currency as INR and enabled film shooting
    Then the user select INR in select currency
    And the user click film as yes
    And the user enter hourly price ans 100
    And the user enter no of attendees allowed as 100
    And the user select minimum booking hours as four hours
    And the user select booking available for '24' hours
    And the user click on save and continue button
    Then Gallery window will open

  Scenario:Selected Currency as USD and enabled Stay
    Then the user select USD in select currency
    And the user click stay as yes
    And the user enter weekday price as "100"
    And the user enter weekend price as "1000"
    And the user enter base adult as '4'
    And the user enter maximum adult as '5'
    And the user enter mattress as '1'
    And the user click timings available for mon
    And the user click on save and continue button
    Then Gallery window will open

  Scenario:Selected Currency as USD and enabled film shooting and Stay
    Then the user select USD in select currency
    And the user click stay as yes
    And the user enter weekday price as "100"
    And the user enter weekend price as "1000"
    And the user enter base adult as '4'
    And the user enter maximum adult as '5'
    And the user enter mattress as '1'
    And the user click timings available for mon
    And the user click film as yes
    And the user enter hourly price ans 100
    And the user enter no of attendees allowed as 100
    And the user select minimum booking hours as '8' hours
    And the user select booking available for '24' hours
    And the user click on save and continue button
    Then Gallery window will open

  Scenario:Selected Currency as USD and enabled  event
    Then the user select USD in select currency
    And the user select event as yes
    And the user enter event weekday price as "100"
    And the user enter event weekend price as "1000"
    And the user enter event no of attendees allowed as "100"
    And the user enter event minimum booking house
    And the user click timing available for booking as '24'
    And the user click catering service as yes
    And the user enter buffet name as "Biryani"
    And the user enter veg price
    And the user enter non veg price
    And the user click on delete
    And the user click on save and continue button
    Then Gallery window will open

  Scenario:Selected Currency as USD and enabled TV shooting
    Then the user select USD in select currency
    And the user select tv shooting as yes
    And the user enter tv hourly price as "100"
    And the user enter tv no of attendees as "100"
    And the user select tv minimum booking hours as '8'
    And the user select timing booking as '24' hours
    And the user click on save and continue button
    Then Gallery window will open

  Scenario:Selected Currency as INR and enabled TV shooting
    Then the user select INR in select currency
    And the user select tv shooting as yes
    And the user enter tv hourly price as "100"
    And the user enter tv no of attendees as "100"
    And the user select tv minimum booking hours as '8'
    And the user select timing booking as '24' hours
    And the user click on save and continue button
    Then Gallery window will open

  Scenario: Pricing- Film shooting mandatory validations
    Then the user select INR in select currency
    Then save and continue button has to be disabled
    And the user click film as yes
    And the user click on save and continue button
    Then film error text should be visible for hours,attendees,minimum booking,timing

  Scenario:Pricing- tv mandatory validations
    Then the user select INR in select currency
    And the user select tv shooting as yes
    Then the user click on save and continue button
    Then tv error text should be visible for hours,attendees,minimum booking,timing

  Scenario:Pricing- event mandatory validations
    Then the user select INR in select currency
    And the user select event as yes
    Then the user click on save and continue button
    Then event error text should be visible for hours,attendees,minimum booking,timing

  Scenario:Pricing- stay mandatory validations
    Then the user select INR in select currency
    And the user click stay as yes
    Then the user click on save and continue button
    Then stay error text should be visible for hours,attendees,minimum booking,timing

  Scenario: Invalid timings
    Then the user select USD in select currency
    And the user select tv shooting as yes
    And the user enter tv hourly price as "100"
    And the user enter tv no of attendees as "100"
    And the user select tv minimum booking hours as '8'
    And the user select booking available hours set hours as '6' to '8'
    Then end time cannot be before start popup will be display
    And the user select booking available hours set hours as '11' to '9'
    Then end time cannot be before start popup will be display