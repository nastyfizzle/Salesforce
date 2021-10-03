package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public static final String LOGIN_URL = "https://cat2.my.salesforce.com";
    private static final By USERNAME_LOCATOR = By.id("username");
    private static final By PASSWORD_LOCATOR = By.id("password");
    private static final By LOGIN_BUTTON_LOCATOR = By.id("Login");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public LoginPage open() {
        driver.get(LOGIN_URL);
        isPageOpened();
        return this;
    }

    @Override
    public LoginPage isPageOpened() {
        isVisible(LOGIN_BUTTON_LOCATOR);
        return this;
    }

    public HomePage login(String username, String password) {
        driver.findElement(USERNAME_LOCATOR).sendKeys(username);
        driver.findElement(PASSWORD_LOCATOR).sendKeys(password);
        driver.findElement(LOGIN_BUTTON_LOCATOR).click();
        return new HomePage(driver);
    }
}