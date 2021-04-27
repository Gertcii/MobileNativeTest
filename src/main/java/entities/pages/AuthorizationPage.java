package entities.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AuthorizationPage {

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField")
    public WebElement loginField;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeSecureTextField")
    public WebElement passwordField;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name = 'Войти']")
    public WebElement enterButton;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField")
    public List<WebElement> textFieldList;



    public AuthorizationPage(AppiumDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
}
//843b1031d8886a2a6a6b61514ac38b472ff02a51
