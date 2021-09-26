package wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Input {

    WebDriver driver;
    String label;
    String inputLocator = "//span[contains(text(), '%s')]/ancestor::*[contains(@class, 'uiInput')]//input";


    public Input(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void write(String text) {
        driver.findElement(By.xpath(String.format(inputLocator, label))).sendKeys(text);
    }

    public void clear() {
        driver.findElement(By.xpath(String.format(inputLocator, label))).clear();
    }
}
