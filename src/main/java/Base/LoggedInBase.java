package Base;
import pageobjects.LoginPage;

import static helper.UserHelper.DEFAULT_USER;

public class LoggedInBase extends Base {

    private final LoginPage loginPage = new LoginPage();

    public void logIn(){
        loginPage.userIsLoggedIn(DEFAULT_USER);
    }
}
