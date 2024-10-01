import com.google.common.collect.ImmutableMap;
import com.google.common.util.concurrent.FluentFuture;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class KalbelaAppScreen {

    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.ImageView[1]")
    WebElement logo;

    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Home\n" +
            "Tab 1 of 6\"]")
    WebElement homeButton;

    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Latest\n" +
            "Tab 2 of 6\"]")
    WebElement latestButton;

    @FindBy(xpath = "//android.widget.ImageView[@index ='2']")
    WebElement thirdNews;

    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Video\n" +
            "Tab 3 of 6\"]")
    WebElement videoButton;


    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Story\n" +
            "Tab 4 of 6\"]")
    WebElement storyButton;

    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"99+\n" +
            "Notifications\n" +
            "Tab 5 of 6\"]")
    WebElement notificationsButton;

    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"E-paper\n" +
            "Tab 6 of 6\"]")
    WebElement epaperButton;

    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.ImageView[2]")
    WebElement searchButton;

    @FindBy(xpath = "//android.widget.EditText")
    WebElement searchInput;

    @FindBy(xpath = "//android.widget.ImageView[@index = '0']")
    WebElement searchSubmit;

    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.ImageView[3]")
    WebElement navigationButton;

    AndroidDriver driver;
    WebDriverWait wait;

    public KalbelaAppScreen(AndroidDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(60)); // 30 seconds wait
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void clickLogo() {
        wait.until(ExpectedConditions.visibilityOf(logo)).click();
        System.out.println("Logo clicked successfully.");
    }

    public void clickHome() {
        wait.until(ExpectedConditions.visibilityOf(homeButton)).click();
        System.out.println("Home button clicked successfully.");
    }

    public void clickLatest() {
        wait.until(ExpectedConditions.visibilityOf(latestButton)).click();
        System.out.println("Latest button clicked.");
    }


    public void clickVideos() {
        wait.until(ExpectedConditions.visibilityOf(videoButton)).click();
        System.out.println("Video button clicked.");
    }


    public void viewStory() {
        wait.until(ExpectedConditions.visibilityOf(storyButton)).click();
        System.out.println("Story viewed successfully.");
    }

    public void clickNotifications() {
        wait.until(ExpectedConditions.visibilityOf(notificationsButton)).click();
        System.out.println("Notifications clicked successfully.");
    }

    public void clickEpaper() {
        wait.until(ExpectedConditions.visibilityOf(epaperButton)).click();
        System.out.println("E-paper viewed successfully.");
    }

    public void search(String query) {
        wait.until(ExpectedConditions.visibilityOf(searchButton)).click();
        wait.until(ExpectedConditions.visibilityOf(searchInput)).sendKeys(query);
        wait.until(ExpectedConditions.visibilityOf(searchSubmit)).click();
        System.out.println("Search executed successfully for query: " + query);
    }

    public void navigateSection() {
        wait.until(ExpectedConditions.visibilityOf(navigationButton)).click();
        System.out.println("Navigated to the National section.");
    }

}
