package Pages.ListYourSpacePages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class TypeOfPropertyPage {
    WebDriver driver;
    WebDriverWait wait;

    By cafeAndMart = By.cssSelector("the user select cafe and mart");
    By others = By.xpath("//p[text() = 'Others']");
    By otherTypeOfProperty = By.xpath("//input[@class = 'textFiled me-2']");
    By enterPropertyTypeButton = By.xpath("//button[text() = 'Submit']");
    By saveAndContinueButton = By.xpath("//button[text() = 'Save & Continue']");
    By propertySearch = By.cssSelector("input[placeholder = 'Search type of property']");

    public TypeOfPropertyPage(WebDriver driver) {
        this.driver = driver;
    }

    public void cafeAndMart() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElements(cafeAndMart).get(0).click();
    }

    public void cafe() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElements(By.cssSelector("[name='"+ "Cafe" +"']")).stream().findFirst().get().click();
    }

    public void other() {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(others));
        driver.findElement(others).click();
    }

    public WebElement otherTypeOfProperty() {
        return driver.findElement(otherTypeOfProperty);
    }

    public WebElement enterPropertyTypeButton() {
        return driver.findElements(enterPropertyTypeButton).get(0);
    }

    public WebElement saveAndContinueButton() {
        return driver.findElement(saveAndContinueButton);
    }

    public WebElement propertySearch() {
        return driver.findElement(propertySearch);
    }

}
