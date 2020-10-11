package PageObjects;

import utils.WebDriverManagement;

public class LoginPage {

    public static void loginWithValidUser() {
        WebDriverManagement.navigateTo("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        WebDriverManagement.sendKeysById("email", "niilo1542@gmail.com");
        WebDriverManagement.sendKeysById("passwd", "123456");
        WebDriverManagement.clickByCssSelector("#SubmitLogin > span");
    }
}
