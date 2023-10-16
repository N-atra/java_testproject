package tests;

import org.junit.jupiter.api.Test;

public class DeleteGroupTest extends TestBase {

    @Test
    public void CanDeleteGroup() {
        if (!app.groups().isGroupPresent()) {
            app.groups().createGroup("name", "header","footer");
        }
        app.groups().removeGroup();
    }

}

