package Pages.ListYourSpacePages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PoliciesPage {
    WebDriver driver;

    By cancel5Days = By.name("5 Days");
    By unMarriedCouplesNo = By.id("unmarried_couples_allowed2");
    By alcoholNo = By.id("alcohol_allowed2");
    By smokingNo = By.id("smoking_allowed_within_property2");
    By eventsAllowedNo = By.id("private_parties_events_allowed2");
    By entryAndExitTimeNo = By.id("restrictions_on_entry_exit_timings2");
    By visitorsAllowedNo = By.id("visitors_allowed2");
    By wheelChairNo = By.id("wheel_chair_accessibility2");
    By terms1 = By.id("agree1");
    By terms2 = By.id("agree2");
    By terms3 = By.id("agree3");
    By clickToDown = By.cssSelector("i[title = 'click to scroll to down']");
    By termsAgreeButton = By.xpath("//button[text() = 'I AGREE']");
    By foodAndKitchenYes = By.id("{cook_available1}");
    By petPolicesYes = By.id("{pets_allowed1}");

    By buffet = By.cssSelector("input[placeholder = 'Buffet name']");
    By vegPrice = By.cssSelector("input[placeholder = '00']");
    By buffetDelete = By.cssSelector("button[class = 'btn btn-outline-secondary  feature-buttons']");

    public PoliciesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void govtIdSelection() {
        driver.findElement(By.cssSelector("div[class = 'Select Proof__indicator Select Proof__dropdown-indicator css-1xc3v61-indicatorContainer']")).click();
        driver.findElement(By.xpath("//div[text() = 'Government Id']")).click();
    }

    public void foodAndKitechenAsSouthIndian() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(petPolicesYes));
        driver.findElement(foodAndKitchenYes).click();
        driver.findElement(By.cssSelector("div[class = 'select Cuisine__indicator select Cuisine__dropdown-indicator css-1xc3v61-indicatorContainer']")).click();
        driver.findElement(By.xpath("//div[text() = 'South Indian']")).click();

    }

    public void petPoliciAsThree() {
        driver.findElement(petPolicesYes).click();
        Select select = new Select(driver.findElement(By.name("pets_number")));
        select.selectByVisibleText(" Three ");
    }

    public WebElement cancel5Days() {
        return driver.findElement(cancel5Days);
    }
    public WebElement unMarriedcoupleNo() {
        return driver.findElement(unMarriedCouplesNo);
    }
    public WebElement alcoholNo() {
        return driver.findElement(alcoholNo);
    }
    public WebElement smokinNo() {
        return driver.findElement(smokingNo);
    }
    public WebElement eventsAllowedNo() {
        return driver.findElement(eventsAllowedNo);
    }
    public WebElement entryExitNo() {
        return driver.findElement(entryAndExitTimeNo);
    }
    public WebElement visitorsAllowedNo() {
        return driver.findElement(visitorsAllowedNo);
    }
    public WebElement wheelChairNo() {
        return driver.findElement(wheelChairNo);
    }
    public WebElement terms1() {
        return driver.findElement(terms1);
    }
    public WebElement terms2() {
        return driver.findElement(terms2);
    }
    public WebElement terms3() {
        return driver.findElement(terms3);
    }
    public WebElement clickToDown() {
        return driver.findElement(clickToDown);
    }
    public WebElement termsAgreeButton() {
        return driver.findElement(termsAgreeButton);
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


}
