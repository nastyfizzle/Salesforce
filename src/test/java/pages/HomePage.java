package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public static final String HOME_ENDPOINT = "lightning/page/home";
    public static final By TAB_OPTION = By.xpath("//*[contains(text(), 'Home')]/ancestor::*[contains(@class, 'slds-context-bar__label-action dndItem')]");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public HomePage open() {
        driver.get(BASE_URL + HOME_ENDPOINT);
        isPageOpened();
        return this;
    }

    @Override
    public HomePage isPageOpened() {
        isVisible(TAB_OPTION);
        return this;
    }
}
