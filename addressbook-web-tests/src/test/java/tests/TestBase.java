package tests;

import manager.ApplicationManager;
import manager.UserHelper;
import org.junit.jupiter.api.BeforeEach;

public class TestBase {
    public static ApplicationManager app;

    ApplicationManager Manager = new ApplicationManager();


    @BeforeEach
    public void setUp() {
        if (app == null) {
            app = new ApplicationManager();
            app.init(System.getProperty("browser", "firefox"));

        }
    }
}




