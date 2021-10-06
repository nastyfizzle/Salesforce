package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountDetailsPage extends BasePage {

    public static final By DETAILS_TAB = By.xpath("//div[contains(@class,'active')]//*[@id='detailTab__item']");
    public String accountDetails = "//div[contains(@class,'active')]//span[text()='Account Name']/ancestor::force-record-layout-item//lightning-formatted-text";
    //todo локатор не совсем корректный, т.к. в нем указано название поля, но я совсем запуталась с передачей лейблов в качестве параметра, поэтому сдаю пока так
    // + хотела уточнить про способ через метод валидации, возможно так правильнее будет сделать проверку всех полей

    public AccountDetailsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public AccountDetailsPage open() {
        isPageOpened();
        return this;
    }

    @Override
    public AccountDetailsPage isPageOpened() {
        isVisible(DETAILS_TAB);
        return this;
    }

    public String getAccountDetails() {
        return driver.findElement(By.xpath(accountDetails)).getText();
    }

//    public void validateAccount(AccountMandatory accountMandatory) {
//        validateInput("Account Name", accountMandatory.getAccountName());
//    }

    public AccountDetailsPage openDetailsTab() {
        isVisible(DETAILS_TAB);
        driver.findElement(DETAILS_TAB).click();
        return this;
    }
}
