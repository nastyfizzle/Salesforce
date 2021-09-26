package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public static final String LOGIN_URL = "https://cat2.my.salesforce.com/";
    private static final By USERNAME_LOCATOR = By.id("username");
    private static final By PASSWORD_LOCATOR = By.id("password");
    private static final By LOGIN_BUTTON_LOCATOR = By.id("Login");
    private static final By LOGIN_FORM = By.id("login_form");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get(LOGIN_URL);
    }

    public boolean isPageOpened() {
        isVisible(LOGIN_FORM);
        return true;
    }

    public void login(String username, String password) {
        driver.findElement(USERNAME_LOCATOR).sendKeys(username);
        driver.findElement(PASSWORD_LOCATOR).sendKeys(password);
        driver.findElement(LOGIN_BUTTON_LOCATOR).click();
    }
}