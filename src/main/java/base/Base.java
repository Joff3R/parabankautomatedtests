package base;

import common.User;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import pageobjects.LoginPage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;
import static helper.UrlHelper.E_COMMERCE_URL;

@Listeners(TestNGListener.class)
public abstract class Base {

    public static void openAppAsLoggedInUser(User user) {
        page(LoginPage.class).userIsLoggedIn(user);
    }

    @BeforeClass
    public void openApp() {
        open(E_COMMERCE_URL);
    }

    @BeforeMethod
    public abstract void loginToApplication();
}
