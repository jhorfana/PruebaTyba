Feature: shopping flow
  As a web user, this fuature seeks to cover the different steps to make a purchase

  Background:
    Given the user enters the page "demo"
    When the user enters the User option
    And the user enters the Username "jhorfana"
    And the user enters the password "As1234"
    And the user selects the Sing in button
    And the user selects the Popular Item option

    Scenario Outline: Purchase of a product with different color references
      And the user selects product <product>
      And the user selects quantity products of the current color
      And the user selects the Add to cart button
      And the user selects another color
      And the user selects quantity products of the indicated color
      And the user selects the Add to cart button
      And the user selects the Cart option
      And the user selects the CheckOut button
      And the user selects the Next button
      And the user selects the MasterCredit option
      And the user enters the card number <card_number>
      And the user enters the cvv number <cvv>
      And the user enters the expiration month <month>
      And the user enters expiration year <year>
      And the user enters name printed on card <name>
      And the user selects the Pay now button
      Examples:
      |product                         | card_number      | cvv | month | year | name      |
      |"HP ROAR PLUS WIRELESS SPEAKER" | "5254133674403564" | "123" | "11"    |  "25"  | "Prueba" |
