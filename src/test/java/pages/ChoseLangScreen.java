package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChoseLangScreen {
    public AppiumDriver driver;
    public ChoseLangScreen(AppiumDriver driver) {
        this.driver = driver;
    }

    //MobileElement EnglishBtn = driver.findElement(MobileBy.AccessibilityId("en"));
    By EnglishBtn = MobileBy.AccessibilityId("en");
    By ContinueBtn = MobileBy.AccessibilityId("Continue");
    public void choseLang(){
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(EnglishBtn));
        driver.findElement(EnglishBtn).click();
        driver.findElement(ContinueBtn).click();
    }

}
