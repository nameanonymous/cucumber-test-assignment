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
      | email_create | example@example.co.uk   | Alpha | bestas     | alphtheheck                         |Vistonlatasha 21    |Debrecen|50280|
      | email_create | gain@weight.co.jp       | Ipsir | beeps      | testpass                            |This is address 12  |Debrecen|10290|
      | email_create | earn@money.co.hu        | Lowds | Vocamat    | googlecom                           |Also address 13     |Debrecen|30280|
      | email_create | get@get.co.uk           | Suzu  | Tarou      | passtest                            |Fenyes udvar 1      |Debrecen|50290|