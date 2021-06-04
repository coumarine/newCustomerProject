@awsgit
Feature:

  Scenario Outline: Consume first package
    Given open url using '<browser>'
    Examples:
      | browser |
      | chrome  |
      | firefox |