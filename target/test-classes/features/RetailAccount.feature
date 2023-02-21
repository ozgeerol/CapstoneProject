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
