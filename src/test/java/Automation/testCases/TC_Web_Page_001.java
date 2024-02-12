package Automation.testCases;
import Automation.pageObjects.WebPage;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.io.IOException;

import static Automation.utilities.Constants.OPEN_URL;
public class TC_Web_Page_001 extends BaseClass {


    @Test(priority = 1)
    public void OpenUrl() throws IOException {
        WebPage gb = new WebPage(driver);

        driver.get(OPEN_URL);

        String openLinkText = String.valueOf(gb.verifyPageForm());

           // Check if the page is opened successfully
        if (openLinkText != null && !openLinkText.isEmpty()) {
            logger.info("Web Page is opened");
            Assert.assertTrue(true);


        } else {
            // Page is not opened successfully
            logger.error("Web Page is not opened successfully");
            Assert.fail("Web Page is not opened successfully");
            captureScreen(driver,"OpenUrl");

        }
    }

}
