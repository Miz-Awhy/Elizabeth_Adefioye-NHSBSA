package com.nhsba.utils;

public class Hooks {
    @Before
    public void setUp() {
        String browser = System.getProperty("browser", "chrome");
        DriverFactory.setDriver(browser);
        DriverFactory.getDriver().manage().window().maximize();
    }

    @After
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}
