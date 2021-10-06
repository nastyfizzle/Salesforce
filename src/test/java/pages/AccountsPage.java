package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountsPage extends BasePage {

    public static final String ACCOUNTS_LIST_ENDPOINT = "lightning/o/Account/list?filterName=Recent";
    public static final String ACCOUNT_NAME = "//*[contains(@title,'%s')]";
    public static final By ACCOUNTS_IMAGE_LOCATOR = By.xpath("//img[@src='https://cat2.my.salesforce.com/img/icon/t4v35/standard/account_120.png']");
    public static final By NEW_ACCOUNT_BUTTON = By.xpath("//div[@title='New']");

    public AccountsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public AccountsPage open() {
        driver.get(BASE_URL + ACCOUNTS_LIST_ENDPOINT);
        isPageOpened();
        return this;
    }

    @Override
    public AccountsPage isPageOpened() {
        isVisible(ACCOUNTS_IMAGE_LOCATOR);
        return this;
    }

    public NewAccountModalPage openModalScreen() {
        isVisible(NEW_ACCOUNT_BUTTON);
        driver.findElement(NEW_ACCOUNT_BUTTON).click();
        return new NewAccountModalPage(driver);
    }

    public AccountDetailsPage openAccountDetails(String name) {
        isVisible(By.xpath(ACCOUNT_NAME));
        driver.findElement(By.xpath(String.format(ACCOUNT_NAME, name))).click();
        return new AccountDetailsPage(driver);
    }
}
