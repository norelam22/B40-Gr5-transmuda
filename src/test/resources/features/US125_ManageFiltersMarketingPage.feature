@emanuele
Feature: Manage filters on the Marketing page
  As a user
  I want to manage filters on the Marketing page
  So that I can control which records are shown


  @US125TC01AC01
  Rule: Store and Sales managers see all 5 filters checked by default (AC #1)


  Scenario Outline: All five filters are checked by default for authorized roles
    Given the user logged in as "<userType>"
    And I navigate to the Marketing page
    When I open the filter panel
    Then I should see exactly 5 filters checked by default


    Examples:
      | userType      |
      | sales manager |
      | store manager |

  @US125TC01AC02
  Rule: Authorized users can uncheck any number of filters (AC #2)

  Scenario Outline: Uncheck N filters and verify the count updates
    Given the user logged in as "<userType>"
    And I navigate to the Marketing page
    And I open the filter panel
    Then I should see exactly 5 filters checked by default
    When I uncheck <uncheckCount> random filters
    Then I should see <expectedChecked> filters checked


    Examples:
      | userType      | uncheckCount | expectedChecked |
      | sales manager | 3            | 2               |
      | store manager | 3            | 2               |


