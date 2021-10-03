package tests;

import models.ContactFactory;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContactsTest extends BaseTest{

    @Test
    public void createContact() { //todo есть проблемы с локаторами, пока сдаю так и в будущем поправлю
        loginPage
                .open()
                .login("nastasv691-nbgr@force.com", "Nastya123!");
        contactsPage
                .open()
                .openModalScreen();
        newContactModalPage
                .open()
                .fillInForm(ContactFactory.get())
                .clickSave();
        assertEquals(contactDetailsPage.getContactDetails(), "Mr. Liam Boil", "Account details are wrong");
    }
}
