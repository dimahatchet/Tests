package utility;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseWebDriverInit {
    public static AndroidDriver setUp() throws MalformedURLException {
        AndroidDriver driver = null;
        // Created object of DesiredCapabilities class.

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "LG K10");
        capabilities.setCapability("app", "D:\\Downloads\\4shared_100.0.0.13017_freeRelease.apk");
        capabilities.setCapability(CapabilityType.VERSION, "10");
        //capabilities.setCapability("udid", "HT7AK1A01486");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("autoGrantPermissions", true);
        //capabilities.setCapability("appPackage", "com.forshared.files");
        //capabilities.setCapability("appActivity", "com.forshared.files/com.cloud.SplashActivity");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        return driver;
    }


}
