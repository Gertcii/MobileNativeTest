package scenario;

import entities.pages.AuthorizationPage;
import entities.pages.MorePage;
import entities.pages.PostOfficePage;
import entities.pages.PostOfficeWebPage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected AppiumDriver driver;
    protected PostOfficePage postOfficePage;
    protected MorePage morePage;
    protected AuthorizationPage authorizationPage;

    protected PostOfficeWebPage postOfficeWebPage;

    public void setUpDriver(String udid, String platformName, String bundleId){
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("udid", udid);
        capabilities.setCapability("platformName",platformName);
        capabilities.setCapability("bundleId",bundleId);

        try {
            driver = new AppiumDriver(new URL(System.getProperty("ts.appium")), capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Parameters({ "udid", "platformName", "bundleId"})
    @BeforeTest(alwaysRun = true)
    public void setUp(String udid, String platformName, String bundleId) throws InterruptedException {
        setUpDriver(udid, platformName, bundleId);

        Thread.sleep(10000);

        postOfficePage = new PostOfficePage(driver);
        //morePage = new MorePage(driver);
        //authorizationPage = new AuthorizationPage(driver);
//
        //postOfficeWebPage = new PostOfficeWebPage(driver);
    }


    @AfterTest(alwaysRun = true)
    public void shutDown(){
        System.out.println("The end");
        driver.closeApp();
    }

}
