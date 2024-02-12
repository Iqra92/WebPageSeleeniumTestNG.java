package Automation.pageObjects;

import Automation.testCases.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class FormValidDataPage extends BaseClass {

    public FormValidDataPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "//input[@name='FirstName']")
    @CacheLookup
    WebElement firstName;

    @FindBy(how = How.XPATH, using = "//input[@name='LastName']")
    @CacheLookup
    WebElement lastName;

    @FindBy(how = How.XPATH, using = "//input[@name='Email']")
    @CacheLookup
    WebElement email;

    @FindBy(how = How.XPATH, using = "//input[@name='PhoneNumber']")
    @CacheLookup
    WebElement phoneNumber;

    @FindBy(how = How.XPATH, using = "//input[@value='Female']")
    @CacheLookup
    WebElement gender;

    @FindBy(how = How.XPATH, using = "//body[1]/div[1]/form[1]/select[1]")
    @CacheLookup
    WebElement vacancy;

    @FindBy(how = How.XPATH, using = "//input[@id='myfile']")
    @CacheLookup
    WebElement cvUpload;

    @FindBy(how = How.XPATH, using = "//input[@type='checkbox']")
    @CacheLookup
    WebElement checkBox;

    @FindBy(how = How.XPATH, using = "//input[@type='submit']")
    @CacheLookup
    WebElement submitForm;

    public WebElement enterFirstName()
    {
        return firstName;
    }

    public WebElement enterLastName()
    {
       return lastName;
    }

    public WebElement enterEmail()
    {
        return email;
    }
    public WebElement enterPhoneNumber()
    {
       return phoneNumber;
    }

    public void selectGender()
    {
        gender.click();
    }

    public WebElement selectVacancy()
    {
        return vacancy;
    }

    public WebElement selectFile()
    {
        return cvUpload;
    }

    public void selectCheckBox(){
        checkBox.click();
    }

    public void clickSubmitButton(){
        submitForm.click();
    }
}
