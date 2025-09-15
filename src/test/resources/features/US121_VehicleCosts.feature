Feature: As a user, I want to type into the Description field when I create a calendar event. (Iframe)
@wip
  Scenario Outline: User types in the description field when creating a new event
    Given the user logged in as "<userType>"
    Given user hovers the mouse cursor on the module Activities and clicks calendar events
    And user clicks create Calendar Event
    And user types into the Description field
  Then text appears on the page

    Examples:
    |userType|
    |driver  |
    |sales manager|
    |store manager|


