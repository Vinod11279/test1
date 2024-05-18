package StepDefinitions;


import Pages.HomePage;
import Pages.LoginPage;
import Pages.SignUpPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;
import java.util.Set;

public class Login {
    WebDriver driver;
    LoginPage loginPage;
    HomePage homePage;
    SignUpPage signUpPage;
    WebDriverWait wait;

    public Login (BaseTest baseTest) {
        baseTest.setup();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        signUpPage = new SignUpPage(driver);
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
    }

    @When("the user enter whatsapp number")
    public void the_user_enter_whatsapp_number() {
        loginPage.whatsAppNumber().sendKeys("8919671663");
    }

    @When("the user click whatsapp login button")
    public void the_user_click_whatsapp_login_button() {
        loginPage.whatsAppLoginButton().click();
    }

    @Then("whatsapp otp window will appear")
    public void whatsapp_otp_window_will_appear() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text() = 'Verify OTP']")));
    }
    @And("the user click on whatsapp button")
    public void the_user_click_on_whatsapp_button() {
        loginPage.whatsAppButton().click();
    }

    @Then("google window will open")
    public void google_window_will_open() {
        String parentWindowHandle = driver.getWindowHandle();
        Set<String> allWindowHandles = driver.getWindowHandles();
        for (String windowHandle : allWindowHandles) {
            if (!windowHandle.equals(parentWindowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text() = 'Sign in with Google']")));
        driver.findElement(By.xpath("//div[text() = 'Sign in with Google']")).isDisplayed();
    }

    @And("the user click on google button")
    public void the_user_click_on_google_button() {
        loginPage.googleButton().click();
    }

    @Then("please check your email message will appear")
    public void please_check_your_email_message_will_appear() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text() = 'Please check your email. Email sent successfully!']")));
    }

    @Then("the user click reset email submit button")
    public void the_user_click_reset_email_submit_button() {
        loginPage.resetButton().click();
    }

    @Then("the user enter reset email")
    public void enter_email_window_will_appear() {
        loginPage.resetEmailInput().sendKeys("spotlet123@gmail.com");
    }


    @And("the user click on forgot password")
    public void user_click_on_forgot_password() {
        loginPage.forgotButton().click();
    }


    @Then("user does not exist popup is displayed")
    public void user_does_not_exist_popup_is_displayed() {
        loginPage.userNameError();
    }


    @When("the user click on loginLogo")
    public void the_user_click_on_loginLogo() {
        homePage.loginLogo().click();
    }

    @When("the user enter login email as {string}")
    public void the_user_enter_valid_login_username(String str) {
        loginPage.email().sendKeys(str);
    }

    @When("the user enter login password as {string}")
    public void the_user_enter_valid_login_password(String str) {
        loginPage.password().sendKeys(str);
    }

    @When("the user click on login button")
    public void the_user_click_on_login_button() {
        loginPage.loginButton().click();
    }

    @Then("home page is displayed")
    public void home_page_is_displayed() {
        loginPage.favouritesLogo().isDisplayed();
    }

    @When("the user click on list your space")
    public void the_user_click_on_list_your_space() {
        signUpPage.listYourSpace();
    }

    @Then("select your plan window will display")
    public void select_your_plan_window_will_display() {
        wait.until(ExpectedConditions.urlToBe("https://dev.spotlet.in/plans"));
    }
    @When("the user click login in registation page")
    public void the_user_click_login_in_registration_page() {
        signUpPage.registerLoginButton().click();
    }
}
