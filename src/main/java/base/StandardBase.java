package base;

import static helper.UserHelper.STANDARD_USER;

public class StandardBase extends Base {

    @Override
    public void loginToApplication() {
        openAppAsLoggedInUser(STANDARD_USER);
    }
}
