package wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Checkbox {

    WebDriver driver;
    String label;
    String checkboxLocator = "[type='checkbox']";


    public Checkbox(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void selectCheckbox() {
        List<WebElement> checkBoxes = driver.findElements(By.cssSelector(checkboxLocator));
        checkBoxes.get(0).click();
    }

    public void deselectCheckbox() {
        List<WebElement> checkBoxes = driver.findElements(By.cssSelector(checkboxLocator));
        checkBoxes.get(0).click();
    }
}
