@Aliya
Feature: View the Vehicles Model page (US116)

  As a user,
  I want to view columns on the Vehicles Model page (web-table),
  So that authorized users can see required information and unauthorized users are restricted.

  @US116 @AC01
  Scenario Outline: Verify that Store Manager and Sales Manager can see the 10 columns on the Vehicles Model page
    # Use salesmanager106 to avoid Chrome save-password pop-up
    Given the user logged in as "<userType>"
    When the user navigates to the "Fleet" tab and to the "Vehicles Model" module
    Then the user should see the following column headers in order:
      | MODEL NAME                |
      | MAKE                      |
      | CAN BE REQUESTED          |
      | CVVI                      |
      | CO2 FEE (/MONTH)          |
      | COST (DEPRECIATED)        |
      | TOTAL COST (DEPRECIATED)  |
      | CO2 EMISSIONS             |
      | FUEL TYPE                 |
      | VENDORS                   |
    And the table should have at least 1 data row

    Examples:
      | userType      |
      | store manager |
      | sales manager |

  @US116 @AC02
  Scenario: Verify that Drivers cannot access the Vehicles Model page
    Given the user logged in as "User20" with password "UserUser123"
    When the user navigates to the "Fleet" tab and to the "Vehicles Model" module
    Then the user should see an error message "You do not have permission to perform this action."
    And the Vehicles Model table should not be visible
