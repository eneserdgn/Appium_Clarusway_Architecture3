package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.options.XCUITestOptions;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class driverFactory {

    static AppiumDriver driver;

    public static void setDriver() {
        XCUITestOptions options = new XCUITestOptions();
        options.setPlatformName("iOS");
        options.setAutomationName("XCUITest");
        options.setBundleId("com.saucelabs.SwagLabsMobileApp");
        options.setUdid("8DA0AD40-FE9D-4D9C-A761-67355238999D");
        options.setNoReset(false);
        try {
            driver = new AppiumDriver(new URL("http://127.0.0.1:4723/"), options);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public static void quitDriver() {
        driver.quit();
    }

    public static AppiumDriver getDriver() {
        return driver;
    }

}
