package forshared_tests;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import utility.BaseWebDriverInit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class FirstTest {

    private Object AndroidKeyCode;

    @Test
    public void testFirstCalculator() throws MalformedURLException {
        AndroidDriver driver = null;
        driver = BaseWebDriverInit.setUp();
        driver.findElement(MobileBy.id("com.forshared.files:id/buttonPositive")).click();
        driver.findElement(MobileBy.id("com.forshared.files:id/captionContinueEmail")).click();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        driver.findElement(MobileBy.className("android.widget.FrameLayout")).click();
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        //driver.navigate().back();
        driver.findElement(MobileBy.id("com.forshared.files:id/btnLoginGp")).click();
        //List<WebElement> element = driver.findElements(By.id("com.google.android.gms:id/container"));
        //element(0).
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    }


}



