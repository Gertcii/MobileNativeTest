package entities.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class MorePage {

    @iOSXCUITFindBy(xpath = "")
    public WebElement registrationAndEnter;

    @iOSXCUITFindBy(xpath = "")
    public WebElement loginField;

    @iOSXCUITFindBy(xpath = "")
    public WebElement passwordField;

    @iOSXCUITFindBy(xpath = "")
    public WebElement enterButton;

    public MorePage(AppiumDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
}
