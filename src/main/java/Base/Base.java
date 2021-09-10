package Base;

import common.User;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import pageobjects.LoginPage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;
import static helper.UrlHelper.BANK_URL;

@Listeners(TestNGListener.class)
public abstract class Base {

    @BeforeClass
    public void openApp() {
        open(BANK_URL);
    }

    public static void openAppAsLoggedInUser(User user) {
        page(LoginPage.class).userIsLoggedIn(user);
    }

    @BeforeMethod
    public abstract void loginToApplication();
}
