package manager;
import model.UserData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class UserHelper {
    private final ApplicationManager manager;

    public UserHelper(ApplicationManager manager) {
        this.manager = manager;
    }

    public void openUserPage() {
        if (!manager.isElementPresent(By.cssSelector("input[value=\"Send e-Mail\"]"))) {
            manager.driver.findElement(By.linkText("add new")).click();
        }
    }

    public boolean isUserPresent() {
        return manager.isElementPresent(By.xpath("//td/input"));
    }


        public void createUser(final UserData user) {
            openUserPage();
            manager.driver.findElement(By.name("firstname")).sendKeys(user.getFirstname());
            manager.driver.findElement(By.name("middlename")).sendKeys(user.getMiddlename());
            manager.driver.findElement(By.name("lastname")).sendKeys(user.getLastname());
            manager.driver.findElement(By.name("nickname")).sendKeys(user.getNickname());
            manager.driver.findElement(By.name("title")).sendKeys(user.getTitle());
            manager.driver.findElement(By.name("company")).sendKeys(user.getCompany());
            manager.driver.findElement(By.name("address")).sendKeys(user.getAddress());
            manager.driver.findElement(By.name("home")).sendKeys(user.getHome());
            manager.driver.findElement(By.name("mobile")).sendKeys(user.getMobile());
            manager.driver.findElement(By.name("work")).sendKeys(user.getWork());
            manager.driver.findElement(By.name("fax")).sendKeys(user.getFax());
            manager.driver.findElement(By.name("email")).sendKeys(user.getEmail());
            manager.driver.findElement(By.name("email2")).sendKeys(user.getEmail2());
            manager.driver.findElement(By.name("email3")).sendKeys(user.getEmail3());
            manager.driver.findElement(By.name("homepage")).sendKeys(user.getHome());
            {
                WebElement dropdown = manager.driver.findElement(By.name("bday"));
                dropdown.findElement(By.xpath("//option[. = '"+user.getBday()+"']")).click();
            }
            {
                WebElement dropdown = manager.driver.findElement(By.name("bmonth"));
                dropdown.findElement(By.xpath("//option[. = '"+user.getBmonth()+"']")).click();
            }
            manager.driver.findElement(By.name("byear")).sendKeys(user.getByear());
            {
                WebElement dropdown = manager.driver.findElement(By.name("aday"));
                dropdown.findElement(By.xpath("//option[. = '"+user.getAday()+"']")).click();
            }
            manager.driver.findElement(By.name("amonth")).click();
            {
                WebElement dropdown = manager.driver.findElement(By.name("amonth"));
                dropdown.findElement(By.xpath("//option[. = '"+user.getAmonth()+"']")).click();
            }
            manager.driver.findElement(By.name("ayear")).sendKeys(user.getAyear());
            manager.driver.findElement(By.name("address2")).sendKeys(user.getAddress2());
            manager.driver.findElement(By.name("phone2")).sendKeys(user.getPhone2());
            manager.driver.findElement(By.name("notes")).sendKeys(user.getNotes());
            manager.driver.findElement(By.xpath("(//input[@name='submit'])[2]")).click();
            manager.driver.findElement(By.linkText("home page")).click();
        }

    public void removeUser() {
        manager.driver.findElement(By.xpath("//td/input")).click();
        manager.driver.findElement(By.xpath("//input[@value=\'Delete\']")).click();
        assertThat(manager.driver.switchTo().alert().getText(), is("Delete 1 addresses?"));
        manager.driver.switchTo().alert().accept();
        manager.driver.findElement(By.linkText("home")).click();
    }
}
