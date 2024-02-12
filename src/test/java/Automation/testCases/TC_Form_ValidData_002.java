package Automation.testCases;
import Automation.pageObjects.FormValidDataPage;
import Automation.utilities.StepMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.util.List;
import java.util.Random;

import static Automation.testCases.BaseClass.*;
import static Automation.utilities.Constants.*;

public class TC_Form_ValidData_002 {


    @Test(priority = 2)
    public void verifyFormPage()  {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        FormValidDataPage formValidDataPage = new FormValidDataPage();
        StepMethods stepMethods = new StepMethods();
        formValidDataPage.enterFirstName().sendKeys(stepMethods.RandomString(5));
         formValidDataPage.enterFirstName();
        formValidDataPage.enterLastName().sendKeys(stepMethods.RandomString(5));
        formValidDataPage.enterEmail().sendKeys("test" + stepMethods.getTimestamp() + "@gmail.com");
        formValidDataPage.enterPhoneNumber().sendKeys(stepMethods.generateRandomNumber());
        formValidDataPage.selectGender();
        selectDropDown();
        fileUpload();
        formValidDataPage.selectCheckBox();
        formValidDataPage.clickSubmitButton();
    }

    public  void selectDropDown(){
        FormValidDataPage formValidDataPage = new FormValidDataPage();
        Select dropdown = new Select(formValidDataPage.selectVacancy());
        List<WebElement> options = dropdown.getOptions();
        Random random = new Random();
        int randomIndex = random.nextInt(options.size());
        String randomValue = options.get(randomIndex).getAttribute("value");
        dropdown.selectByValue(randomValue);
    }

    public void fileUpload(){
        FormValidDataPage formValidDataPage = new FormValidDataPage();
        formValidDataPage.selectFile();
        String filePath = FILEPATH; // Replace with the path to your CV file
        String projectDirectory = System.getProperty("user.dir");
        String pdfFilePath = projectDirectory + File.separator + "Files" + File.separator + filePath;

        formValidDataPage.selectFile().sendKeys(pdfFilePath);

    }

    }



