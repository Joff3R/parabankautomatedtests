package pageobjects;

import com.codeborne.selenide.SelenideElement;
import common.User;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    private final SelenideElement loginBox = $(".login-box");
    private final SelenideElement usernameInput = $("#user-name");
    private final SelenideElement passwordInput = $("#password");
    private final SelenideElement loginButton = $("#login-button");
    private final SelenideElement inventoryContainer = $("#inventory_container");

    public void userIsLoggedIn(User user) {
        if (loginBox.isDisplayed()) {
            usernameInput.sendKeys(user.getUsername());
            passwordInput.sendKeys(user.getPassword());
            loginButton.click();
            inventoryContainer.shouldBe(visible);
        }
    }
}
