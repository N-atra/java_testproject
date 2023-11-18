package tests;

import model.UserData;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class DeleteUserTest extends TestBase {

    @Test
    public void deleteUser() {
        app.users().openUserPage();
        if (!app.users().isUserPresent()) {
            app.users().createUser(new UserData("name",
                    "middle",
                    "last",
                    "nick",
                    "title",
                    "company",
                    "address",
                    "12345",
                    "987654321",
                    "565656",
                    "",
                    "email@test.com",
                    "rmail2@test.com",
                    "email3@test.com",
                    "home",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "adress home",
                    "12",
                    "notes"));
        }
        app.users().removeUser();
    }
}