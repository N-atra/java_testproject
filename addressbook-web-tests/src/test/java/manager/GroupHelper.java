package manager;
import org.openqa.selenium.By;

public class GroupHelper {
    private final ApplicationManager manager;

    public GroupHelper(ApplicationManager manager) {
        this.manager = manager;
    }

    public void openGroupPage() {
        if (!manager.isElementPresent(By.name("new"))) {
            manager.driver.findElement(By.linkText("groups")).click();
        }
    }

    public boolean isGroupPresent() {
        openGroupPage();
        return manager.isElementPresent(By.name("selected[]"));
    }

    public void createGroup(final String group, final String header, final String footer) {
        openGroupPage();
        manager.driver.findElement(By.name("new")).click();
        manager.driver.findElement(By.name("group_name")).click();
        manager.driver.findElement(By.name("group_name")).sendKeys(group);
        manager.driver.findElement(By.name("group_header")).click();
        manager.driver.findElement(By.name("group_header")).sendKeys(header);
        manager.driver.findElement(By.name("group_footer")).click();
        manager.driver.findElement(By.name("group_footer")).sendKeys(footer);
        manager.driver.findElement(By.name("submit")).click();
        manager.driver.findElement(By.linkText("group page")).click();
    }

    public void removeGroup() {
        openGroupPage();
        manager.driver.findElement(By.name("selected[]")).click();
        manager.driver.findElement(By.name("delete")).click();
        manager.driver.findElement(By.linkText("group page")).click();
    }
}
