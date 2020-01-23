Feature: Search and find accommodation on the Airbnb website

  As a human
  I want to search Airbnb on Google
  So I can find Airbnb website

  Scenario: Search Airbnb on the web
    Given I have visited Airbnb on te web
    When I search for Airnbn
    |origin|
    |Sahagún      |
    Then I verify that I found my accommodation