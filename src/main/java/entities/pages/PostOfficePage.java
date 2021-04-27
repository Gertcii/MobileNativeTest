package entities.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class PostOfficePage {


    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name = 'rPTabBar_moreTabBarItem']")
    public WebElement moreButton;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='trackingItemList_searchBar']")
    public WebElement searchField;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name = 'Search']")
    public WebElement searchButton;

    //@iOSXCUITFindBy(xpath = "")
    public WebElement postInfoIdField;
//
    public PostOfficePage(AppiumDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

}
