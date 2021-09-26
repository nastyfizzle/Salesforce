package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountsPage extends BasePage {

    public String ACCOUNTS_URL = "https://cat2.lightning.force.com/lightning/o/Account/list?filterName=Recent";
    public static final By ACCOUNTS_MENU_OPTION = By.xpath("//*[contains(text(), 'Accounts')]/ancestor::*[contains(@class, 'slds-context-bar__label-action dndItem')]");
    private static final By NAVIGATION_BAR = By.xpath("//*[contains(@class, 'oneAppNavContainer')]");
    public static final By TABLE = By.xpath("//*[contains(@class, 'splitview-content')]");
    public static final By NEW_ACCOUNT = By.cssSelector("[title=New]");
    public String nameOfAccountInTheTable = "//a[contains(text(),'Dogs')]/ancestor::span[contains(@class,'slds-grid')]";


    public AccountsPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        //driver.findElement(ACCOUNTS_MENU_OPTION).click();
        driver.get(ACCOUNTS_URL);
    }

    public boolean isNavigationBarOpened() {
        isVisible(NAVIGATION_BAR);
        return true;
    }

    public boolean isPageOpened() {
        isVisible(TABLE);
        return true;
    }

    public void openModalScreen() {
        driver.findElement(NEW_ACCOUNT).click();
    }
}
