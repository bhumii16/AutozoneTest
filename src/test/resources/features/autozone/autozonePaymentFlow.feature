Feature: Autozone Website Payment

  Scenario: Successful Payment Flow
  	Given I am on the home page URL "https://www.autozone.com"
    Then I click on add vehicle button
    Then I select vehicle year
    Then I select vehicle make
    Then I select vehicle model
    Then I search item
    Then I click on item "Marine Battery"
    Then I add item to cart
    Then I search item
    Then I click on item "RV Battery"
    Then I add item to cart
#    When I goto Cart and click Checkout
#    Then I click on Continue As Guest
#    Then I click on Continue button
#    Then I enter card details, billing address and complete payment
#    Then Payment should be successful

  Scenario: Un-Successful Payment Flow
    Given I am on the home page URL "https://www.autozone.com"
    Then I click on add vehicle button
    Then I select vehicle year
    Then I select vehicle make
    Then I select vehicle model
    Then I search item
    Then I click on item "Marine Battery"
    Then I add item to cart
    Then I search item ""
    Then I click on item "RV Battery"
    Then I add item to cart
#    When I goto Cart and click Checkout
#    Then I click on Continue As Guest
#    Then I click on Continue button
#    Then I enter card details, billing address and complete payment
#    Then Payment should not be successful
