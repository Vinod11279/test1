package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;


    By listYourSpaceLogo = By.xpath("//span[text() = 'List  Your Space']");
    By registerLogo = By.xpath("//span[@class = 'headerLinks listYourSpace cursor' and text() = 'Register']");
    By loginLogo = By.xpath("//span[@class = 'headerLinks listYourSpace cursor' and text() = 'Log In']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement listYourSpaceLogo() {
        return driver.findElement(listYourSpaceLogo);
    }

    public WebElement registerLogo() {
        return driver.findElement(registerLogo);
    }

    public WebElement loginLogo() {
        return driver.findElement(loginLogo);
    }

}
