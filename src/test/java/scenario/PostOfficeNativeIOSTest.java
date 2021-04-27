package scenario;


import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertTrue;

public class PostOfficeNativeIOSTest extends BaseTest {

    @Test(groups = {"native"}, description = "open application and login")
    public void loginTest(){

        postOfficePage.moreButton.click();
        //morePage.registrationAndEnter.click();
        //authorizationPage.loginField.sendKeys("");
        //authorizationPage.passwordField.sendKeys("");
        //authorizationPage.enterButton.click();
        //postOfficePage.moreButton.click();
        //morePage.registrationAndEnter.click();
        //List<String> str = new ArrayList<>();
        //authorizationPage.textFieldList.stream().forEach(x -> str.add(x.getText()));
        //assertTrue(str.contains(""));
    }

   // @Test(groups = {"native"}, description = "search parcel by departure code")
   // public void searchAParcelByDepartureCodeTest(){
   //     postOfficePage.searchField.sendKeys("id");
   //     postOfficePage.searchButton.click();
   //     assertTrue(postOfficePage.postInfoIdField.getText().equals("id"));
//
   // }
//
   // @Test(groups = {"native"}, description = "search EMS or international departure by departure code")
   // public void searchEMSByDepartureCodeTest(){
   //     postOfficePage.searchField.sendKeys("id");
   //     postOfficePage.searchButton.click();
   //     assertTrue(postOfficePage.postInfoIdField.getText().equals("id"));
   // }
//
   // @Test(groups = {"native"}, description = "search multi departure by departure code")
   // public void searchMultiDepartureByDepartureCodeTest(){
   //     postOfficePage.searchField.sendKeys("id");
   //     postOfficePage.searchButton.click();
   //     assertTrue(postOfficePage.postInfoIdField.getText().equals("id"));
   // }
}
