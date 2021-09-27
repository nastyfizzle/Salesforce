package pages;

import org.openqa.selenium.WebDriver;

public class ContactsPage extends BasePage{
    public ContactsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public ContactsPage open() {
        driver.get(BASE_URL + "lightning/o/Contact/home");
        return this;
    }
}
