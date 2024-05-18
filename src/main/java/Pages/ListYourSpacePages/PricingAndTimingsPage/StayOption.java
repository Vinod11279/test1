package Pages.ListYourSpacePages.PricingAndTimingsPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StayOption {
    WebDriver driver;

    By stayYes = By.cssSelector("input[id = 'stay']");
    By weekDayPrice = By.cssSelector("input[placeholder = 'Enter Weekday Price Per Night']");
    By weekEndPrice = By.cssSelector("input[placeholder = 'Enter Weekend Price Per Night']");
    By plusButton = By.xpath("//button[text() = '+']");

    public StayOption(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement stayYes() {
        return driver.findElement(stayYes);
    }

    public WebElement weekDayPrice() {
        return driver.findElement(weekDayPrice);
    }

    public WebElement weekEndPrice() {
        return driver.findElement(weekEndPrice);
    }

    public WebElement basePlusButton() {
        return driver.findElements(plusButton).get(0);
    }

    public WebElement maximumPlusButton() {
        return driver.findElements(plusButton).get(1);
    }

    public WebElement mattress() {
        return driver.findElements(plusButton).get(2);
    }

}
