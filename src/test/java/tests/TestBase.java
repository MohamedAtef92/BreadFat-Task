package tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TestBase {
    public AppiumDriver driver;
    @BeforeTest
    public void setup () {
        try {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName","ANDROID");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME,"Device");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION,"8.1.0");
        caps.setCapability(MobileCapabilityType.APP,"C:\\Users\\user\\IdeaProjects\\BreadFast\\src\\test\\resources\\apps\\Breadfast.apk");
            caps.setCapability("autoGrantPermissions", "true");
            URL url = new URL("http://127.0.0.1:4723/wd/hub");
            driver = new AppiumDriver<MobileElement>(url , caps);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}

