@oguz @wip
Feature: Vehicle Selection on Vehicles Page

  As a Sales and Store Manager
  I want to be able to select vehicles using checkboxes
  So that I can manage and take actions on selected vehicles


  @US118AC01
  Scenario Outline: Verify that all checkboxes are unchecked by default
    Given the user logged in as "<userType>"
    When the user navigate to "Fleet" to "Vehicles"
    Then all vehicle checkboxes should be unchecked

    Examples:
      | userType      |
      | sales manager |
      | store manager |


  @US118AC02
  Scenario Outline: Verify that selecting the first checkbox selects all vehicles
    Given the user logged in as "<userType>"
    When the user navigate to "Fleet" to "Vehicles"
    Then the user checks the first checkbox
    Then all vehicle checkboxes should be checked

    Examples:
      | userType      |
      | sales manager |
      | store manager |


  @US118AC03
  Scenario Outline: Verify that the user can select an individual vehicle
    Given the user logged in as "<userType>"
    When the user navigate to "Fleet" to "Vehicles"
    Then the user checks the checkbox of a specific vehicle
    Then only that vehicle’s checkbox should be checked

    Examples:
      | userType      |
      | sales manager |
      | store manager |