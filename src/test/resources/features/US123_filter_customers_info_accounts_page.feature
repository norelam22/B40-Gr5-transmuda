@mubarek @wip
Feature: Filter customers' information on the Accounts page

  US123TC1 AC(1)

  As a store or sales manager,
  I want to view and use filters on the Accounts page
  So that I can easily locate customer information

  Scenario Outline: Verify visibility and names of filter items
    Given the user logged in as "<userType>"
    When the user navigate to "Customers" and to "Accounts" module
    And the user views the available filter options
    Then the user should see the following 8 filters:
      | Account Name: All  |
      | Contact Name: All  |
      | Contact Email: All |
      | Contact Phone: All |
      | Owner: All         |
      | Business Unit: All |
      | Created At: All    |
      | Updated At: All    |

    Examples:
      | userType      |
      | sales manager |
      | store manager |
