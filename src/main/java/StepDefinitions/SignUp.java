package StepDefinitions;

import Pages.HomePage;
import Pages.SignUpPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class SignUp  {
    WebDriver driver;
    WebDriverWait wait;
    SignUpPage signUpPage;
    HomePage homePage;



    public SignUp (BaseTest baseTest) {
        baseTest.setup();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        signUpPage = new SignUpPage(driver);
        homePage = new HomePage(driver);
    }

    @When("the user on home page")
    public void the_user_on_home_page() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("img[src = '/static/media/Spotlet_V1 .2495b9baabd9b3b46168.webp']")));
    }

    @Then("the user enter malaysia mobile number as {long}")
    public void invalid_malaysia_number(Long num) {
        String int2 = String.valueOf(num);
        signUpPage.mobile().sendKeys(int2);
    }

    @And("the user enter valid malaysia number as {long}")
    public void the_user_enter_valid_malaysia_number(Long num) {
        signUpPage.mobile().sendKeys(String.valueOf(num));
    }

    @Then("the user select malaysia on dropdown")
    public void the_user_enter_malaysia_on_dropdown() {
        signUpPage.invalidMalaysiaNumber();
    }

    @Then("error message for first name")
    public void error_message_for_first_name() {
        signUpPage.errFirstName();
    }

    @Then("error message for email")
    public void error_message_for_email() {
        signUpPage.errEmail();
    }

    @Then("error message for password")
    public void error_messafe_for_password() {
        signUpPage.errPassword();
    }

    @Then("Email already Existed pop up will appear")
    public void email_already_existed_popup_will_appear() {
        signUpPage.emailAlreadyExisted();
    }

    @Then("user click resend otp")
    public void user_click_resend_otp() {
        signUpPage.resendOtp();
    }

    @Then("the user enter invalid otp")
    public void user_enter_invalidOtp() {
        signUpPage.userEnterInvalidOtp();
    }

    @When("the user click on register button")
    public void the_user_click_on_register_button() {
        homePage.registerLogo().click();
    }

    @When("the user click on register submit button")
    public void the_user_click_on_register_submit_button() {
        signUpPage.registerButton().click();
    }

    @Then("^the user enter first name as (.+)$")
    public void the_user_enter_first_name(String firstName) {
        signUpPage.fistName().sendKeys(firstName);
    }

    @Then("^the user enter last name as (.+)$")
    public void the_user_enter_last_name(String lastname) {
        signUpPage.lastName().sendKeys(lastname);
    }

    @Then("^the user enter email as (.+)$")
    public void the_user_enter_email(String email) {
        signUpPage.email().sendKeys(email);
    }

    @Then("^the user enter phone number as (.+)$")
    public void the_user_enter_phone_number(Long mobileNo2) {
        String mobileNo = String.valueOf(mobileNo2);
        signUpPage.mobile().sendKeys(mobileNo);
    }

    @Then("^the user enter password as (.+)$")
    public void the_user_enter_password(String str) {
        signUpPage.password().sendKeys(str);
    }

    @Then("enter valid phone number error message will appear")
    public void enter_valid_phone_number_error() {
        signUpPage.mobileNoError().isDisplayed();
    }



    @Then("phone number already existed pop up will appear")
    public void phone_number_already_existed_popup_will_appear() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text() = 'Register']")));
    }



    @Then("the user click on terms and conditions")
    public void the_user_click_on_terms_and_conditions() {
        signUpPage.terms().click();
    }

    @Then("the user click register button")
    public void the_user_click_register_button() {
        signUpPage.registerButton().click();
    }

    @Then("otp window will appear")
    public void otpwindowwillappear() {
        signUpPage.otpVerifyWindow();
    }

    @And("user click on google button")
    public void user_click_on_google_button() {
        signUpPage.googleButton().click();
    }

    @Then("google sign in window will appear")
    public void google_sign_in_window_will_appear() {
        signUpPage.googleSigninLogo();
    }

    @Then("code is sent and timer is display")
    public void codeIsSentAndTimerIsDisplay() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p[class = 'timer']"))).isDisplayed();
    }
}
