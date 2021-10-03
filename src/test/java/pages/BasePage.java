package pages;

import models.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;

public abstract class BasePage {

    WebDriver driver;
    WebDriverWait wait;
    String BASE_URL = "https://cat2.lightning.force.com/";

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 20);
    }

    public abstract BasePage open();

    public abstract BasePage isPageOpened();

    public boolean isVisible(By locator) {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        } catch (TimeoutException exception) {
            Assert.fail("Element hasn't been found by locator:" + locator);
            return false;
        }
        return true;
    }

    public void openMenuOfNavigationBar(String nameOfMenuOption) {
        driver.findElement(By.xpath(nameOfMenuOption)).click();
    }

    public void validateInput(String label, String expected) {
        String locator = "//div[contains(@class,'active')]//span[text()='%s']/ancestor::force-record-layout-item//lightning-formatted-text";
        assertEquals(driver.findElement(By.xpath(String.format(locator, label))).getText(), expected,"Input text is not correct");
    }
}


//LOADABLE PAGE
//CHAIN OF INVOCATIONS
//VALUE OBJECT/FACTORY