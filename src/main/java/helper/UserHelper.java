package helper;

import common.User;
import lombok.Getter;

@Getter
public class UserHelper {

    public static final User DEFAULT_USER = User.builder()
            .username("john")
            .password("demo")
            .build();
}
