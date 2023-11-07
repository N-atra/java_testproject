package tests;

import model.UserData;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TestBase2 {
    protected static WebDriver driver;

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

    protected void createUser(final UserData user) {
        driver.findElement(By.linkText("add new")).click();
        driver.findElement(By.name("firstname")).sendKeys(user.getFirstname());
        driver.findElement(By.name("middlename")).sendKeys(user.getMiddlename());
        driver.findElement(By.name("lastname")).sendKeys(user.getLastname());
        driver.findElement(By.name("nickname")).sendKeys(user.getNickname());
        driver.findElement(By.name("title")).sendKeys(user.getTitle());
        driver.findElement(By.name("company")).sendKeys(user.getCompany());
        driver.findElement(By.name("address")).sendKeys(user.getAddress());
        driver.findElement(By.name("home")).sendKeys(user.getHome());
        driver.findElement(By.name("mobile")).sendKeys(user.getMobile());
        driver.findElement(By.name("work")).sendKeys(user.getWork());
        driver.findElement(By.name("fax")).sendKeys(user.getFax());
        driver.findElement(By.name("email")).sendKeys(user.getEmail());
        driver.findElement(By.name("email2")).sendKeys(user.getEmail2());
        driver.findElement(By.name("email3")).sendKeys(user.getEmail3());
        driver.findElement(By.name("homepage")).sendKeys(user.getHome());
        {
            WebElement dropdown = driver.findElement(By.name("bday"));
            dropdown.findElement(By.xpath("//option[. = '"+user.getBday()+"']")).click();
        }
        {
            WebElement dropdown = driver.findElement(By.name("bmonth"));
            dropdown.findElement(By.xpath("//option[. = '"+user.getBmonth()+"']")).click();
        }
        driver.findElement(By.name("byear")).sendKeys(user.getByear());
        {
            WebElement dropdown = driver.findElement(By.name("aday"));
            dropdown.findElement(By.xpath("//option[. = '"+user.getAday()+"']")).click();
        }
        driver.findElement(By.name("amonth")).click();
        {
            WebElement dropdown = driver.findElement(By.name("amonth"));
            dropdown.findElement(By.xpath("//option[. = '"+user.getAmonth()+"']")).click();
        }
        driver.findElement(By.name("ayear")).sendKeys(user.getAyear());
        driver.findElement(By.name("address2")).sendKeys(user.getAddress2());
        driver.findElement(By.name("phone2")).sendKeys(user.getPhone2());
        driver.findElement(By.name("notes")).sendKeys(user.getNotes());
        driver.findElement(By.xpath("(//input[@name='submit'])[2]")).click();
        driver.findElement(By.linkText("home page")).click();
    }

    protected void removeUser() {
        driver.findElement(By.xpath("//td/input")).click();
        driver.findElement(By.xpath("//input[@value=\'Delete\']")).click();
        assertThat(driver.switchTo().alert().getText(), is("Delete 1 addresses?"));
        driver.switchTo().alert().accept();
        driver.findElement(By.linkText("home")).click();
    }

    protected boolean isElementPresent(final By locator) {
        try {
            driver.findElement(locator);
            return true;
        } catch (NoSuchElementException exception) {
            return false;
        }
    }
}
