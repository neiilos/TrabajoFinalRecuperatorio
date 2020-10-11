package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverManagement {

    private static WebDriver driver;

    public static void initializeWebDriver() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        if (driver == null) {
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().window().maximize();
        }
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    public static void navigateTo(String url) {
        driver.get(url);
    }

    public static void clickByCssSelector(String cssSelector) {
        driver.findElement(By.cssSelector(cssSelector)).click();
    }

    public static void clickById(String id) {
        driver.findElement(By.id(id)).click();
    }

    public static void sendKeysById(String id, String text) {
        driver.findElement(By.id(id)).clear();
        driver.findElement(By.id(id)).sendKeys(text);
    }

    public static String getElementTextByCss(String cssSelector) {
        return driver.findElement(By.cssSelector(cssSelector)).getText();
    }
}


