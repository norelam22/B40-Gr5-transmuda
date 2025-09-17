@US124
Feature: Users should be able to manage filters on the Vehicle Costs page

  Background: User is on the log in page
    Given the user is on the login page

  @US124AC01
  Scenario Outline: Verify login with different user types
    Given the user logged in as "<userType>"
    When the user navigates to "Fleet" and "Vehicle Costs"
    Then the user should see 3 columns on the Vehicle Costs page: TYPE, TOTAL PRICE, DATE

    Examples:
      | userType      |
      | store manager |
      | sales manager |

  @US124AC01
  Scenario Outline: Verify that selecting the first checkbox selects all Vehicle Costs
    Given the user logged in as "<userType>"
    When the user navigates to "Fleet" and "Vehicle Costs"
    When the user selects the first checkbox
    #Then all Vehicle Cost checkboxes should be selected

    Examples:
      | userType      |
      | store manager |
      | sales manager |
