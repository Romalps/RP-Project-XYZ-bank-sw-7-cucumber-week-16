Feature: Bank Test
  As a User I want to add customer, open Account,Login, deposit money, withdraw money and Logout on XYZ Bank website

  @sanity
  Scenario:  Verify that bank manager should add customer successfully
    Given I am on Homepage
    When I click On Bank Manager Login Tab
    And I click On Add Customer Tab
    And enter FirstName "Prime101"
    And enter LastName "Tester"
    And enter PostCode "LX10 5RF"
    And click On Add Customer Button
    And popup display
    Then verify Customer added success message "Customer added successfully"
    And click on ok button on popup

  @smoke
    Scenario: Verify that bank manager should open account successfully
      Given I am on Homepage
      When I click On Bank Manager Login Tab
      And I click On Open Account Tab
      And Search customer that created in first test "Prime101"
      And Select currency "Pound"
      And click on process button
      And popup display
      Then verify Account created success message "Account created successfully"
      And click on ok button on popup

  @regression
    Scenario: verify that customer should Login and Logout successfully
      Given I am on Homepage
      When I click on Customer Login Tab
      And  Search customer that created in first test "Prime101"
      And click on Login Button
      Then verify Logout Tab displayed
      When click on Logout button
      Then verify your name text is displayed "Your Name"
  @sanity   @regression
    Scenario: Verify that customer should deposit money successfully
      Given I am on Homepage
      When I click on Customer Login Tab
      And  Search customer that created in first test "Prime101"
      And click on Login Button
      And click on Deposit Tab
      And enter amount "100"
      And click on Deposit Button
      Then verify Deposit success message "Deposit Successful"

  @smoke  @regression
    Scenario: Verify that customer should withdraw money successfully
      Given I am on Homepage
      When I click on Customer Login Tab
      And Search customer that created in first test "Prime101"
      And click on Login Button
      And click on Withdraw Tab
      And enter amount "50"
      And click on Withdraw Button
      Then verify Transaction Success message "Transaction Successful"




