package helper;

import common.User;

public class UserHelper {

    private static final String PASSWORD = "secret_sauce";

    public static final User STANDARD_USER = User.builder()
            .username("standard_user")
            .password(PASSWORD)
            .build();

    public static final User LOCKED_OUT_USER = User.builder()
            .username("locked_out_user")
            .password(PASSWORD)
            .build();

    public static final User PROBLEM_USER = User.builder()
            .username("problem_user")
            .password(PASSWORD)
            .build();

    public static final User PERFORMANCE_GLITCH_USER = User.builder()
            .username("performance_glitch_user")
            .password(PASSWORD)
            .build();
}
