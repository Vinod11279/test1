package Pages.ListYourSpacePages.PricingAndTimingsPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TvShootOption {
    WebDriver driver;

    By tvYes = By.cssSelector("input[id = 'tv']");
    By tvHourlyPrice = By.id("tv-hourly-price");
    By noOfAttendees = By.cssSelector("input[placeholder= 'No. of attendees']");
    By setTime = By.cssSelector("select[class = 'textFiledSelect']");
    By tvMonTiming = By.id("tv-timings-monday-fullDay");
    By minHourBookingError = By.xpath("//span[text() = 'Select Min booking Hrs']");
    By selectTimingError = By.xpath("//span[text() = 'Select Min booking Hrs']");
    By noOfAttendeesError = By.xpath("//span[text() = 'Please Enter no. of attendees']");


    public TvShootOption(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement tvYes() {
        return driver.findElement(tvYes);
    }

    public WebElement tvHourlyPrice() {
        return driver.findElement(tvHourlyPrice);
    }
    public WebElement noOfAttendees() {
        return driver.findElements(noOfAttendees).get(1);
    }

    public WebElement tvsetStartTime() {
        return driver.findElements(setTime).get(3);
    }

    public WebElement tvsetEndTime() {
        return driver.findElements(setTime).get(4);
    }



    public WebElement tvMonTiming() {
        return driver.findElement(tvMonTiming);
    }
    public WebElement tvAttendees() {
        return driver.findElements(noOfAttendees).get(1);
    }
    public WebElement minHourBookingError() {
        return driver.findElement(minHourBookingError);
    }

    public WebElement selectTimingError() {
        return driver.findElement(selectTimingError);
    }

    public WebElement noOfAttenError() {
        return driver.findElement(noOfAttendeesError);
    }

}
