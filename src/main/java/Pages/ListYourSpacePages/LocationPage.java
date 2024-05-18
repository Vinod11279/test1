package Pages.ListYourSpacePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocationPage {
    WebDriver driver;

    By currentLocation = By.cssSelector("input[id = 'liveLocation']");
    By googleMaps = By.cssSelector("input[id = 'location']");

    public LocationPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement googleMaps() {
        return driver.findElement(googleMaps);
    }

    public WebElement currentLocation() {
        return driver.findElement(currentLocation);
    }

}
