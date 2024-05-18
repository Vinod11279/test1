Feature: SignUp Functionalities

  Background:
    Given the user on home page
    When the user click on register button

  Scenario Outline: New User OTP
    Then the user enter first name as <firstname>
    And the user enter last name as <lastname>
    And the user enter email as <email>
    And the user enter phone number as <mobile>
    And the user enter password as <password>
    And the user click on terms and conditions
    And the user click register button
    Then otp window will appear

    Examples:
    | firstname | lastname |      email       | mobile      | password    |
    | spot      | let      | spotlet@gmail.com| 8888888889  | Spotlet@222 |


  Scenario: Google Account
    And user click on google button
    Then google sign in window will appear

  Scenario Outline: Already Existed Number
    Then the user enter first name as <firstname>
    And the user enter last name as <lastname>
    And the user enter email as <email>
    And the user enter phone number as <mobile>
    And the user enter password as <password>
    And the user click on terms and conditions
    And the user click register button
    Then phone number already existed pop up will appear

    Examples:
      | firstname | lastname |      email       | mobile      | password    |
      | spot      | let      | spotlet@gmail.com| 8888888888  | Spotlet@222 |

  Scenario Outline: Invalid Otp
    Then the user enter first name as <firstname>
    And the user enter last name as <lastname>
    And the user enter email as <email>
    And the user enter phone number as <mobile>
    And the user enter password as <password>
    And the user click on terms and conditions
    And the user click register button
    Then otp window will appear
    Then the user enter invalid otp

    Examples:
      | firstname | lastname |      email       | mobile      | password    |
      | spot      | let      | spotlet@gmail.com| 8888888889  | Spotlet@222 |

  Scenario Outline: Resend Otp
    Then the user enter first name as <firstname>
    And the user enter last name as <lastname>
    And the user enter email as <email>
    And the user enter phone number as <mobile>
    And the user enter password as <password>
    And the user click on terms and conditions
    And the user click register button
    Then otp window will appear
    Then user click resend otp
    Then code is sent and timer is display

    Examples:
      | firstname | lastname |      email       | mobile      | password    |
      | spot      | let      | spotlet@gmail.com| 8888888889  | Spotlet@222 |

  Scenario Outline: Already registered email account
    Then the user enter first name as <firstname>
    And the user enter last name as <lastname>
    And the user enter email as <email>
    And the user enter phone number as <mobile>
    And the user enter password as <password>
    And the user click on terms and conditions
    And the user click register button
    Then phone number already existed pop up will appear

    Examples:
      | firstname | lastname |      email          | mobile      | password    |
      | spot      | let      | spotlet123@gmail.com| 8888888889  | Spotlet@222 |

  Scenario: Error message for empty input
    And the user click register button
    Then error message for first name
    And error message for email
    And error message for password

  Scenario Outline: Invalid phone number
    Then the user enter first name as <firstname>
    And the user enter last name as <lastname>
    And the user enter email as <email>
    And the user enter phone number as <mobile>
    And the user enter password as <password>
    And the user click on terms and conditions
    And the user click register button
    Then enter valid phone number error message will appear

    Examples:
      | firstname | lastname |      email          | mobile      | password    |
      | spot      | let      | spotlet@gmail.com   | 888888888   | Spotlet@222 |

  Scenario: Invalid malaysia phone number
    Then the user enter first name as 'spot'
    And the user enter last name as 'let'
    And the user enter email as 'spotlet@gmail.com'
    And the user select malaysia on dropdown
    And the user enter malaysia mobile number as 8888
    And the user enter password as 'Spotlet@222'
    And the user click on terms and conditions
    And the user click register button
    Then enter valid phone number error message will appear



  Scenario: Valid malaysia phone number
    Then the user enter first name as 'spot'
    And the user enter last name as 'let'
    And the user enter email as 'spotlet@gmail.com'
    And the user select malaysia on dropdown
    And the user enter valid malaysia number as 88888888
    And the user enter password as 'Spotlet@222'
    And the user click on terms and conditions
    And the user click register button
    Then otp window will appear

