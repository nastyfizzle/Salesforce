package models;

import com.github.javafaker.Faker;

public class AccountFactory {

    static Faker faker;

    public static Account getAllFields() {
        faker = new Faker();
        return new Account("Lorne Malvo", faker.phoneNumber().cellPhone(), "02586", faker.internet().url(), "Analyst", "Finance",
                "50", "0", "any description filled in here", "Adam street",
                "London", "-", "2571", "UK", "Adam street", "London",
                "-", "2571", "UK");
    }

    public static Account getMandatoryFields() {
        faker = new Faker();
        return new Account("Ray Donovan");
    }

    public static Account getFieldsWithoutShipping() {
        faker = new Faker();
       return new Account("Liam Boil", faker.phoneNumber().cellPhone(), "02586", faker.internet().url(), "Analyst", "Finance",
                "50", "0", "any description filled in here", "Adam street",
                "London", "-", "2571", "UK");
    }
}

