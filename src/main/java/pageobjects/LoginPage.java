package pageobjects;

import com.codeborne.selenide.SelenideElement;
import common.User;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    private final SelenideElement loginBox = $(".login-box");
    private final SelenideElement usernameInput = $("#user-name");
    private final SelenideElement passwordInput = $(By.name("password"));
    private final SelenideElement loginButton = $(".submit-button");

    public void userIsLoggedIn(User user) {
        if (loginBox.isDisplayed()) {
            usernameInput.sendKeys(user.getUsername());
            passwordInput.sendKeys(user.getPassword());
            loginButton.click();
        }
    }
}
