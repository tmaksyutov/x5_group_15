package com.demoqa.tests.properties;


public class SystemProperties {
    public static String browser() {
        return System.getProperty("browser", "chrome");
    }

    public static String browserVersion() {
        return System.getProperty("browserVersion", "106");
    }

    public static String browserSize() {
        return System.getProperty("browserSize", "1920x1080");
    }

    public static String remoteUrl() {
        return System.getProperty("remoteUrl", ""); //https://user1:1234@selenoid.autotests.cloud/wd/hub
    }
}
