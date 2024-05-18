package Pages.ListYourSpacePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ListPlanPage {
    WebDriver driver;
    WebDriverWait wait;

    public ListPlanPage(WebDriver driver) {
        this.driver = driver;
    }

    By selectPlanButton = By.xpath("//button[text() = 'Select Plan']");
    public void premiumPlanButton() {
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElements(selectPlanButton).get(2)));
        driver.findElements(selectPlanButton).get(2).click();
    }
}
