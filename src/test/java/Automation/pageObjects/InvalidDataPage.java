package Automation.pageObjects;

import Automation.testCases.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class InvalidDataPage extends BaseClass {


    public InvalidDataPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "//body[1]/div[1]/form[1]/p[1]")
    @CacheLookup
    WebElement errorFirstName;


    @FindBy(how = How.XPATH, using = "//body[1]/div[1]/form[1]/p[2]")
    @CacheLookup
    public
    WebElement errorLastName;

    @FindBy(how = How.XPATH, using = "//body[1]/div[1]/form[1]/p[3]")
    @CacheLookup
    WebElement errorEmail;

    @FindBy(how = How.XPATH, using = "//body[1]/div[1]/form[1]/p[4]")
    @CacheLookup
    public
    WebElement errorPhoneNumber;

    @FindBy(how = How.XPATH, using = "//body[1]/div[1]/form[1]/p[5]")
    @CacheLookup
    public
    WebElement errorGender;

    @FindBy(how = How.XPATH, using = "//body[1]/div[1]/form[1]/p[6]")
    @CacheLookup
    public
    WebElement errorFileUpload;

    @FindBy(how = How.XPATH, using = "//body[1]/div[1]/form[1]/p[7]")
    @CacheLookup
    public
    WebElement errorAgreement;



    public WebElement getErrorFirstName() {
       return errorFirstName;
    }

    public WebElement getErrorLastName() {
        return errorLastName;
    }

    public WebElement getErrorEmail() {
        return errorEmail;
    }

    public WebElement getErrorPhoneNumber() {
        return errorPhoneNumber;
    }

    public WebElement getErrorGender() {
        return errorGender;
    }

    public WebElement getErrorFileUpload() {
        return errorFileUpload;
    }

    public WebElement getErrorUncheckAgreement() {
        return errorAgreement;
    }

}
