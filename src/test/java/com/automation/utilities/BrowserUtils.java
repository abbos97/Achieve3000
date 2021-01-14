package com.automation.utilities;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebElement;

public class BrowserUtils {
    /**
     * Pause test for some time
     * @param seconds
     */
    public static void wait(int seconds){

        try {
            Thread.sleep(1000*seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static List<String> getTextFromWebElements(List<WebElement> elements) {
        List<String> textValues = new ArrayList<>();
        for (WebElement element : elements) {
            if (!element.getText().isEmpty()) {
                textValues.add(element.getText());
            }
        }
        return textValues;
    }
}
