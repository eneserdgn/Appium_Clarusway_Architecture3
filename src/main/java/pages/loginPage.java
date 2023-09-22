package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import utils.elementHelper;

public class loginPage {

    AppiumDriver driver;
    elementHelper elementHelper;

    By logo = AppiumBy.xpath("//XCUIElementTypeOther[@name=\"Username Password LOGIN\"]/XCUIElementTypeOther[1]/XCUIElementTypeImage");
    By usernameTextbox = AppiumBy.name("test-Username");
    By passwordTextbox = AppiumBy.iOSNsPredicateString("name == \"test-Password\"");
    By loginButton = AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"LOGIN\"`][2]");
    By errorMessage = AppiumBy.name("test-Error message");
    By icon = AppiumBy.className("//XCUIElementTypeOther[@name=\"Username Password LOGIN\"]/XCUIElementTypeOther[6]/XCUIElementTypeImage");

    public loginPage(AppiumDriver appiumDriver) {
        driver = appiumDriver;
        elementHelper = new elementHelper(appiumDriver);
    }

    public void checkLoginPage() {
        elementHelper.checkElement(logo);
    }

    public void sendKeysUsername(String text) {
        elementHelper.sendKeys(usernameTextbox, text);
    }

    public void sendKeysPassword(String text) {
        elementHelper.sendKeys(passwordTextbox, text);
    }

    public void clickLoginButton() {
        elementHelper.click(loginButton);
    }

    public String getTextErrorMessage() {
        return elementHelper.getText(errorMessage);
    }

    public void checkLogo() {
        elementHelper.checkElement(logo);
    }

    public String getTextUsername() {
        return elementHelper.getText(usernameTextbox);
    }

    public String getTextPassword() {
        return elementHelper.getText(passwordTextbox);
    }

    public String getTextLoginButton() {
        return elementHelper.getText(loginButton);
    }

    public void checkIcon() {
        elementHelper.checkElement(icon);
    }
}
