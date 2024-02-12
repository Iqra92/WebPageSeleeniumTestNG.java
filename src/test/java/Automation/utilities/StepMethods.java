package Automation.utilities;

import org.openqa.selenium.Alert;
import java.sql.Timestamp;
import java.util.Random;
import static Automation.testCases.BaseClass.*;
import static Automation.testCases.BaseClass.logger;

public class StepMethods {

    public String RandomString(int stringLength) {

        Random random = new Random();
        char[] chars = "ABCDEFGHIJKLMNOPQRSTUWVXYZabcdefghijklmnopqrstuwvxyz".toCharArray();
        String stringRandom = "";
        for (int i = 0; i < stringLength; i++) {

            stringRandom = stringRandom + chars[random.nextInt(chars.length)];
        }

        return stringRandom;
    }

    public Long getTimestamp() {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        return (timestamp.getTime());
    }

    public CharSequence generateRandomNumber() {

        Random random = new Random();
        StringBuilder phoneNumber = new StringBuilder();


        phoneNumber.append(random.nextInt(9) + 1);

        int remainingDigits = 6 + random.nextInt(4);
        for (int i = 0; i < remainingDigits; i++) {
            phoneNumber.append(random.nextInt(10));
        }

        logger.info("Random Phone Number: " + phoneNumber.toString());

        return phoneNumber;
    }

    public void alert(){
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        logger.info("Alert text: " + alertText);
        alert.accept();
    }


}
