Feature: I open e-shop, select some category and add two things with highest price to cart

  @e2e
  Scenario: Adding two things with highest price, basic case
    Given I have opened main shop page "/"
    And I see that page has been loaded
    And I select Mobiles and PCs
    And I select Xiaomi Phones
    Then I see page with offers of "xiaomi"
    When I select price of each item on the page
    And I choose two items with top highest price
    And I add first to the cart
    Then I see popup with Continue Shopping button
    And I continue shopping
    And I select second offer with highest price
    And I continue to the cart
    Then I see a cart with two selected items inside
    And I check that total price equals to sum of both items price