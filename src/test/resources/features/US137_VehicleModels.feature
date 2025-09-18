Feature: Vehicle Models page columns as a user,I want to view columns on the Vehicle Models page.

  Background:
    Given the user is on the login page

  Scenario Outline: Store/Sales manager can see 10 columns on vehicles Model page
    When the user logged in as "<userType>"
    Then the user navigates to "Fleet" tab and to "Vehicles Model" module
    Then the table shows exactly 10 columns
    And the table should contain the following column headers:
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


    Examples:
      | userType | 
      | sales manager  |
      | store manager    | 

    Scenario: Verify that Drivers cannot access the Vehicles Model page and see “You do not have permission to perform this action.” message on the screen.
      Given the user logged in with username as "user168" and password as "UserUser123"
      Then the user navigates to "Fleet" tab and to "Vehicles Model" module
      Then the user should see error message "You do not have permission to perform this action."
      


     
