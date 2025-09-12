@karen
Feature: Repeat Every input validation on Calendar Event

  As a user,
  I should see error messages when I enter an invalid integer into the calendar
  repeat day input box.

  Scenario Outline: Verify that users see error messages when enter invalid integers
    Given the user logged in as "<userType>"
    When the user navigate to "Activities" to "Calendar Events"
    And the user clicks the Create Calendar Event button
    When user checks the repeat checkbox
    And the user enters "<invalidValue>" in the Repeat Every input box
    And clicks outside the input box
    Then the user should see the error message "<expectedMessage>"

    Examples:
      | userType      | invalidValue | expectedMessage                        |
      | driver        | -1           | The value have not to be less than 1.  |
      | driver        | 0            | The value have not to be less than 1.  |
      | driver        | 100          | The value have not to be more than 99. |
      | Sales Manager | -1           | The value have not to be less than 1.  |
      | Sales Manager | 0            | The value have not to be less than 1.  |
      | Sales Manager | 100          | The value have not to be more than 99. |
      | Store Manager | -1           | The value have not to be less than 1.  |
      | Store Manager | 0            | The value have not to be less than 1.  |
      | Store Manager | 100          | The value have not to be more than 99. |