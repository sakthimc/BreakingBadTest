Feature: As a mobile user of Breaking Bad Explorer
  I want to be able to search for a specific character
  So that I can see their status (Alive/Deceased) and in which seasons they appeared

  @CharacterSearch
  Scenario Outline: Search for Jesse pinkman
    Given the breaking bad app is launched
    When I search for "<charactername>"
    Then I should see character profile "<status>"

    Examples:
      | charactername | status |
      | jesse pinkman | Alive  |