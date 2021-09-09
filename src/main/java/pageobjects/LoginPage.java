package pageobjects;

import Base.WebDriverBase;
import common.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends WebDriverBase {

    private final WebElement loginForm = driver.findElement(By.id("loginPanel"));
    private final WebElement usernameInput = driver.findElement(By.name("username"));
    private final WebElement passwordInput = driver.findElement(By.name("password"));
    private final WebElement loginButton = driver.findElement(By.xpath("//option[@value='Log In']"));

    public void userIsLoggedIn(User user) {
        if (loginForm.isDisplayed()) {
            usernameInput.sendKeys(user.getUsername());
            usernameInput.sendKeys(user.getPassword());
            loginButton.click();
        }
    }
}
