package scenario;


import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

public class PostOfficeTest extends BaseTest {

    @Test(groups = {"native"}, description = "open application and login")
    public void loginTest(){
        String title = driver.getTitle();
        postOfficePage.moreButton.click();
        morePage.registrationAndEnter.click();
        morePage.loginField.sendKeys("login");
        morePage.passwordField.sendKeys("password");
        morePage.enterButton.click();
        assertTrue(driver.getTitle().equals(title));
    }

    @Test(groups = {"native"}, description = "serch by post id")
    public void searchTest(){
        postOfficePage.searchField.sendKeys("id");
        postOfficePage.searchButton.click();
        assertTrue(postOfficePage.postInfoIdField.getText().equals("id"));

    }
}
