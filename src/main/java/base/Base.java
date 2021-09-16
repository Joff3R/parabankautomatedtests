package base;

import common.User;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import pageobjects.LoginPage;

import static base.TestConfiguration.setBrowserConfiguration;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;
import static helper.UrlHelper.BASE_URL;

@Listeners(TestNGListener.class)
public abstract class Base {

    @BeforeSuite
    public void setUp(){
        setBrowserConfiguration();
    }

    public static void openAppAsLoggedInUser(User user) {
        page(LoginPage.class).userIsLoggedIn(user);
    }

    @BeforeMethod
    public void openApp() {
        open(BASE_URL);
    }

    @BeforeMethod
    public abstract void loginToApplication();
}
