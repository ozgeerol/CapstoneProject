Feature: Retail Application Account Feature

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email email 'ozy234@gmail.com' and password 'America1@'
    And User click on login button
    Then User should be logged in into Account

  @smokeTest
  Scenario: Verfiy user can update Profile Information
    When User click on Account option
    And User update Name 'Ozi' and '2405467889'
    And User click on Update button
    Then User profile information should be updated

  @SmokeTest
  Scenario: Verify User can Update password
    When User click on Account option
    And User enter below information
      | previousPassword | newPassword | confirmPassword |
      | America1@        | America12@  | America12@      |
    And User click on Change Password button
    Then a message should be displayed 'Password Updated Successfully'

  @test
  Scenario: Verify User cann add a payment method
    When User click on Account option
    # And User click on Add a payment method link
    And User fill Debit or credit card informetion
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 1282123131234003 | ozge       |               2 |           2025 |          124 |
    And User click on Add your card button
    Then a message should be displayedd 'Payment Method added successfully'

  @Smoketest
  Scenario: Verify User can edit Debit or Credit card
    When User click on Account option
    And User click on Card option
    And User click on Edit option of card section
    And User edit information with below data
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | SecurityCode |
      | 1994567890124006 | ozge       |               3 |           2026 |          234 |
    And User click on Update your card button
    Then a message should be displayedd1 'Payment Method added successfully'

  @test
  Scenario: Verify User can remove Debit or Credit card
    When User click on Account option
    And User click on Card option
    And User click on remove option of card section

  #  Then payment details should be removed
  @addAddress
  Scenario: Verify User can add  an Address
    When User click on Account option
    And User click on  Add address option
    And User fill new address form with below information
      | country | fullName | PhoneNumber | StreetAddress | apt | city | state | zipCode |
    And User click Add Your Address button
    Then a message should be displayedd2 'Address Added Successfully'

  @editAddress
  Scenario: Verify User can edit an Address added on account
    When User click on Account option
    And User click on edit address option
    And User edit new address form with below information
      | country | fullName | phoneNumber | streetAddress | apt | city | state | zipCode |
    And User clcik on Update Your Card button
    Then a message should be displayeddd1 'Address Updated Successfully'

  @removeAddress
  Scenario: Verify User can remove Address from Account
    When User click on Account option
    And User click on remove option of Address section
    Then Address details should be removed

  Scenario: Verify Shop by Department sidebar
    Given User is on retail website
    When User click on All section
    Then below options are present in Shop by Department sidebar
      | Electronics | Computers | Smart Home | Sports | Automative |

  @departmentSideBar
  Scenario Outline: Verify department sidebar options
    Given User is on retail website
    When User click on All section and User on <department>
    Then below options are present in department
      | <optionOne> | <optionTwo> |

    Examples: 
      | department  | optionOne                      | optionTwo                |
      | Electronics | TV & Video                     | Video Games              |
      | Computers   | Accessories                    | Networking               |
      | Smart Home  | Smart Home Lightning           | Plugs and Outlets        |
      | Sports      | Athletic Clothing              | Exercise & Fitness       |
      | Automotive  | Automative Parts & Accessories | MotorCycle & Powersports |

  @addItemToCart
  Scenario: Verify User can add an item to cart
    When User click on Sign in Option
    And user enter email 'ozy234@gmail.com' and password 'America1@'
    And User click on Login button
    And User should be logged in into account
    And User change the category to 'Smart Home'
    And User search for an item 'kasa outdoor smart plug'
    And User click on Search icon
    And User click on item
    And User select quantity '2'
    And User click add to Cart button
    Then the cart icon quantity should change to '2'

