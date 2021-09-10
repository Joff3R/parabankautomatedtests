package helper;

import common.User;


public class UserHelper {

    public static final User DEFAULT_USER = User.builder()
            .username("john")
            .password("demo")
            .build();
}
