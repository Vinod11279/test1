package Pages.ListYourSpacePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RoomOrSpacePage {
    WebDriver driver;

    By lengthInFt = By.cssSelector("input[placeholder = 'Length in Ft");
    By widthInFt = By.cssSelector("input[placeholder = 'Width in Ft");
    By heightInFt = By.cssSelector("input[placeholder = 'Height in Ft");
    By size = By.cssSelector("input[placeholder = '00");
    By saveRoomSpace = By.xpath("//button[text() = ' Save   ']");
    By roomSpaceDeleteButton = By.cssSelector("button[class = 'btn btn-outline-secondary  feature-buttons']");
    By roomName = By.xpath("//input[@class = 'textFiled feature-input' and @type = 'input']");



    public RoomOrSpacePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement deleteButton() {
        return driver.findElements(roomSpaceDeleteButton).get(0);
    }

    public WebElement saveRoomSpace() {
        return driver.findElement(saveRoomSpace);
    }

    public WebElement size() {
        return driver.findElement(size);
    }

    public WebElement lengthInFt() {
        return driver.findElement(lengthInFt);
    }

    public WebElement widthInFt() {
        return driver.findElement(widthInFt);
    }

    public WebElement heightInFt() {
        return driver.findElement(heightInFt);
    }

    public WebElement roomName() {
        return driver.findElement(roomName);
    }





}
