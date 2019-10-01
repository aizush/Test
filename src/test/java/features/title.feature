@title
Feature: HTML Title

  Scenario Outline: Test html title
    Given User can see the page
    Then The title is "<title text>"

    Examples:
    |title text|
    |Apple     |
