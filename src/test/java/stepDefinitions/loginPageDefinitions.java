package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.loginPage;
import utils.driverFactory;

public class loginPageDefinitions {

    loginPage login = new loginPage(driverFactory.getDriver());

    @Given("user is on the Login Page")
    public void userIsOnTheLoginPage() {
        login.checkLoginPage();
    }

    @When("sendkeys Username: {string} on Login Page")
    public void sendkeysUsernameOnLoginPage(String text) {
        login.sendKeysUsername(text);
    }

    @When("sendkeys Password: {string} on Login Page")
    public void sendkeysPasswordOnLoginPage(String text) {
        login.sendKeysPassword(text);
    }

    @When("click Login Button on Login Page")
    public void clickLoginButtonOnLoginPage() {
        login.clickLoginButton();
    }

    @Then("should see Error Message: {string} on Login Page")
    public void shouldSeeErrorMessageOnLoginPage(String expMessage) {
        String actualMessage = login.getTextErrorMessage();
        Assert.assertEquals(actualMessage,expMessage);
    }

    @Then("should see Logo on Login Page")
    public void shouldSeeLogoOnLoginPage() {
        login.checkLogo();
    }

    @Then("should see Username Textbox: {string} on Login Page")
    public void shouldSeeUsernameTextboxOnLoginPage(String expText) {
        String actualText = login.getTextUsername();
        Assert.assertEquals(actualText,expText);
    }

    @Then("should see Password Textbox: {string} on Login Page")
    public void shouldSeeUsernamePasswordOnLoginPage(String expText) {
        String actualText = login.getTextPassword();
        Assert.assertEquals(actualText,expText);
    }

    @Then("should see Login Button: {string} on Login Page")
    public void shouldSeeLoginButtonOnLoginPage(String expText) {
        String actualText = login.getTextLoginButton();
        Assert.assertEquals(actualText,expText);
    }

    @Then("should see Icon on Login Page")
    public void shouldSeeIconOnLoginPage() {
        login.checkIcon();
    }
}
