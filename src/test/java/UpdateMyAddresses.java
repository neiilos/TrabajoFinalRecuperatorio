import PageObjects.LoginPage;
import PageObjects.MyAccountPage;
import PageObjects.MyAddressesPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WebDriverManagement;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UpdateMyAddresses {


    @BeforeEach
    public void setUp() {
        WebDriverManagement.initializeWebDriver();
    }

    @AfterEach
    public void tearDown() {
        WebDriverManagement.quitDriver();
    }

    @Test
    public void updateMyAddress() {
        LoginPage.loginWithValidUser();

        MyAccountPage.navigateToMyAddressesPage();

        MyAddressesPage.updateMyAddressesPage();

        MyAddressesPage.updatePhoneField();

        MyAddressesPage.updateMobilePhoneField();

        MyAddressesPage.updateAddressField();

        MyAddressesPage.updateCompanyField();

        MyAddressesPage.updateAliasField();

        MyAddressesPage.save();

        MyAddressesPage.validateUpdatedAlias();
    }

}
