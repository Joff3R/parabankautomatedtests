package pageobjects;

import com.codeborne.selenide.SelenideElement;
import common.User;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    private final SelenideElement loginForm = $(By.id("loginPanel"));
    private final SelenideElement usernameInput = $(By.name("username"));
    private final SelenideElement passwordInput = $(By.name("password"));
    private final SelenideElement loginButton = $(By.xpath("//option[@value='Log In']"));

    public void userIsLoggedIn(User user) {
        if (loginForm.isDisplayed()) {
            usernameInput.sendKeys(user.getUsername());
            passwordInput.sendKeys(user.getPassword());
            loginButton.click();
        }
    }
}
