package wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dropdown {

    WebDriver driver;
    String label;
    String dropdownLocator = "//*[contains(text(), '%s')]/ancestor::*[contains(@class, 'uiInputSelect')]";
    String selectOptionLocator = "//*[contains(@class,'select-options')]/descendant::a[contains(text(),'%s')]";

    public Dropdown(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void selectOption(String option) {
        driver.findElement(By.xpath(String.format(dropdownLocator, label))).click();
        driver.findElement(By.xpath(String.format(selectOptionLocator, option))).click();
    }

    public void clearOption() {
        driver.findElement(By.xpath(String.format(dropdownLocator, label))).click();
        driver.findElement(By.xpath(String.format(selectOptionLocator, "--None--"))).click();
    }
}