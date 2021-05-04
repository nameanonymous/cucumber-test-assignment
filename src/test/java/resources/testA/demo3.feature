Feature: YourLogo sign in page test

  Background:
    Given The AutomationPractice site is open
    And The Sign In link is clicked

  Scenario Outline:
    Given The '<field>' is filled with '<parameter>'
    Given  The '<field2>' is filled with '<password>'
    When The Sign In button is clicked
    Then Go back to home
    When The Product 1 is added to the cart
    Then Go to the casher
    Then Change the quantity to 10
    Then Go payment
    Then Proceed to checkout
    Then Agree Terms of Service
    Then Checkout
    Then Select bank payment
    Then Confirm my order
    Then The '<string>' message is shown
    Then log out

    Examples:
      | field | parameter             | field2 | password   | string                              |
      | email | example@example.com   | passwd | example    | Your order on My Store is complete. |
      | email | valid@valid.com       | passwd | valid      | Your order on My Store is complete. |