package scenario;

import org.testng.annotations.Test;

public class PostOfficeNativeAndWebIOSTest extends BaseTest{

    @Test(groups = {"hybrid"}, description = "open native app, then open browser and return to native")
    public void hybridTest(){
        postOfficePage.searchField.sendKeys("id");
        postOfficePage.postInfoIdField.getText().contains("text");
        driver.get("http://pochta.ru");
        postOfficeWebPage.searchButton.sendKeys("id");
        postOfficeWebPage.postInfoIdField.getText().contains("text");

    }
}
