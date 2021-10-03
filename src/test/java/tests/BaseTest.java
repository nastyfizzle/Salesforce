package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.*;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    private WebDriver driver;

    LoginPage loginPage;
    HomePage homePage;
    AccountsPage accountsPage;
    NewAccountModalPage newAccountModalPage;
    AccountDetailsPage accountDetailsPage;
    ContactsPage contactsPage;
    NewContactModalPage newContactModalPage;
    ContactDetailsPage contactDetailsPage;


    @BeforeMethod(alwaysRun = true)
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        accountsPage = new AccountsPage(driver);
        newAccountModalPage = new NewAccountModalPage(driver);
        accountDetailsPage = new AccountDetailsPage(driver);
        contactsPage = new ContactsPage(driver);
        newContactModalPage = new NewContactModalPage(driver);
        contactDetailsPage = new ContactDetailsPage(driver);
    }

    @AfterMethod(alwaysRun = true)
    public void closeDriver() {
        driver.quit();
    }
}
