package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomeScreen {
    public AppiumDriver driver;
    public HomeScreen(AppiumDriver driver) {
        this.driver = driver;
    }
    By GotIt = MobileBy.className("/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup");
    By SearchIcon = MobileBy.xpath("(//android.view.ViewGroup[@content-desc=\"Home\"])[2]");

    public void GotIt() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(GotIt));
        driver.findElement(GotIt).click();
    }
    public void ClickSearch() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(SearchIcon));
        driver.findElement(SearchIcon).click();
    }
}
