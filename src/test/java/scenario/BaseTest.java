package scenario;

import entities.pages.MorePage;
import entities.pages.PostOfficePage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {
    protected AppiumDriver driver;
    protected PostOfficePage postOfficePage;
    protected MorePage morePage;

    public AppiumDriver setUpDriver(String deviceName, String udid, String platformName, String bundleId){
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("deviceName",deviceName);
        capabilities.setCapability("udid", udid);
        capabilities.setCapability("platformName",platformName);
        capabilities.setCapability("bundleId",bundleId);

        try {
            driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return driver;
    }

    @Parameters({"deviceName", "udid", "platformName", "bundleId"})
    @BeforeTest(alwaysRun = true)
    public void setUp(String deviceName, String udid, String platformName, String bundleId){
        driver = setUpDriver(deviceName, udid, platformName, bundleId);
        postOfficePage = new PostOfficePage(driver);
        morePage = new MorePage(driver);

    }

    @AfterTest
    public void shutDown(){
        System.out.println("The end");
        driver.closeApp();
    }

}
