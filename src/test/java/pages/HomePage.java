package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    public String HOME_URL = "/lightning/page/home";
    public static final By NAVIGATION_OPTIONS = By.xpath("//*[contains(text(), '%s')]/ancestor::*[contains(@class, 'slds-context-bar__label-action dndItem')]");
    private static final By NAVIGATION_BAR = By.xpath("//*[contains(@class, 'oneAppNavContainer')]");
    public static final By SEARCH_FIELD = By.xpath("//*[contains(@class, 'inputWrapper')]");
    public static final By HEADER = By.id("oneHeader");


    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public HomePage open() {
        driver.get(BASE_URL + HOME_URL);
        return null;
    }

    public boolean isPageOpened() {
        return isVisible(HEADER);
    }
}
