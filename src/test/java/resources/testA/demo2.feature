Feature: YourLogo sign in page test

  Background:
    Given The AutomationPractice site is open

  Scenario Outline:
    Given The '<field>' is filled with '<parameter>'
    When Search the womens cloths
    Then The '<msg>' message is shown
    Examples:
      | field            | parameter         | msg                                          |
      | search_query_top | Dress             |                                              |
      | search_query_top | Shirt             |                                              |
      | search_query_top | mens              | No results were found for your search "mens" |