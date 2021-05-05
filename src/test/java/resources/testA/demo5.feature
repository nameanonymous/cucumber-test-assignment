Feature: Order test more precisely

  Background:
    Given The AutomationPractice site is open
    And The Sign In link is clicked

  Scenario Outline:
    When Create an account start, the filed is '<field>' and email is '<email>'
    Then Click Create
    Then Click Mr
    Then Input First name '<first>'
    Then Input Last name '<last>'
    Then Input Pass '<passwd>'
    Then Add address '<address>' and City '<city>' and zip '<zip>'
    Then Add mobile
    Then Change State
    Then Submit account
    Examples:
      | field        | email                   | first | last       | passwd                              |address             |city    |zip  |
      | email_create | example@example.co.jp   | Lorem | example    | whattheheck                         |Nagyallomas         |Debrecen|40280|
      | email_create | hello@hello.co.uk       | Ipsum | valid      | passpass                            |Fenyes udvar 1      |Debrecen|40290|