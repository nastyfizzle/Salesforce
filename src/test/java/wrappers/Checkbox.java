package wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Checkbox {

    WebDriver driver;
    String label;
    String checkboxLocator = "//span[contains(text(), '%s')]//ancestor::*[contains(@class, 'uiInput')]//descendant::*[contains(@type, 'checkbox')]";

    public Checkbox(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void selectCheckbox() {
        driver.findElement(By.xpath(String.format(checkboxLocator, label))).click();
    }

    public void deselectCheckbox() {
        driver.findElement(By.xpath(String.format(checkboxLocator, label))).click();
    }
}
