package models;

import com.github.javafaker.Faker;

public class ContactFactory {

    static Faker faker;

    public static Contact get() {
        faker = new Faker();
        return new Contact("Mr.", faker.name().firstName(), faker.name().lastName(), "Cats", "Any test title", "+375172568456",
                "+37529645301", "test@gmail.com", "Liam Boil", "Adam", "London", "0245", "-",
                "UK", "Lesly", "Munich", "7503", "-", "German", "4568715", "2358465",
                "41284566666", "3257456660", "Paul", "dev", "no", "210599", "any test description");
    }
}
