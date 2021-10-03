package pages;

import models.Contact;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import wrappers.Dropdown;
import wrappers.Input;
import wrappers.SearchInput;
import wrappers.TextArea;

public class NewContactModalPage extends BasePage {

    public static final By CONTACT_TITLE = By.xpath("//*[contains(text(),'Contact Information')]");
    public static final By SAVE_BUTTON = By.cssSelector("[title='Save']");
    public static final By CANCEL_BUTTON = By.cssSelector("[title='Cancel']");
    public static final By CROSS_BUTTON = By.xpath("//button[@title='Close this window']");
    public static final By SAVE_AND_NEW_BUTTON = By.cssSelector("[title='Save & New']");

    public NewContactModalPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public NewContactModalPage open() {
        isPageOpened();
        return this;
    }

    @Override
    public NewContactModalPage isPageOpened() {
        isVisible(CONTACT_TITLE);
        return this;
    }

    public NewContactModalPage fillInForm(Contact contact) {
        new Dropdown(driver, "Salutation").selectOption(contact.getSalutation());
        new Input(driver, "First Name").write(contact.getFirstName());
        new Input(driver, "Last Name").write(contact.getLastName());
        new SearchInput(driver, "Account Name").selectOption(contact.getAccountName());
        new Input(driver, "Title").write(contact.getTitle());
        new Input(driver, "Phone").write(contact.getPhone());
        new Input(driver, "Mobile").write(contact.getMobile());
        new Input(driver, "Email").write(contact.getEmail());
        new SearchInput(driver, "Reports To").selectOption(contact.getReportsTo());
        new TextArea(driver, "Mailing Street").write(contact.getMailingStreet());
        new Input(driver, "Mailing City").write(contact.getMailingCity());
        new Input(driver, "Mailing Zip/Postal Code").write(contact.getMailingZipPostalCode());
        new Input(driver, "Mailing State/Province").write(contact.getMailingStateProvince());
        new Input(driver, "Mailing Country").write(contact.getMailingCountry());
        new TextArea(driver, "Other Street").write(contact.getOtherStreet());
        new Input(driver, "Other City").write(contact.getOtherCity());
        new Input(driver, "Other Zip/Postal Code").write(contact.getOtherZipPostalCode());
        new Input(driver, "Other State/Province").write(contact.getOtherStateProvince());
        new Input(driver, "Other Country").write(contact.getOtherCountry());
        new Input(driver, "Fax").write(contact.getFax());
        new Input(driver, "Home Phone").write(contact.getHomePhone());
        new Input(driver, "Other Phone").write(contact.getOtherPhone());
        new Input(driver, "Asst. Phone").write(contact.getAsstPhone());
        new Input(driver, "Assistant").write(contact.getAssistant());
        new Input(driver, "Department").write(contact.getDepartment());
        new Dropdown(driver, "Lead Source").selectOption(contact.getLeadSource());
        new Dropdown(driver, "Birthdate").selectOption(contact.getBirthDate());
        new TextArea(driver, "Description").write(contact.getDescription());
        return this;
    }

    public ContactDetailsPage clickSave() {
        driver.findElement(SAVE_BUTTON).click();
        return new ContactDetailsPage(driver);
    }

    public ContactsPage clickCancel() {
        isVisible(CANCEL_BUTTON);
        driver.findElement(CANCEL_BUTTON).click();
        return new ContactsPage(driver);
    }

    public NewContactModalPage clickSaveAndNew() {
        isVisible(SAVE_AND_NEW_BUTTON);
        driver.findElement(SAVE_AND_NEW_BUTTON).click();
        return this;
    }

    public ContactsPage clickCrossIcon() {
        isVisible(CROSS_BUTTON);
        driver.findElement(CROSS_BUTTON).click();
        return new ContactsPage(driver);
    }
}
