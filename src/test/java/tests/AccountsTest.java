package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AccountsTest extends BaseTest {

    @Test
    public void createAccount() {
        loginPage.open();
        loginPage.isPageOpened();
        loginPage.login("nastasv691-nbgr@force.com", "Nastya123!");
        accountsPage.isNavigationBarOpened();

        accountsPage.open();
        accountsPage.isPageOpened();
        accountsPage.openModalScreen();

        newAccountModalPage.isModalScreenOpened();
        newAccountModalPage.createNewAccount("Cats", "+375295468526", "02586", "www.cats.com", "Analyst", "Finance",
                "50", "0", "any description filled in here", "Adam street",
                "London", "-", "2571", "UK", "Adam street", "London",
                "-", "2571", "UK");
        newAccountModalPage.saveNewAccount();

        assertEquals(accountDetailsPage.getAccountTitleText(), "Cats", "Title is wrong");
    }
}
