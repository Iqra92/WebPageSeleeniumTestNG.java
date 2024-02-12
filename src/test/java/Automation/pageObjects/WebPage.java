package Automation.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class WebPage {


    public WebPage(WebDriver rdriver) {
            PageFactory.initElements(rdriver, this);
        }

    @FindBy(how = How.XPATH, using = "//body/div[@id='root']/form[1]")
    @CacheLookup
    WebElement getOpenLink;


    public WebElement verifyPageForm() {
            return getOpenLink;
    }



}
