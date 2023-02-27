Feature: This feature is use for testing UI of Home Page

  @orderPlaced
  Scenario: Verify User can place an order without Shipping address and payment Method on file
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'ozy234@gmail.com' and password 'America1@'
    And User click on login button
    And User should be logged in into Account
    And User change the category to 'Smart Home'
    And User search for an item 'kasa outdoor smart plug'
    And User click on Search icon
    And User click on item
    And User select quantity ‘2’
    And User click add to Cart button
    Then the cart icon quantity should change to ‘2’
    And User click on Cart option
    And User click on Proceed to Checkout button
    And User click Add a new address link for shipping address
    And User fill new address form with below information
      | country       | fullName | phoneNumber | streetAddress | apt | city      | state    | zipCode |
      | United States | ozge     |  3404568756 | 34 Tory Rd    |  22 | Rockville | Maryland |   20845 |
    And User click Add Your Address button
    And User click Add a credit card or Debit Card for Payment method
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 1234567898765432 | ozge       |               5 |           2025 |        20834 |
    And User click on Add your card button
    And User click on Place Your Order
    Then a message should be displayed ‘Order Placed, Thanks’
