package com.bank.cucumber.steps;

import com.bank.pages.AddCustomerPage;
import com.bank.pages.CustomerLoginPage;
import com.bank.pages.Homepage;
import com.bank.pages.OpenAccountPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BankSteps {
    @Given("^I am on Homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I click On Bank Manager Login Tab$")
    public void iClickOnBankManagerLoginTab() {
        new Homepage().clickOnBankManagerLoginTab();
    }

    @And("^I click On Add Customer Tab$")
    public void iClickOnAddCustomerTab() {
        new AddCustomerPage().clickOnAddCustomerTab();
    }

    @And("^enter FirstName \"([^\"]*)\"$")
    public void enterFirstName(String firstName) {
        new AddCustomerPage().enterFirstName(firstName);
    }

    @And("^enter LastName \"([^\"]*)\"$")
    public void enterLastName(String lastName) {
        new AddCustomerPage().enterLastName(lastName);
    }

    @And("^enter PostCode \"([^\"]*)\"$")
    public void enterPostCode(String postcode) {
        new AddCustomerPage().enterPostCode(postcode);
    }

    @And("^click On Add Customer Button$")
    public void clickOnAddCustomerButton() {
        new AddCustomerPage().clickOnAddCustomerButton();
    }

    @And("^popup display$")
    public void popupDisplay() {
        new AddCustomerPage().PopupDisplay();
    }

    @Then("^verify Customer added success message \"([^\"]*)\"$")
    public void verifyCustomerAddedSuccessMessage(String expected) {
        new AddCustomerPage().verifyCustomerAddedSuccessfullyMessage(expected);
    }

    @And("^click on ok button on popup$")
    public void clickOnOkButtonOnPopup() {
        new AddCustomerPage().clickOnOkButtonOnPopup();
    }

    @And("^I click On Open Account Tab$")
    public void iClickOnOpenAccountTab() {
        new OpenAccountPage().clickOnOpenAccountTab();

    }

    @And("^Search customer that created in first test \"([^\"]*)\"$")
    public void searchCustomerThatCreatedInFirstTest(String firstName) {
        new OpenAccountPage().searchCustomer(firstName);
    }

    @And("^Select currency \"([^\"]*)\"$")
    public void selectCurrency(String currency) {
        new OpenAccountPage().selectCurrency(currency);
    }

    @And("^click on process button$")
    public void clickOnProcessButton() {
        new OpenAccountPage().clickOnProcessButton();
    }

    @Then("^verify Account created success message \"([^\"]*)\"$")
    public void verifyAccountCreatedSuccessMessage(String expected) {
        new OpenAccountPage().verifyMessageAccountCreatedSuccessfully(expected);
    }

    @When("^I click on Customer Login Tab$")
    public void iClickOnCustomerLoginTab() {
        new CustomerLoginPage().clickOnCustomerLoginTab();
    }

    @And("^click on Login Button$")
    public void clickOnLoginButton() {
        new CustomerLoginPage().clickOnLoginButton();
    }

    @Then("^verify Logout Tab displayed$")
    public void verifyLogoutTabDisplayed() {
        new CustomerLoginPage().verifyLogoutTabIsDisplayed();
    }

    @When("^click on Logout button$")
    public void clickOnLogoutButton() {
        new CustomerLoginPage().clickOnLogout();
    }

    @Then("^verify your name text is displayed \"([^\"]*)\"$")
    public void verifyYourNameTextIsDisplayed(String expected) {
        new CustomerLoginPage().verifyYourNameTextDisplayed(expected);
    }

    @And("^click on Deposit Tab$")
    public void clickOnDepositTab() {
        new CustomerLoginPage().clickOnDepositTab();
    }

    @And("^enter amount \"([^\"]*)\"$")
    public void enterAmount(String amount) {
        new CustomerLoginPage().enterAmount(amount);
    }

    @And("^click on Deposit Button$")
    public void clickOnDepositButton() {
        new CustomerLoginPage().clickOnDepositButton();
    }

    @Then("^verify Deposit success message \"([^\"]*)\"$")
    public void verifyDepositSuccessMessage(String expected) {
        new CustomerLoginPage().verifyDepositSuccessfulMessage(expected);
    }

    @And("^click on Withdraw Tab$")
    public void clickOnWithdrawTab() {
        new CustomerLoginPage().clickOnWithDrawTab();
    }

    @And("^click on Withdraw Button$")
    public void clickOnWithdrawButton() {
        new CustomerLoginPage().clickOnWithDrawButton();
    }

    @Then("^verify Transaction Success message \"([^\"]*)\"$")
    public void verifyTransactionSuccessMessage(String expected) {
        new CustomerLoginPage().verifyTransactionSuccessMessage(expected);
    }
}
