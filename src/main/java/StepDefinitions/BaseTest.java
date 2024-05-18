package StepDefinitions;

import Pages.*;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

public class BaseTest {
    WebDriver driver;

    // Setup method to initialize WebDriver and page objects
    @Before
    public void setup() {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Spotlet - Ravi Teja\\Downloads\\chromedriver-win64\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("https://dev.spotlet.in/");
            driver.manage().window().maximize();
    }



}
