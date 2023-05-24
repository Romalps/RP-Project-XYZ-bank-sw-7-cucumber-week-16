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

public class AddCustomerPage extends Utility {

    private static final Logger log = LogManager.getLogger(AddCustomerPage.class.getName());

    public AddCustomerPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Add Customer']")
    WebElement addCustomerLink;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement firstnameField;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement lastNameField;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Post Code']")
    WebElement postCodeField;
    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement addCustomerButton;
    String textFromAlert;

    public void clickOnAddCustomerTab() {
        clickOnElement(addCustomerLink);
        log.info("Click on add customer tab " + addCustomerLink.toString());
    }

    public void enterFirstName(String firstName) {
        sendTextToElement(firstnameField, firstName);
        log.info("Enter First name " + firstName.toString());
    }

    public void enterLastName(String lastname) {
        sendTextToElement(lastNameField, lastname);
        log.info(" Enter Last name " + lastname.toString());
    }

    public void enterPostCode(String postCode) {
        sendTextToElement(postCodeField, postCode);
        log.info("Enter Postcode " + postCode.toString());
    }

    public void clickOnAddCustomerButton() {
        clickOnElement(addCustomerButton);
        log.info("Click on Add customer button " + addCustomerButton.toString());
    }

    public void PopupDisplay() {
        textFromAlert = getTextFromAlert();
        System.out.println(textFromAlert);
    }

    public void verifyCustomerAddedSuccessfullyMessage(String expectedMessage) {
        Assert.assertTrue(textFromAlert.contains(expectedMessage));
    }
    public void clickOnOkButtonOnPopup(){
        acceptAlert();
    }
}
