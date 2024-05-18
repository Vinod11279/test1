package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class SignUpPage{
    private WebDriver driver;
    private WebDriverWait wait;

    By firstName = By.cssSelector("input[name = 'firstName']");
    By lastName = By.cssSelector("input[name = 'lastName']");
    By email = By.cssSelector("input[name = 'email']");
    By mobile = By.cssSelector("input[type = 'tel']");
    By password = By.cssSelector("input[name = 'password']");
    By terms = By.cssSelector("input[name = 'terms']");
    By registerButton = By.cssSelector("button[type = 'submit']");

    By googleButton = By.xpath("//button[@type = 'button' and span = 'Register with Google']");
    By googleSignInLogo = By.xpath("//button[text() = 'spotlet.in']");

    By registerLoginButton = By.xpath("//a[text() = 'Log In']");

    By whatsAppButton = By.xpath("//button[@type = 'button' and text() = ' Register with WhatsApp']");
    By verifyWhatsApp = By.cssSelector("input[placeholder = 'Enter phone number']");
    By emainInput = By.cssSelector("input[type = 'email']");

    By otp1 = By.xpath("/html/body/div[4]/div/div/div[2]/div[1]/input[1]");
    By otp2 = By.xpath("/html/body/div[4]/div/div/div[2]/div[1]/input[2]");
    By otp3 = By.xpath("/html/body/div[4]/div/div/div[2]/div[1]/input[3]");
    By otp4 = By.xpath("/html/body/div[4]/div/div/div[2]/div[1]/input[4]");

    By listYourSpace = By.xpath("//span[text() = 'List  Your Space']");

    By otpverifyButton = By.xpath("//button[text() = 'Verify Email']");

    By resendOtp = By.xpath("//button[text() = 'Resend Code']");

    By errFirstName = By.xpath("//div[text() = 'First Name is required']");
    By erremail = By.xpath("//div[text() = 'Email Address is required']");
    By errpassword = By.xpath("//div[text() = 'Password is required']");

    By mobileNoError = By.xpath("//p[text() = 'Enter Valid Phone Number']");
    By countryDropDown = By.cssSelector("select[aria-label = 'Phone number country']");

    By termsLink = By.xpath("/html/body/div[4]/div/div/div[2]/div[3]/form/div[6]/a[1]");
    By privacyPolicyLink = By.xpath("/html/body/div[4]/div/div/div[2]/div[3]/form/div[6]/a[2]");


    public SignUpPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }



    public WebElement registerLoginButton() {
        return driver.findElement(registerLoginButton);
    }

    public void listYourSpace() {
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(listYourSpace)));
        driver.findElement(listYourSpace).click();
    }

    public void invalidMalaysiaNumber() {
        WebElement dropdown = driver.findElement(countryDropDown);
        Select select = new Select(dropdown);
        select.selectByVisibleText("Malaysia");
    }

    public void emailAlreadyExisted() {
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public WebElement mobileNoError() {
        return driver.findElement(mobileNoError);
    }

    public void errFirstName() {
        driver.findElement(errFirstName).isDisplayed();
    }

    public void errEmail() {
        driver.findElement(erremail).isDisplayed();
    }

    public void errPassword() {
        driver.findElement(errpassword).isDisplayed();
    }

    public void userEnterInvalidOtp() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text() = 'Verify your Email Address']")));

        driver.findElement(otp1).sendKeys("1");
        driver.findElement(otp2).sendKeys("2");
        driver.findElement(otp3).sendKeys("3");
        driver.findElement(otp4).sendKeys("4");
        driver.findElement(otpverifyButton).click();
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public void resendOtp() {
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(130));
        wait2.until(ExpectedConditions.elementToBeClickable(resendOtp));
        driver.findElement(resendOtp).click();
    }



    public void googleSigninLogo() {
        String parentWindowHandle = driver.getWindowHandle();
        Set<String> allWindowHandles = driver.getWindowHandles();
        for (String windowHandle : allWindowHandles) {

            if (!windowHandle.equals(parentWindowHandle)) {

                driver.switchTo().window(windowHandle);
                break;
            }
        }

        wait.until(ExpectedConditions.visibilityOfElementLocated(googleSignInLogo));
        driver.findElement(googleSignInLogo).isDisplayed();
    }

    public WebElement googleButton() {
        wait.until(ExpectedConditions.elementToBeClickable(googleButton));
        return driver.findElement(googleButton);
    }

    public void otpVerifyWindow() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text() = 'Verify your Mobile Number']")));
    }

    public WebElement registerButton() {
        return driver.findElement(registerButton);
    }

    public WebElement terms() {
        return driver.findElement(terms);
    }

    public WebElement password() {
        return driver.findElement(password);
    }

    public WebElement mobile() {
        return driver.findElement(mobile);
    }

    public WebElement email() {
        return driver.findElement(email);
    }

    public WebElement lastName() {
        return driver.findElement(lastName);
    }

    public WebElement fistName() {
        return driver.findElement(firstName);
    }

}
