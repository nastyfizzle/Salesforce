package tests;

import models.Account;
import models.AccountFactory;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class AccountsTest extends BaseTest {

    @Test
    public void createAccount() {
        boolean isPageOpened = loginPage
                .open()
                .isPageOpened();
        assertTrue(isPageOpened, "Login page wasn't opened");

        isPageOpened = loginPage
                .login("nastasv691-nbgr@force.com", "Nastya123!")
                .isPageOpened();
        assertTrue(isPageOpened, "Home page wasn't opened");


        accountsPage.open();
        accountsPage.isPageOpened();
        accountsPage.openModalScreen();

        newAccountModalPage.isModalScreenOpened();
        Account account = AccountFactory.get();
        newAccountModalPage.createNewAccount(account);
//        newAccountModalPage.createNewAccount("Cats", "+375295468526", "02586", "www.cats.com", "Analyst", "Finance",
//                "50", "0", "any description filled in here", "Adam street",
//                "London", "-", "2571", "UK", "Adam street", "London",
//                "-", "2571", "UK");
        newAccountModalPage.saveNewAccount();

        assertEquals(accountDetailsPage.getAccountTitleText(), "Cats", "Title is wrong");
    }
}
