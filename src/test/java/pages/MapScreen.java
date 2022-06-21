package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class MapScreen {
    public AppiumDriver driver;
    public MapScreen(AppiumDriver driver)
    {
        this.driver = driver;
    }

    By ConfirmLocationBtn = MobileBy.AccessibilityId("CONFIRM LOCATION");

    public void ChoseLocation() {
        //WebDriverWait wait = new WebDriverWait(driver, 10);
       // wait.until(ExpectedConditions.elementToBeClickable(ConfirmLocationBtn));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(ConfirmLocationBtn).click();
    }
}
