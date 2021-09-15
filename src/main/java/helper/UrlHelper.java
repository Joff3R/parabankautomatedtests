package helper;

import lombok.NoArgsConstructor;

import static lombok.AccessLevel.PRIVATE;

@NoArgsConstructor(access = PRIVATE)
public class UrlHelper {

    public static final String BASE_URL = "https://www.saucedemo.com/";
    public static final String INVENTORY = BASE_URL + "inventory.html";
    public static final String CART = BASE_URL + "cart.html";
    public static final String CHECKOUT_STEP_ONE = BASE_URL + "checkout-step-one.html";
}
