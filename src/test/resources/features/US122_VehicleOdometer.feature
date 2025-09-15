Feature: Display odometer readings on the vehicle information page.

  US122-AC01-TC01
  US122-AC02-TC01
  US122-AC03-TC01

  As a user,
  I want to view car odometer info on the Vehicles Odometer Page

  Scenario Outline: Verify that Store and Sales manager see the error message "You do not have permission to perform
  this action.” when they click the Vehicle Odometer module.
    #Please use username: salesmanager106 as this will not prompt the chrome change password pop-up
    Given the user logged in as "<userType>"
    When  the user navigates to the "Fleet" tab and to "Vehicle Odometer" module
    Then  the user should see error message "You do not have permission to perform this action."

    Examples:
      | userType      |
      | store manager |
      | sales manager |

  Scenario: Verify that Drivers see the default page as 1.
    Given the user logged in with username as "User20" and password as "UserUser123"
    When the user navigates to the "Fleet" tab and to "Vehicle Odometer" module
    Then the user should see the default page as 1.

    Scenario: Verify that Drivers see the View Per Page as 25 by default.
      Given the user logged in with username as "User20" and password as "UserUser123"
      When the user navigates to the "Fleet" tab and to "Vehicle Odometer" module
      Then the user should see the View Per Page as 25 by default





