package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountDetailsPage extends BasePage {

    public String accountTitle = "//div[@class='entityNameTitle slds-line-height--reset' and contains(text(), 'Account')]";

    public AccountDetailsPage(WebDriver driver) {
        super(driver);
    }

    public String getAccountTitleText() {
        return driver.findElement(By.xpath(String.format(accountTitle))).getText();
    }
}
