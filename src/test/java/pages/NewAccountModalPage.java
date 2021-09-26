package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import wrappers.Checkbox;
import wrappers.Dropdown;
import wrappers.Input;
import wrappers.TextArea;

public class NewAccountModalPage extends BasePage {

    public static final By MODAL_SCREEN = By.cssSelector(".modal-body");
    public static final By SAVE_BUTTON = By.xpath("//*[contains(@class,'button-container-inner')]/descendant::span[text() ='Save']");
    public static final By CANCEL_BUTTON = By.cssSelector("[title='Cancel']");
    public static final By CROSS_BUTTON = By.xpath("//button[@title='Close this window']");
    public static final By SAVE_AND_NEW_BUTTON = By.cssSelector("[title='Save & New']");
    public static final By EMPTY_REQUIRED_FIELD = By.xpath("//li[contains(text(),'These required fields must be completed')]");

    public NewAccountModalPage(WebDriver driver) {
        super(driver);
    }

    public boolean isModalScreenOpened() {
        isVisible(MODAL_SCREEN);
        return true;
    }

    public void createNewAccount(String accountName, String phone, String fax, String webSite, String option, String option1,
                                 String employees, String annualRevenue, String description, String billingStreet, String billingCity,
                                 String billingStateProvince, String billingZipPostalCode, String billingCountry, String shippingStreet,
                                 String shippingCity, String shippingStateProvince, String shippingZipPostalCode, String shippingCountry) {
        new Input(driver, "Account Name").write(accountName);
        new Input(driver, "Phone").write(phone);
        new Input(driver, "Fax").write(fax);
        new Input(driver, "Website").write(webSite);
        new Dropdown(driver, "Type").selectOption(option);
        new Dropdown(driver, "Industry").selectOption(option1);
        new Input(driver, "Employees").write(employees);
        new Input(driver, "Annual Revenue").write(annualRevenue);
        new TextArea(driver, "Description").write(description);
        new TextArea(driver, "Billing Street").write(billingStreet);
        new Input(driver, "Billing City").write(billingCity);
        new Input(driver, "Billing State/Province").write(billingStateProvince);
        new Input(driver, "Billing Zip/Postal Code").write(billingZipPostalCode);
        new Input(driver, "Billing Country").write(billingCountry);
        new TextArea(driver, "Shipping Street").write(shippingStreet);
        new Input(driver, "Shipping City").write(shippingCity);
        new Input(driver, "Shipping State/Province").write(shippingStateProvince);
        new Input(driver, "Shipping Zip/Postal Code").write(shippingZipPostalCode);
        new Input(driver, "Shipping Country").write(shippingCountry);
    }

    public void copyBillingAddressToShippingAddress() {
        new Checkbox(driver, "Copy Billing Address to Shipping Address").selectCheckbox();
    }

    public void saveNewAccount() {
        driver.findElement(SAVE_BUTTON).click();
    }
}
