package com.automation.utilities;


import org.openqa.selenium.WebDriver;


public class Driver {

    private static WebDriver driver;

    //so no one can create object of Driver class
    //everyone should call static getter method instead
    private Driver() {

    }


    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
