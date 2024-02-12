package Automation.testCases;

import Automation.pageObjects.FormValidDataPage;
import Automation.pageObjects.InvalidDataPage;
import Automation.utilities.StepMethods;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.IOException;
import static Automation.testCases.BaseClass.*;
import static Automation.utilities.Constants.*;


public class TC_Form_InvalidData_003 {

    @Test(priority = 3)
    public void VerifyFormPageWithInvalidData() throws IOException {

        StepMethods stepMethods = new StepMethods();
        FormValidDataPage formValidDataPage = new FormValidDataPage();
        stepMethods.alert();
        driver.navigate().refresh();
        formValidDataPage.clickSubmitButton();
        verifyValidationEmptyFirstName();
        verifyValidationEmptyLastName();
        verifyValidationInvalidEmail();
        verifyValidationInvalidPhoneNumber();
        verifyValidationEmptyGender();
        verifyValidationEmptyFileUpload();
        verifyValidationUncheckAgreement();

    }

    public void verifyValidationEmptyFirstName() throws IOException {
        InvalidDataPage invalidDataPage = new InvalidDataPage();

        if (invalidDataPage.getErrorFirstName().isDisplayed()) {
            logger.info("Validation error For First Name is: " + invalidDataPage.getErrorFirstName().getText());
            Assert.assertTrue(true);

        } else {
            logger.info("Validation error For First Name is not found:");
            Assert.fail("Validation error For First Name is not found");
            captureScreen(driver, "Validation error For First Name is not found");
        }

    }

    public void verifyValidationEmptyLastName() throws IOException {
        InvalidDataPage invalidDataPage = new InvalidDataPage();

        if (invalidDataPage.getErrorLastName().isDisplayed()) {
            logger.info("Validation error For Last Name is: " + invalidDataPage.getErrorLastName().getText());
            Assert.assertTrue(true);

        } else {
            logger.info("Validation error For Last Name is not found:");
            Assert.fail("Validation error For Last Name is not found");
            captureScreen(driver, "Validation error For Last Name is not found");
        }

    }

    public void verifyValidationInvalidEmail() throws IOException {
        InvalidDataPage invalidDataPage = new InvalidDataPage();
        FormValidDataPage formValidDataPage = new FormValidDataPage();

        if (invalidDataPage.getErrorEmail().isDisplayed()) {
            logger.info("Validation error For Empty Email is: " + invalidDataPage.getErrorEmail().getText());
            Assert.assertTrue(true);

        } else {
            logger.info("Validation error For Empty Email is not found:");
            Assert.fail("Validation error For Empty Email is not found");
            captureScreen(driver, "Validation error For Empty Email is not found");
        }

        formValidDataPage.enterEmail().sendKeys(INVALIDEMAIL);
        formValidDataPage.clickSubmitButton();

        if (invalidDataPage.getErrorEmail().isDisplayed()) {
            logger.info("Validation error For Invalid Email is: " + invalidDataPage.getErrorEmail().getText());
            Assert.assertTrue(true);

        } else {
            logger.info("Validation error For Invalid Email is not found:");
            Assert.fail("Validation error For Invalid Email is not found");
            captureScreen(driver, "Validation error For Invalid Email is not found");
        }
    }

    public void verifyValidationInvalidPhoneNumber() throws IOException {
        InvalidDataPage invalidDataPage = new InvalidDataPage();
        FormValidDataPage formValidDataPage = new FormValidDataPage();

        if (invalidDataPage.getErrorPhoneNumber().isDisplayed()) {
            logger.info("Validation error For Empty Phone Number is: " + invalidDataPage.getErrorPhoneNumber().getText());
            Assert.assertTrue(true);

        } else {
            logger.info("Validation error For Empty Phone Number is not found:");
            Assert.fail("Validation error For Empty Phone Number is not found");
            captureScreen(driver, "Validation error For Empty Phone Number is not found");
        }

        formValidDataPage.enterPhoneNumber().sendKeys(INVALIDPHONENUMBER);
        formValidDataPage.clickSubmitButton();

        if (invalidDataPage.getErrorPhoneNumber().isDisplayed()) {
            logger.info("Validation error For Invalid Phone Number is: " + invalidDataPage.getErrorPhoneNumber().getText());
            Assert.assertTrue(true);

        } else {
            logger.info("Validation error For Invalid Phone Number is not found:");
            Assert.fail("Validation error For Invalid Phone Number is not found");
            captureScreen(driver, "Validation error For Invalid Phone Number is not found");
        }

    }

    public void verifyValidationEmptyGender() throws IOException {
        InvalidDataPage invalidDataPage = new InvalidDataPage();

        if (invalidDataPage.getErrorGender().isDisplayed()) {
            logger.info("Validation error For Empty Gender is: " + invalidDataPage.getErrorGender().getText());
            Assert.assertTrue(true);

        } else {
            logger.info("Validation error For Empty Gender is not found:");
            Assert.fail("Validation error For Empty Gender is not found");
            captureScreen(driver, "Validation error For Empty Gender is not found");
        }

    }

    public void verifyValidationEmptyFileUpload() throws IOException {
        InvalidDataPage invalidDataPage = new InvalidDataPage();

        if (invalidDataPage.getErrorFileUpload().isDisplayed()) {
            logger.info("Validation error For Empty File Upload is: " + invalidDataPage.getErrorFileUpload().getText());
            Assert.assertTrue(true);

        } else {
            logger.info("Validation error For Empty File Upload is not found:");
            Assert.fail("Validation error For Empty File Upload is not found");
            captureScreen(driver, "Validation error For Empty File Upload is not found");
        }

    }

    public void verifyValidationUncheckAgreement() throws IOException {
        InvalidDataPage invalidDataPage = new InvalidDataPage();

        if (invalidDataPage.getErrorUncheckAgreement().isDisplayed()) {
            logger.info("Validation error For Uncheck Agreement is: " + invalidDataPage.getErrorUncheckAgreement().getText());
            Assert.assertTrue(true);

        } else {
            logger.info("Validation error For Uncheck Agreement is not found:");
            Assert.fail("Validation error For Uncheck Agreement is not found");
            captureScreen(driver, "Validation error Uncheck Agreement is not found");
        }

    }

}