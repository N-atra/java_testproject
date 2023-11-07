package tests;

import model.UserData;
import org.junit.jupiter.api.Test;

public class CreateUserTest extends TestBase2 {

    @Test
    public void CanCreateUser() {

        createUser(new UserData("name",
                "middle",
                "last",
                "nick",
                "title",
                "company",
                "address",
                "12345",
                "987654321",
                "565656",
                "5656",
                "email@test.com",
                "rmail2@test.com",
                "email3@test.com",
                "home",
                "12",
                "February",
                "2000",
                "13",
                "January",
                "2010",
                "address home",
                "12",
                "notes"));
    }
}
