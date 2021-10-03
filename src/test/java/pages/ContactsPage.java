package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactsPage extends BasePage {

    public static final String CONTACTS_LIST_ENDPOINT = "lightning/o/Contact/list?filterName=Recent";
    public static final By CONTACTS_IMAGE_LOCATOR = By.xpath("//img[@src='https://cat2.my.salesforce.com/img/icon/t4v35/standard/contact_120.png']");
    public static final By NEW_CONTACT_BUTTON = By.cssSelector("[title=New]");
    public static final String CONTACT_NAME = "//*[contains(@title,'%s')]";

    public ContactsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public ContactsPage open() {
        driver.get(BASE_URL + CONTACTS_LIST_ENDPOINT);
        isPageOpened();
        return this;
    }

    @Override
    public ContactsPage isPageOpened() {
        isVisible(CONTACTS_IMAGE_LOCATOR);
        return this;
    }

    public NewContactModalPage openModalScreen() {
        isVisible(NEW_CONTACT_BUTTON);
        driver.findElement(NEW_CONTACT_BUTTON).click();
        return new NewContactModalPage(driver);
    }

    public ContactDetailsPage openContactDetails(String name) {
        isVisible(By.xpath(CONTACT_NAME));
        driver.findElement(By.xpath(String.format(CONTACT_NAME, name))).click();
        return new ContactDetailsPage(driver);
    }
}
