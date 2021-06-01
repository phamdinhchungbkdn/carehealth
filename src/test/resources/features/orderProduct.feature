@OrderProduct

Feature: Placing an order product and completing the process till payment

  Scenario Outline: Verify that product is ordered when user completes the order process
    Given navigate to home page
    When login to the website
    And hover mouse on Women link
    And click on T-shirt submenu
    And hover mouse on a product "<position>"
    And click on More button
    And increase quantity to "<number>"
    And select size "<size>"
    And select color "<color>"
    And click Add To Cart button
    And click Proceed To Checkout button
    And complete the buy order process till payment
    Then verify that product is ordered
    Examples:
      | position | number | size | color |
      | 1        | 2      | L    | Blue  |