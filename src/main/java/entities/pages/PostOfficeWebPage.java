package entities.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PostOfficeWebPage {

    @iOSXCUITFindBy(xpath = "")
    public WebElement searchField;

    @iOSXCUITFindBy(xpath = "")
    public WebElement searchButton;

    @iOSXCUITFindBy(xpath = "")
    public WebElement postInfoIdField;

    public PostOfficeWebPage(AppiumDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

}
