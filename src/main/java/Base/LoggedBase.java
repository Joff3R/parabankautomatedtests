package Base;

import static helper.UserHelper.DEFAULT_USER;

public class LoggedBase extends Base {

    @Override
    public void loginToApplication() {
        openAppAsLoggedInUser(DEFAULT_USER);
    }
}
