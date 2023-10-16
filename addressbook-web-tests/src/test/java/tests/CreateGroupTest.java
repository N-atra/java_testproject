package tests;

import org.junit.jupiter.api.Test;

public class CreateGroupTest extends TestBase {

    @Test
    public void CanCreateGroup() {
        app.groups().createGroup("group", "header", "footer");
    }

    @Test
    public void CanCreateGroupWithEmptyName() {
        app.groups().createGroup("", "", "");
    }
}