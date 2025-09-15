@Erasto
Feature: Access to Vehicle Contracts page
  As a user
  I want to access the Vehicle Contracts page so that access is granted only to authorized roles

  Rule: Store and Sales managers can access Vehicle Contracts (AC1)


    Scenario Outline: Authorized roles can open Vehicle Contracts and see correct URL and title
      Given the user logged in as "<userType>"
      When I navigate to the Vehicle Contracts page
      Then the page URL should be "https://qa.transmuda.com/entity/Extend_Entity_VehicleContract"
      And the page title should be "All - Vehicle Contract - Entities - System - Car - Entities - System"

      Examples:
        | userType      |
        | Sales manager |
        | Store manager |

  Rule: Drivers cannot access Vehicle Contracts and see an authorization message (AC2)


    Scenario: Driver is blocked from Vehicle Contracts page
      Given the user logged in as "<userType>"
      When I navigate to the Vehicle Contracts page
      Then I should see an authorization error "You do not have permission to perform this action."
      And the page URL should not be "https://qa.transmuda.com/entity/Extend_Entity_VehicleContract"