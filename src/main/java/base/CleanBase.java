package base;

import org.testng.annotations.BeforeMethod;

import static helper.UserHelper.STANDARD_USER;

public class CleanBase extends Base {

    @Override
    @BeforeMethod
    public void loginToApplication() {
        openAppAsLoggedInUser(STANDARD_USER);
    }
}
