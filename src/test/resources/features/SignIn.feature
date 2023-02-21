@smoketest
Feature: TEk Retail Application SignIn feature

Background:
    Given User is on retail website
    When User click on Sign in option
    
    
  Scenario: Verify user sign in into Retail Application
    And User enter email email 'ozi@gmail.com' and password 'Ozi12345@'
    And User click on login button
    Then User should be logged in into Account

  
 
