package pages;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchScreen
{
    public AppiumDriver driver;
    public SearchScreen(AppiumDriver driver) {
        this.driver = driver;
    }
    By SearchBar = MobileBy.xpath("//android.widget.EditText[@text='What are you looking for?']");
    By AddToCartBtn= MobileBy.AccessibilityId("Add to cart");

    public void SearchProduct() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(SearchBar));
        driver.findElement(SearchBar).click();
        driver.findElement(SearchBar).sendKeys("Pepsi can" );
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));       // driver.findElement(SearchBar).sendKeys(Keys.ENTER);
    }

    public void AddToCart(){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(AddToCartBtn));
        driver.findElement(AddToCartBtn).click();
    }

}
