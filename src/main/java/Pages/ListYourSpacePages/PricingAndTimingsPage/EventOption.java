package Pages.ListYourSpacePages.PricingAndTimingsPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EventOption {
    WebDriver driver;

    By eventYes = By.cssSelector("input[id = 'event']");
    By eventWeekDayPrice = By.cssSelector("input[id = 'event-hourly-price']");
    By eventWeenEndPrice = By.id("event-weekend-price");
    By noOfAttendees = By.cssSelector("input[placeholder= 'No. of attendees']");
    By eventMonTiming = By.id("event-timings-monday-fullDay");
    By catering = By.id("event-catering-yes");
    By buffet = By.cssSelector("input[placeholder = 'Buffet name']");
    By vegPrice = By.cssSelector("input[placeholder = '00']");
    By buffetDelete = By.cssSelector("button[class = 'btn btn-outline-secondary  feature-buttons']");
    By minHourBookingError = By.xpath("//span[text() = 'Select Min booking Hrs']");
    By selectTimingError = By.xpath("//span[text() = 'Select Min booking Hrs']");
    By noOfAttendeesError = By.xpath("//span[text() = 'Please Enter no. of attendees']");


    public EventOption(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement buffetDelete() {
        return driver.findElement(buffetDelete);
    }

    public WebElement vegPrice() {
        return driver.findElements(vegPrice).get(0);
    }

    public WebElement nonVegPrice() {
        return driver.findElements(vegPrice).get(1);
    }

    public WebElement buffet() {
        return driver.findElement(buffet);
    }

    public WebElement eventYes() {
        return driver.findElement(eventYes);
    }

    public WebElement eventTiming() {
        return driver.findElement(eventMonTiming);
    }

    public WebElement eventAttendees() {
        return driver.findElements(noOfAttendees).get(2);
    }

    public WebElement eventWeekDayPrice() {
        return driver.findElement(eventWeekDayPrice);
    }

    public WebElement eventWeekEndPrice() {
        return driver.findElement(eventWeenEndPrice);
    }

    public WebElement catering() {
        return driver.findElement(catering);
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
