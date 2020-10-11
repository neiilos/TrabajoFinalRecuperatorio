package PageObjects;

import utils.WebDriverManagement;

public class MyAccountPage {

    public static void navigateToMyAddressesPage() {
        WebDriverManagement.clickByCssSelector("li:nth-child(3) > a > span:nth-child(2)");
    }
}
