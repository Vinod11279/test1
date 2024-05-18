package Pages.ListYourSpacePages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GalleryPage {
    WebDriver driver;

    By inputFile = By.cssSelector("input[type = 'file']");

    public GalleryPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement roomOrSpaceFile() {
        return driver.findElements(inputFile).get(1);
    }

    public WebElement propertyFile() {
        return driver.findElements(inputFile).get(0);
    }

    public void alertOk() {
         Alert alert = driver.switchTo().alert();
         alert.accept();
    }


}
