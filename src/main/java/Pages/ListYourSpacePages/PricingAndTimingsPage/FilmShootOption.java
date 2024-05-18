package Pages.ListYourSpacePages.PricingAndTimingsPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FilmShootOption {
    public WebDriver driver;

    By filmYes = By.cssSelector("input[id = 'film']");
    By hourlyPrice = By.cssSelector("input[placeholder= 'Enter hourly price']");
    By noOfAttendees = By.cssSelector("input[placeholder= 'No. of attendees']");
    By minimumHourBooking = By.id("film-minimumBooking");
    By monFullTiming = By.id("film-timings-monday-fullDay");
    By monSetTiming = By.id("film-timings-monday-setHours");

    By minHourBookingError = By.xpath("//span[text() = 'Select Min booking Hrs']");
    By selectTimingError = By.xpath("//span[text() = 'Select Min booking Hrs']");
    By noOfAttendeesError = By.xpath("//span[text() = 'Please Enter no. of attendees']");
    By setTime = By.cssSelector("select[class = 'textFiledSelect']");

    By currency = By.cssSelector("select[name = 'currency']");
    public WebElement currency() {
        return driver.findElement(currency);
    }



    public FilmShootOption(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement filmYes() {
        return driver.findElement(filmYes);
    }

    public WebElement monSetTiming() {
        return driver.findElement(monSetTiming);
    }

    public WebElement monFullTiming() {
        return driver.findElement(monFullTiming);
    }

    public WebElement minimumHourBooking() {
        return driver.findElement(minimumHourBooking);
    }

    public WebElement filmNoOfAttendees() {
        return driver.findElements(noOfAttendees).get(0);
    }

    public WebElement filmHourlyPrice() {
        return driver.findElements(hourlyPrice).get(0);
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

    public WebElement setStartTime() {
        return driver.findElements(setTime).get(2);
    }

    public WebElement setEndTime() {
        return driver.findElements(setTime).get(3);
    }


}
