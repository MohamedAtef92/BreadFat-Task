package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IntroScreen {
    public AppiumDriver driver;
    public IntroScreen(AppiumDriver driver) {
        this.driver = driver;
    }
    By SkipBtn = MobileBy.AccessibilityId("Skip_btn");
    By ShopBtn = MobileBy.AccessibilityId("Let’s Shop!");

    public void SkipIntro() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(SkipBtn));
        driver.findElement(SkipBtn).click();
    }

    public void LetsShop() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(ShopBtn));
        driver.findElement(ShopBtn).click();
    }
}
