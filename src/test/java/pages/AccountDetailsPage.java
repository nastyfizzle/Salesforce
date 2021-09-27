package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountDetailsPage extends BasePage {

    public String accountTitle = "//div[@class='entityNameTitle slds-line-height--reset' and contains(text(), 'Account')]";

    public AccountDetailsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public AccountDetailsPage open() {
        driver.get(BASE_URL + "lightning/r/Account/0015g00000SIF3mAAH/view"); //change since end of url is different for each page
        return this;
    }

    public String getAccountTitleText() {
        return driver.findElement(By.xpath(String.format(accountTitle))).getText();
    }
}
