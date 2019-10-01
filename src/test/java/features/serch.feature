@search
  Feature: Verify search input

    Scenario: Search button
      Given User on home page of apple.com
      And User searches for Iphone
      Then User should be able to choose
      And User should see the product