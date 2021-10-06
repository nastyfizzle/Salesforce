package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactDetailsPage extends BasePage{

    public static final By DETAILS_TAB = By.xpath("//div[contains(@class,'active')]//*[@id='detailTab__item']");
    public String contactDetails = "//div[contains(@class,'active')]//span[text()='Name']/ancestor::force-record-layout-item//lightning-formatted-text";

    public ContactDetailsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public ContactDetailsPage open() {
        isPageOpened();
        return this;
    }

    @Override
    public ContactDetailsPage isPageOpened() {
        isVisible(DETAILS_TAB);
        return this;
    }

    public String getContactDetails() {
        return driver.findElement(By.xpath(contactDetails)).getText();
    }

    public ContactDetailsPage openDetailsTab() {
        isVisible(DETAILS_TAB);
        driver.findElement(DETAILS_TAB).click();
        return this;
    }


}
