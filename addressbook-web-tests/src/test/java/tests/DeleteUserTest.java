package tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class DeleteUserTest {
    private static WebDriver driver;


    @BeforeEach
    public void setUp() {
        if (driver == null) {
            driver = new ChromeDriver();
            Runtime.getRuntime().addShutdownHook(new Thread(driver::quit));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
            driver.get("http://localhost/addressbook/");
            driver.findElement(By.name("user")).sendKeys("admin");
            driver.findElement(By.name("pass")).sendKeys("secret");
            driver.findElement(By.xpath("//input[@value='Login']")).click();
        }
    }

    @Test
    public void deleteUser() {

        driver.findElement(By.xpath("//td/input")).click();
        driver.findElement(By.xpath("//input[@value=\'Delete\']")).click();
        assertThat(driver.switchTo().alert().getText(), is("Delete 1 addresses?"));
        driver.switchTo().alert().accept();
        driver.findElement(By.linkText("home")).click();
    }
}
