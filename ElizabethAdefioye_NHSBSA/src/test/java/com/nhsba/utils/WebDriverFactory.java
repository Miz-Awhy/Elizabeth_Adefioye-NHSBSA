package com.nhsba.utils;

public class WebDriverFactory {
    private static WebDriver driver;

    public static void setDriver(String browser) {
        if (driver != null) {
            driver.quit();
        }

        switch (browser.toLowerCase()) {
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "chrome":
            default:
                driver = new ChromeDriver();
                break;
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
