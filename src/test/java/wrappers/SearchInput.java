package wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchInput {

    WebDriver driver;
    String label;
    String inputLocator = "//span[contains(text(), '%s')]/ancestor::*[contains(@class, 'uiInput')]//input";
    String optionLocator = "//*[contains(@class,'data-match')]";
    // public final static String inputLocatorWithSearch = "//*[contains(text(),'%s')]/parent::label/following-sibling::div/descendant::input";
    //    public final static String optionLocator = "//a[@role='option']/descendant::div[@title='%s']";



    public SearchInput(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void write(String text) {
        driver.findElement(By.xpath(String.format(inputLocator, label))).sendKeys();
    }
    public void selectOption(String option) {
        driver.findElement(By.xpath(String.format(inputLocator, label))).sendKeys(option);
        driver.findElement(By.xpath(String.format(optionLocator, option))).click();
       }

    public void clear() {
        driver.findElement(By.xpath(String.format(inputLocator, label))).clear();
    }
}
