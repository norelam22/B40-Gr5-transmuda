@pinbar
Feature: Pinbar help
  As a user,I want to learn how to use pinbar.


  Scenario Outline: User can view Pinbar instructions
    Given the user logged in as "<userType>"
    When the user clicks "learn how to use this space"
    Then the pinbar help title is visible as "How To Use Pinbar"
    And the pinbar help text showed "Use pin icon on the right top corner of page to create fast access link in the pinbar."
    Examples:
      | userType      |
      | Driver        |
      | Sales Manager |
      | Store Manager |


  Scenario Outline: Image for pinbar help is visible
    Given the user logged in as "<userType>"
    When the user clicks "learn how to use this space"
    Then the PinBar help image is displayed
    And the PinBar help image src is "/bundles/oronavigation/images/pinbar-location.jpg"

    Examples:
      | userType      |
      | Driver        |
      | Sales Manager |
      | Store Manager |