package tests;

import io.appium.java_client.AppiumDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.*;

public class AddItemFlow extends TestBase {
    @Test
    public void AddToCartFlow(){
        //Chose the language of the app
        ChoseLangScreen langSelect = new ChoseLangScreen(driver);
        langSelect.choseLang();

        IntroScreen introScreen = new IntroScreen(driver);
        introScreen.SkipIntro();
        introScreen.LetsShop();

        MapScreen mapScreen = new MapScreen(driver);
        mapScreen.ChoseLocation();

        HomeScreen homeScreen = new HomeScreen(driver);
        homeScreen.GotIt();
        homeScreen.ClickSearch();

        SearchScreen searchScreen = new SearchScreen(driver);
        searchScreen.SearchProduct();
        searchScreen.AddToCart();
    }

}
