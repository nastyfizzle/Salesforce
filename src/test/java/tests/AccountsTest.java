package tests;

import models.Account;
import models.AccountFactory;
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
        Account account = AccountFactory.getAllFields();
        newAccountModalPage
                .open()
                .fillInForm(account)
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
        Account account = AccountFactory.getMandatoryFields();
        newAccountModalPage
                .open()
                .fillInFormWithMandatoryFields(account)
                .clickSave();
        assertEquals(accountDetailsPage.getAccountDetails(), "Ray Donovan", "Account details are wrong");
                //.validateAccount(AccountMandatoryFactory.get()); //todo а эта проверка сработала, подскажи как лучше пожалуйста :)
    }
}

