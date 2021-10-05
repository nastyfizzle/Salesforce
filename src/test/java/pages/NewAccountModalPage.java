package pages;

import models.Account;
import models.AccountFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import wrappers.Checkbox;
import wrappers.Dropdown;
import wrappers.Input;
import wrappers.TextArea;

public class NewAccountModalPage extends BasePage {

    public static final By SAVE_BUTTON = By.cssSelector("[title='Save']");
    public static final By CANCEL_BUTTON = By.cssSelector("[title='Cancel']");
    public static final By CROSS_BUTTON = By.xpath("//button[@title='Close this window']");
    public static final By SAVE_AND_NEW_BUTTON = By.cssSelector("[title='Save & New']");
    public static final By EMPTY_REQUIRED_FIELD = By.xpath("//li[contains(text(),'These required fields must be completed')]");

    public NewAccountModalPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public NewAccountModalPage open() {
        isPageOpened();
        return this;
    }

    public NewAccountModalPage isPageOpened() {
        isVisible(SAVE_BUTTON);
        return this;
    }

    public NewAccountModalPage fillInForm(Account account) {
        new Input(driver, "Account Name").write(account.getAccountName());
        new Input(driver, "Phone").write(account.getPhone());
        new Input(driver, "Fax").write(account.getFax());
        new Input(driver, "Website").write(account.getWebSite());
        new Dropdown(driver, "Type").selectOption(account.getOption());
        new Dropdown(driver, "Industry").selectOption(account.getOption1());
        new Input(driver, "Employees").write(account.getEmployees());
        new Input(driver, "Annual Revenue").write(account.getAnnualRevenue());
        new TextArea(driver, "Description").write(account.getDescription());
        new TextArea(driver, "Billing Street").write(account.getBillingStreet());
        new Input(driver, "Billing City").write(account.getBillingCity());
        new Input(driver, "Billing State/Province").write(account.getBillingStateProvince());
        new Input(driver, "Billing Zip/Postal Code").write(account.getBillingZipPostalCode());
        new Input(driver, "Billing Country").write(account.getBillingCountry());
        new TextArea(driver, "Shipping Street").write(account.getShippingStreet());
        new Input(driver, "Shipping City").write(account.getShippingCity());
        new Input(driver, "Shipping State/Province").write(account.getShippingStateProvince());
        new Input(driver, "Shipping Zip/Postal Code").write(account.getShippingZipPostalCode());
        new Input(driver, "Shipping Country").write(account.getShippingCountry());
        return this;
    }

    public NewAccountModalPage fillInFormWithMandatoryFields(Account account) {
        new Input(driver, "Account Name").write(account.getAccountName());
        return this;
    }

    public NewAccountModalPage fillInFormWithoutShippingFields(Account account) {
        new Input(driver, "Account Name").write(account.getAccountName());
        new Input(driver, "Phone").write(account.getPhone());
        new Input(driver, "Fax").write(account.getFax());
        new Input(driver, "Website").write(account.getWebSite());
        new Dropdown(driver, "Type").selectOption(account.getOption());
        new Dropdown(driver, "Industry").selectOption(account.getOption1());
        new Input(driver, "Employees").write(account.getEmployees());
        new Input(driver, "Annual Revenue").write(account.getAnnualRevenue());
        new TextArea(driver, "Description").write(account.getDescription());
        new TextArea(driver, "Billing Street").write(account.getBillingStreet());
        new Input(driver, "Billing City").write(account.getBillingCity());
        new Input(driver, "Billing State/Province").write(account.getBillingStateProvince());
        new Input(driver, "Billing Zip/Postal Code").write(account.getBillingZipPostalCode());
        new Input(driver, "Billing Country").write(account.getBillingCountry());
        return this;
    }

    public void copyBillingAddressToShippingAddress() {
        new Checkbox(driver, "Copy Billing Address to Shipping Address").selectCheckbox();
    }

    public AccountDetailsPage clickSave() {
        isVisible(SAVE_BUTTON);
        driver.findElement(SAVE_BUTTON).click();
        return new AccountDetailsPage(driver);
    }

    public AccountsPage clickCancel() {
        isVisible(CANCEL_BUTTON);
        driver.findElement(CANCEL_BUTTON).click();
        return new AccountsPage(driver);
    }

    public NewAccountModalPage clickSaveAndNew() {
        isVisible(SAVE_AND_NEW_BUTTON);
        driver.findElement(SAVE_AND_NEW_BUTTON).click();
        return this;
    }

    public AccountsPage clickCrossIcon() {
        isVisible(CROSS_BUTTON);
        driver.findElement(CROSS_BUTTON).click();
        return new AccountsPage(driver);
    }
}