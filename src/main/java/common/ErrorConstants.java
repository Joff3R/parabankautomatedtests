package common;

import lombok.NoArgsConstructor;

import static lombok.AccessLevel.PRIVATE;

@NoArgsConstructor(access = PRIVATE)
public class ErrorConstants {

    public static final String FIRST_NAME_IS_REQUIRED = "Error: First Name is required";
    public static final String LAST_NAME_IS_REQUIRED = "Error: Last Name is required";
    public static final String POSTAL_CODE_IS_REQUIRED = "Error: Postal Code is required";
}
