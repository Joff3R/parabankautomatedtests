package base;

import common.User;
import org.testng.annotations.BeforeMethod;

import static helper.UserHelper.STANDARD_USER;

public class StandardBase extends Base {

    private static final User USER = STANDARD_USER;

    @Override
    @BeforeMethod
    public void loginToApplication() {
        openAppAsLoggedInUser(USER);
    }
}
