Feature: Is today friday yet?
#  Every body want to know when it's friday
#
#  Scenario: Sunday is not friday
#    Given Today is sunday
#    When  I ask whether it is friday yet
#    Then  I should be told "Nope"
#
#  Scenario: Friday is Friday
#    Given today is Friday
#    When I ask whether it's Friday yet
#    Then I should be told "TGIF"
  #Feature: Is today friday yet?
#  Every body want to know when it's friday
#
  Scenario Outline: Sunday is not friday
    Given Today is "<day>"
    When  I ask whether it is friday yet
    Then  I should be told "<answer>"
    Examples:
      | day | answer |
      | Friday | TGIF |
      | Sunday | Nope |
      | Monday | Nope |
      | Tuesday | Nope |
      | Wednesday | Nope |
      | Thursday | Nope |
      | Saturday | Nope |