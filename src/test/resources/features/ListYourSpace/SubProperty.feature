Feature: Sub Property Functionalities
  Scenario: sub property
    Given the user on home page
    When the user click on loginLogo
    And the user enter login email as 'spotlet123@gmail.com'
    And the user enter login password as 'Spotlet@222'
    And the user click on login button
    Then home page is displayed
    When the user click on list your space
    Then the user click on premium plan
    Then the user click on pay now first
    Then the user click on pay now second
    Then the user enter phone number for premium subscription
    Then the user enter email if for premium subscription
    Then the user click on proceed button
    Then the user click on show qr
    Then type of property window will appear
#    And the user select cafe and mart
#    And the user click on save and continue button
#    And the user enter property name
#    And the user enter property size
#    And the user click in house parking no
#    And the user click street parking no
#    And the user click security camera no
#    And the user click valet parking no
#    And the user enter description of location
#    And the user click on save and continue button
#    Then location window will appear
#    When the user select current location
#    And the user click on save and continue button
#    Then all amenities window will appear
#    And the user select balcony by terrace
#    And the user select Ev charging station
#    And the user click on save and continue button
#    Then the user redirect to room spaces window
#    Then the user enter name in room or space as "Bed1"
#    And the user enter dimension of the roomspace and description
#    And the user click on save option for name
#    And the user click on save and continue button
#    Then pricing and timing window will open
#    Then the user select INR in select currency
#    And the user click film as yes
#    And the user enter hourly price ans 100
#    And the user enter no of attendees allowed as 100
#    And the user select minimum booking hours as four hours
#    And the user select booking available for '24' hours
#    And the user click on save and continue button
#    Then Gallery window will open
#    Then the user upload 5 images in main property
#    Then the user upload 2 images in room or space
#    Then the user click on save and continue button
#    Then policies window will open
#    Then the user select cancellation policy as 5 days
#    Then the user select property rules as unmarried couples and alcohol as no
#    Then the user select identity proof as government id
#    Then the user select all property restrictions as no
#    Then the user accept terms and conditions
#    Then the user click on save and continue button
#    Then property manager details window will
#
#
#  Scenario: Sign up details are fetched in property manager details
#    Then the user select designation as property owner
#    Then the user click final submit button
#
#
#  Scenario: Choosed a Type of category which has sub drop down
#    When the user select sub property as yes
