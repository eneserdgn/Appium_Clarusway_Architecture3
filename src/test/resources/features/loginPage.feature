@Saucelabs
Feature: SauceLabs

  @Successfully
  Scenario: Successfully Login
    Given user is on the Login Page
    When sendkeys Username: "standard_user" on Login Page
    When sendkeys Password: "secret_sauce" on Login Page
    When click Login Button on Login Page
    Then should see the Products Page

  @FalseCredentials
  Scenario: False Credentials Login
    Given user is on the Login Page
    When sendkeys Username: "deneme" on Login Page
    When sendkeys Password: "deneme" on Login Page
    When click Login Button on Login Page
    Then should see Error Message: "Username and password do not match any user in this service." on Login Page

  @EmptyPassword
  Scenario: Empty Password
    Given user is on the Login Page
    When sendkeys Username: "standart_user" on Login Page
    When click Login Button on Login Page
    Then should see Error Message: "Password is required" on Login Page

  @EmptyUsername
  Scenario: Empty Username
    Given user is on the Login Page
    When sendkeys Password: "secret_sauce" on Login Page
    When click Login Button on Login Page
    Then should see Error Message: "Username is required" on Login Page

  @CheckComponents
  Scenario: Check Components
    Given user is on the Login Page
    Then should see Logo on Login Page
    Then should see Username Textbox: "Username" on Login Page
    Then should see Password Textbox: "Password" on Login Page
    Then should see Login Button: "LOGIN" on Login Page
    Then should see Icon on Login Page

