package wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextArea {

    WebDriver driver;
    String label;
    String textAreaLocator = "//span[contains(text(), '%s')]/ancestor::*[contains(@class, 'uiInput')]//textarea";

    public TextArea(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void write(String text) {
        driver.findElement(By.xpath(String.format(textAreaLocator, label))).sendKeys(text);
    }

    public void clear() {
        driver.findElement(By.xpath(String.format(textAreaLocator, label))).clear();
    }
}
