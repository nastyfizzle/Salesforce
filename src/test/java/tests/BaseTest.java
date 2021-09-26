package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.AccountDetailsPage;
import pages.AccountsPage;
import pages.LoginPage;
import pages.NewAccountModalPage;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    private WebDriver driver;

    LoginPage loginPage;
    AccountsPage accountsPage;
    NewAccountModalPage newAccountModalPage;
    AccountDetailsPage accountDetailsPage;

    @BeforeMethod(alwaysRun = true)
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        loginPage = new LoginPage(driver);
        accountsPage = new AccountsPage(driver);
        newAccountModalPage = new NewAccountModalPage(driver);
        accountDetailsPage = new AccountDetailsPage(driver);
    }

    @AfterMethod(alwaysRun = true)
    public void closeDriver() {
        driver.quit();
    }
}
