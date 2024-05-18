package Pages.ListYourSpacePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasicInformationPage {
    WebDriver driver;

    By propertyName = By.id("property_name");
    By propertySize = By.id("property_size");
    By inHouseParkingYes = By.id("parking");
    By inHouseParkingNo = By.id("parking2");
    By streetParkingYes = By.id("street_parking");
    By streetParkingNo = By.id("street_parking2");
    By securityCameraYes = By.id("security_camera");
    By securityCameraNo = By.id("security_camera2");
    By valetParkingYes = By.id("valet_parking");
    By valetParkingNo = By.id("valet_parking2");
    By descriptionOfLocation = By.cssSelector("textarea[class = 'basicInfoDescription']");
    By noOfCars = By.cssSelector("input[placeholder = 'Enter No of Cars']");

    public BasicInformationPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement propertyName() {
        return driver.findElement(propertyName);
    }
    public WebElement propertySize() {
        return driver.findElement(propertySize);
    }
    public WebElement inHouseParkingYes() {
        return driver.findElement(inHouseParkingYes);
    }
    public WebElement inHouseParkingNo() {
        return driver.findElement(inHouseParkingNo);
    }
    public WebElement streetParkingYes() {
        return driver.findElement(streetParkingYes);
    }
    public WebElement streetParkingNo() {
        return driver.findElement(streetParkingNo);
    }
    public WebElement securityCameraYes() {
        return driver.findElement(securityCameraYes);
    }
    public WebElement securityCameraNo() {
        return driver.findElement(securityCameraNo);
    }
    public WebElement valetParkingYes() {
        return driver.findElement(valetParkingYes);
    }
    public WebElement valetParkingNo() {
        return driver.findElement(valetParkingNo);
    }
    public WebElement descriptionOfLocation() {
        return driver.findElement(descriptionOfLocation);
    }
    public WebElement noOfCars() {
        return driver.findElement(noOfCars);
    }




}
