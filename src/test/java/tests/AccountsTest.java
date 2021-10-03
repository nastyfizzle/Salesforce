package tests;

import models.AccountFactory;
import models.AccountMandatoryFactory;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AccountsTest extends BaseTest {

    @Test
    public void createAccount() {
        loginPage
                .open()
                .login("nastasv691-nbgr@force.com", "Nastya123!");
        accountsPage
                .open()
                .openModalScreen();
        newAccountModalPage
                .open()
                .fillInForm(AccountFactory.get())
                .clickSave();
        assertEquals(accountDetailsPage.getAccountDetails(), "Lorne Malvo", "Account details are wrong");
    }

    @Test
    public void createAccountWithMandatoryFieldsOnly() {
        loginPage
                .open()
                .login("nastasv691-nbgr@force.com", "Nastya123!");
        accountsPage
                .open()
                .openModalScreen();
        newAccountModalPage
                .open()
                .fillInForm(AccountMandatoryFactory.get())
                .clickSave()
                .validateAccount(AccountMandatoryFactory.get()); //todo а эта проверка сработала, подскажи как лучше пожалуйста :)
    }
}

