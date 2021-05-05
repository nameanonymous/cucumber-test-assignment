Feature: Order test more precisely

  Background:
    Given The AutomationPractice site is open
    And The Sign In link is clicked

  Scenario Outline:
    Given The '<field>' is filled with '<parameter>'
    Given  The '<field2>' is filled with '<password>'
    When The Sign In button is clicked
    Then Go back to home
    Given The '<string>' is filled with '<parameter2>'
    When Search the womens cloths
    Then Get more details
    Then Change the size to M
    Then Submit
    Then Go to the cashier
    Then Change the quantity to 10
    Then Go payment
    Then Proceed to checkout
    Then Agree Terms of Service
    Then Checkout
    Then Select bank payment
    Then Confirm my order
    Then log out

    Examples:
      | field | parameter             | field2 | password   | string           | parameter2|
      | email | example@example.com   | passwd | example    | search_query_top | shirt     |
      | email | valid@valid.com       | passwd | valid      | search_query_top | shirt     |