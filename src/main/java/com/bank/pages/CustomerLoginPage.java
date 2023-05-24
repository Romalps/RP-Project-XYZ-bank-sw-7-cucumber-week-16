package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CustomerLoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(CustomerLoginPage.class.getName());

    public CustomerLoginPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Customer Login']")
    WebElement customerLoginTab;
    @CacheLookup
    @FindBy(xpath = "//select[@name='userSelect']")
    WebElement searchCustomer;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement loginButton;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Logout']")
    WebElement logoutTab;
    @CacheLookup
    @FindBy(xpath = "//label[normalize-space()='Your Name :']")
    WebElement yourNameText;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Deposit']")
    WebElement depositTab;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement amount100;
    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement depositButton;
    @CacheLookup
    @FindBy(xpath = "//span[@class='error ng-binding']")
    WebElement depositSuccessMessage;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Withdrawl']")
    WebElement withDrawlTab;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement amount50;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Withdraw']")
    WebElement withDrawButton;
    @CacheLookup
    @FindBy(xpath = "//span[@class='error ng-binding']")
    WebElement transactionSuccessMessage;


    public void clickOnCustomerLoginTab() {
        clickOnElement(customerLoginTab);
        log.info("Click On Customer Login Tab " + customerLoginTab.toString());
    }

    public void searchCustomerThatYouCreated(String firstName) {
        selectByVisibleTextFromDropDown(searchCustomer, firstName);
        log.info("Search customer that you created " + searchCustomer.toString());
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
        log.info("Click on Login button " + loginButton.toString());
    }

    public boolean isLogoutTabDisplayed() {

        log.info("Logout tab is displayed " + logoutTab.toString());
        //WebElement logout = driver.findElement(logoutTab);
        return logoutTab.isDisplayed();
    }

    public void verifyLogoutTabIsDisplayed() {
        Assert.assertTrue(isLogoutTabDisplayed());
    }

    public void clickOnLogout() {

        clickOnElement(logoutTab);
        log.info("Click on Logout " + logoutTab.toString());
    }

    public String getYourNameText() {
        log.info("Get your name text " + yourNameText.toString());
        return getTextFromElement(yourNameText);
    }

    public void verifyYourNameTextDisplayed(String expectedMessage) {
        Assert.assertTrue(getYourNameText().contains(expectedMessage));
    }

    public void clickOnDepositTab() {
        clickOnElement(depositTab);
        log.info("Click on deposit tab " + depositTab.toString());
    }

    public void enterAmount(String amount) {
        sendTextToElement(amount100, amount);
        log.info("Enter amount " + amount100.toString());
    }

    public void clickOnDepositButton() {
        clickOnElement(depositButton);
        log.info("Click on Deposit button " + depositButton.toString());
    }

    public String getDepositSuccessfulMessage() {
        log.info("Get Deposit success message " + depositSuccessMessage.toString());
        return getTextFromElement(depositSuccessMessage);
    }

    public void verifyDepositSuccessfulMessage(String expectedMessage) {
        Assert.assertEquals(getDepositSuccessfulMessage(), expectedMessage);
    }

    public void clickOnWithDrawTab() {
        clickOnElement(withDrawlTab);
        log.info(" Click on WithDrawl Tab " + withDrawlTab.toString());
    }

    public void enterAmount50() {
        sendTextToElement(amount50, "50");
        log.info("Enter amount 50 " + amount50.toString());
    }

    public void clickOnWithDrawButton() {
        clickOnElement(withDrawButton);
        log.info("Click on Withdraw button " + withDrawButton.toString());
    }

    public String getTransactionSuccessMessage() {
        log.info("Get Transaction success message " + transactionSuccessMessage.toString());
        return getTextFromElement(transactionSuccessMessage);
    }

    public void verifyTransactionSuccessMessage(String expectedMessage) {
        Assert.assertEquals(getTransactionSuccessMessage(), expectedMessage);
    }

}
