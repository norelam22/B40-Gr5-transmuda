Feature: User should be able to login


  User Story:
  As a user,  we should able to see edit car info icons on the Vehicles page

  @wip
  Scenario Outline: Verify login with different user types
    Given the user logged in as "<userType>"
    When the user navigate to "Fleet" to "Vehicles"
    And the user hover over three dots
    Then the user see following options
      | View   |
      | Edit   |
      | Delete |

    Examples:
      | userType      |
      | Store Manager |
      | Sales Manager |
      | Driver        |