import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Setup {
    AndroidDriver driver;
    @BeforeTest
    public AndroidDriver setup() throws MalformedURLException {
        DesiredCapabilities caps=new DesiredCapabilities();
        caps.setCapability("platformName", "android");
        caps.setCapability("platformVersion", "12");
        caps.setCapability("deviceName", "emulator");
        caps.setCapability("appPackage", "apps.newspaper.kalbela");
        caps.setCapability("appActivity", "apps.newspaper.kalbela.MainActivity");
        caps.setCapability("app", "D:\\apk\\Kalbela_ Bangla Newspaper_1.0.12_apkcombo.com.apk");
        caps.setCapability("automationName", "UiAutomator2");

        URL url=new URL("http://127.0.0.1:4723");
        driver=new AndroidDriver(url,caps);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        return driver;

    }
    @AfterTest
    public void quitDriver(){
        driver.quit();
    }
}
