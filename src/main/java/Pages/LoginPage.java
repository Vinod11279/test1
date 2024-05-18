package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    private WebDriver driver;
    private WebDriverWait wait;


    By email = By.id("uemail");
    By password = By.id("upwd");
    By loginButton = By.cssSelector("button[type = 'submit']");
    By favouritesLogo = By.cssSelector("img[title = 'Favourites']");
    By selectPlanButton = By.xpath("//button[text() = 'Select Plan']");
    By userNameError = By.xpath("/html/body/div[4]/div/div/div[2]/form/div[2]/div/p");

    By forgotButton = By.xpath("//button[text() = 'Forgot Password?']");
    By resetButton = By.xpath("//button[text() = 'Reset']");
    By resetEmailInput = By.id("validationFormik101");

    By googleButton = By.xpath("//button[span[text()='Log In with Google']]");
    By whatsAppButton = By.xpath("//button[text() = ' Log In with WhatsApp']");
    By whatsAppNumber = By.cssSelector("input[placeholder = 'Enter phone number']");
    By whatsAppLoginButton = By.xpath("//button[text() = 'LOG IN']");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public WebElement email() {
        return driver.findElement(email);
    }

    public WebElement password() {
        return driver.findElement(password);
    }

    public WebElement loginButton() {
        return driver.findElement(loginButton);
    }

    public WebElement favouritesLogo() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(favouritesLogo));
        return driver.findElement(favouritesLogo);
    }

    public WebElement googleButton() {
        wait.until(ExpectedConditions.elementToBeClickable(googleButton));
        return driver.findElement(googleButton);
    }

    public WebElement whatsAppButton() {
        wait.until(ExpectedConditions.elementToBeClickable(whatsAppButton));
        return driver.findElement(whatsAppButton);
    }

    public WebElement whatsAppNumber() {
        return driver.findElement(whatsAppNumber);
    }

    public WebElement whatsAppLoginButton() {
        return driver.findElement(whatsAppLoginButton);
    }

    public WebElement resetEmailInput() {
        return driver.findElement(resetEmailInput);
    }

    public WebElement resetButton() {
        return driver.findElement(resetButton);
    }

    public WebElement forgotButton() {
        return driver.findElement(forgotButton);
    }

    public void userNameError() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(userNameError));
        driver.findElement(userNameError).isDisplayed();
    }


    public void basicPlanButton() {
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElements(selectPlanButton).get(0)));
        driver.findElements(selectPlanButton).get(0).click();

    }
}
