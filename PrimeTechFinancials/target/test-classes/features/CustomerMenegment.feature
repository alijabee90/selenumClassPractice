@customerManagementTest
Feature: Customer Management
  @newCustomerBTNTest
  Scenario: As user when I navigate to the Customer tab, I should see New customer button
    Given As entity user , I am logged in
    When I navigate to the customer tab
    Then I should see the New Customer button displayed

@createItem
 Scenario: As a user, I am able to create an item or a service
 Given As an entity user, I am logged in
    And I navigate to Items tab
    When I click on the Add Item button
    And I should be on item input page
    When I provide item information name "Coffee mug", price 1800, unit "pc", and description "a good book"
    And I click Save Item button
    Then The Item is added to the Item list table
    And I delete the item