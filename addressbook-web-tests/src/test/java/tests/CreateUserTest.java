package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class CreateUserTest {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void newmember() {
        driver.get("http://localhost/addressbook/");
        driver.findElement(By.name("user")).sendKeys("admin");
        driver.findElement(By.name("pass")).sendKeys("secret");
        driver.findElement(By.xpath("//input[@value='Login']")).click();

        driver.findElement(By.linkText("add new")).click();
        driver.findElement(By.name("firstname")).sendKeys("name");
        driver.findElement(By.name("middlename")).sendKeys("middle");
        driver.findElement(By.name("lastname")).sendKeys("last");
        driver.findElement(By.name("nickname")).sendKeys("nick");
        driver.findElement(By.name("title")).sendKeys("title");
        driver.findElement(By.name("company")).sendKeys("company");
        driver.findElement(By.name("address")).sendKeys("address");
        driver.findElement(By.name("home")).sendKeys("12345");
        driver.findElement(By.name("mobile")).sendKeys("987654321");
        driver.findElement(By.name("work")).sendKeys("565656");
        driver.findElement(By.name("fax")).sendKeys("5656");
        driver.findElement(By.name("email")).sendKeys("email@test.com");
        driver.findElement(By.name("email2")).sendKeys("rmail2@test.com");
        driver.findElement(By.name("email3")).sendKeys("email3@test.com");
        driver.findElement(By.name("homepage")).sendKeys("home");
        {
            WebElement dropdown = driver.findElement(By.name("bday"));
            dropdown.findElement(By.xpath("//option[. = '12']")).click();
        }
        {
            WebElement dropdown = driver.findElement(By.name("bmonth"));
            dropdown.findElement(By.xpath("//option[. = 'February']")).click();
        }
        driver.findElement(By.name("byear")).sendKeys("2000");
        {
            WebElement dropdown = driver.findElement(By.name("aday"));
            dropdown.findElement(By.xpath("//option[. = '13']")).click();
        }
        driver.findElement(By.name("amonth")).click();
        {
            WebElement dropdown = driver.findElement(By.name("amonth"));
            dropdown.findElement(By.xpath("//option[. = 'January']")).click();
        }
        driver.findElement(By.name("ayear")).sendKeys("2010");
        driver.findElement(By.name("address2")).sendKeys("adress home");
        driver.findElement(By.name("phone2")).sendKeys("12");
        driver.findElement(By.name("notes")).sendKeys("notes");
        driver.findElement(By.xpath("(//input[@name=\'submit\'])[2]")).click();
        driver.findElement(By.linkText("home page")).click();
    }
}
