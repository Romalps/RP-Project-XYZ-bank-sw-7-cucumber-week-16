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

public class OpenAccountPage extends Utility {


    private static final Logger log = LogManager.getLogger(OpenAccountPage.class.getName());

    public OpenAccountPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Open Account']")
    WebElement openAccountTab;
    @CacheLookup
    @FindBy(xpath = "//select[@name='userSelect']")
    WebElement searchCustomerField;
    @CacheLookup
    @FindBy(xpath = "//select[@name='currency']")
    WebElement currencyLink;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Process']")
    WebElement processButton;


    public void clickOnOpenAccountTab() {
        clickOnElement(openAccountTab);
        log.info(" Click on Open Account tab " + openAccountTab.toString());
    }

    public void searchCustomer(String firstName) {
        selectByVisibleTextFromDropDown(searchCustomerField, firstName);
        log.info("Search Customer " + searchCustomerField.toString());

    }

    public void selectCurrency(String currency) {
        selectByVisibleTextFromDropDown(currencyLink, currency);
        log.info("Select Currency Pound " + currencyLink.toString());
    }


    public void clickOnProcessButton() {
        clickOnElement(processButton);
        log.info(" Click on Process button " + processButton.toString());

    }

    public void verifyMessageAccountCreatedSuccessfully(String expectedMessage) {
        Assert.assertTrue(getTextFromAlert().contains(expectedMessage));
    }

}
