package models;

import com.github.javafaker.Faker;

public class AccountFactory {

    static Faker faker;

    public static Account get() {
        faker = new Faker();
        return new Account(faker.name().fullName(), faker.phoneNumber().cellPhone(), "02586", faker.internet().url(), "Analyst", "Finance",
                "50", "0", "any description filled in here", "Adam street",
                "London", "-", "2571", "UK", "Adam street", "London",
                "-", "2571", "UK");
    }
}
