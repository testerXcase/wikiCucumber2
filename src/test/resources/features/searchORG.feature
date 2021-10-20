@search

Feature: Search field test suit

  Background: User is on home page to search
    When user taps on search field

  @smoke
  Scenario Outline: Searching with a valid entry
    And user types "<searchText>" on search field
    And user taps on first result
    Then user reads the result as "<resultText>" on Content Page
    Examples:
      | searchText | resultText |
      | Berlin     | Berlin     |
      | Berrlin    | Berlin     |
      | Dortmund   | Dortmund   |

  @smoke
  Scenario: Searching with an invalid entry
    And user types "hhh888**55" on search field
    Then user reads "No results found" on Search Page


    @wip
  Scenario: Search and change the language
    And user types "Berlin" on search field
    And user taps on language button
    And user selects "Deutsch" language
    And user taps on first result
    Then user is able to see "DE" content
