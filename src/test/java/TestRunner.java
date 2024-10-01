import com.google.common.collect.ImmutableMap;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestRunner extends Setup {

    // Delay method to slow down the test execution
    // Add delay method for convenience
    private void delay(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    @Test(priority = 1, description = "Click on the Home button")
    public void testClickHome() {
        KalbelaAppScreen kalbelaAppScreen = new KalbelaAppScreen(driver);
        kalbelaAppScreen.clickHome();
        delay(5000);
        // Scroll down by 3% of the screen height
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("mobile: scrollGesture", ImmutableMap.of(
                    "left", 100,   // Horizontal scroll start point
                    "top", 100,    // Vertical scroll start point
                    "width", 800,  // Scroll width (depends on your screen size)
                    "height", 1200, // Scroll height
                    "direction", "down",  // Direction of scroll
                    "percent", 3.0  // Scroll down by 3% of the screen
            ));
    }

    @Test(priority = 2, description = "Click on the Latest news section")
    public void testClickLatest() {
        KalbelaAppScreen kalbelaAppScreen = new KalbelaAppScreen(driver);
        kalbelaAppScreen.clickLatest();
        delay(3000);
    }


    @Test(priority = 3, description = "Play the a video")
    public void testPlayVideo() {
        KalbelaAppScreen kalbelaAppScreen = new KalbelaAppScreen(driver);
        kalbelaAppScreen.clickVideos();
        delay(2500);  // Delay between the video button click and first video play

    }

    @Test(priority = 4, description = "View a story")
    public void testViewStory() {
        KalbelaAppScreen kalbelaAppScreen = new KalbelaAppScreen(driver);
        kalbelaAppScreen.viewStory();
        delay(2000);
    }

    @Test(priority = 5, description = "Click notifications")
    public void testClickNotifications() {
        KalbelaAppScreen kalbelaAppScreen = new KalbelaAppScreen(driver);
        kalbelaAppScreen.clickNotifications();
        delay(2000);
    }

    @Test(priority = 6, description = "View E-paper")
    public void testClickEpaper() {
        KalbelaAppScreen kalbelaAppScreen = new KalbelaAppScreen(driver);
        kalbelaAppScreen.clickEpaper();
        delay(4000);
        kalbelaAppScreen.clickHome();  // Navigate back to home after viewing the e-paper
        delay(2000);
    }

    @Test(priority = 7, description = "Perform search")
    public void testSearch() {
        KalbelaAppScreen kalbelaAppScreen = new KalbelaAppScreen(driver);
        String query = "bank";
        kalbelaAppScreen.search(query);
        delay(4000);
    }

    @Test(priority = 8, description = "Navigate section to home section by click on logo")
    public void testNavigateSection() {
        KalbelaAppScreen kalbelaAppScreen = new KalbelaAppScreen(driver);
        kalbelaAppScreen.navigateSection();
        kalbelaAppScreen.clickLogo();
        delay(2000);  // 2-second delay
    }


    @AfterMethod
    public void clear() {
        System.out.println("After method: Resetting state if necessary.");
        delay(2000);  // Adding delay between each test case
    }
}
