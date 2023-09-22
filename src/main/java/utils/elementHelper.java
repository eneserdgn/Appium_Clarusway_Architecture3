package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class elementHelper {

    AppiumDriver driver;
    WebDriverWait wait;


    public elementHelper(AppiumDriver appiumDriver) {
        driver = appiumDriver;
        wait = new WebDriverWait(appiumDriver, Duration.ofSeconds(10));
    }

    public WebElement findElement(By by) {
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(by));
        return element;
    }

    public void checkElement(By by) {
        Assert.assertTrue(findElement(by).isDisplayed());
    }

    public void click(By by) {
        WebElement element = findElement(by);
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public void sendKeys(By by, String text) {
        WebElement element = findElement(by);
        wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(text);
    }

    public String getText(By by) {
        WebElement element = findElement(by);
        return wait.until(ExpectedConditions.visibilityOf(element)).getText();
    }

    public void clear(By by) {
        findElement(by).clear();
    }

}
