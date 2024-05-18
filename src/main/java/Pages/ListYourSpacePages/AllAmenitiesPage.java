package Pages.ListYourSpacePages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AllAmenitiesPage {
    WebDriver driver;

    By airConditioning = By.id("Air Conditioning");
    By airConditioningDropdown = By.cssSelector("div[class = 'amenities-select css-b62m3t-container']");
    By indoorSwimmingPool = By.id("Indoor Swimming Pool");
    By balconyTerrace = By.id("Balcony / Terrace");
    By evChargingStation = By.id("EV Charging Station");
    By allAmenitiesOthers = By.xpath("//p[text() = 'Others']");
    By roomName = By.xpath("//input[@class = 'textFiled feature-input' and @type = 'input']");

    public AllAmenitiesPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement airConditioning() {
        return driver.findElement(airConditioning);
    }
    public WebElement airConditioningDropdown() {
        return driver.findElements(airConditioningDropdown).get(0);
    }

    public WebElement indoorSwimmingPool() {
        return driver.findElement(indoorSwimmingPool);
    }
    public WebElement balconyTerrace() {
        return driver.findElement(balconyTerrace);
    }
    public WebElement evChargingStation() {
        return driver.findElement(evChargingStation);
    }
    public WebElement allAmenitiesOthers() {
        return driver.findElement(allAmenitiesOthers);
    }
    public WebElement roomName() {
        return driver.findElement(roomName);
    }

    public void twoAmenitesError() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    public WebElement newAmenityInput() {
        return driver.findElement(By.cssSelector("input[class= 'textFiled me-2']"));
    }



}
