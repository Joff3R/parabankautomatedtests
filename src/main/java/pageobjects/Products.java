package pageobjects;

import com.codeborne.selenide.SelenideElement;

import java.util.Arrays;
import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Products {

    private static final String ADD_TO_CART = "#add-to-cart-";
    private static final String REMOVE = "#remove-";
    private static final String SAUCE_LABS = "sauce-labs-";

    private static final SelenideElement BACKPACK_ADD_BUTTON = $(ADD_TO_CART + SAUCE_LABS + "backpack");
    private static final SelenideElement BIKE_LIGHT_ADD_BUTTON = $(ADD_TO_CART + SAUCE_LABS + "bike-light");
    private static final SelenideElement BOLT_TSHIRT_ADD_BUTTON = $(ADD_TO_CART + SAUCE_LABS + "bolt-t-shirt");
    private static final SelenideElement FLEECE_JACKET_ADD_BUTTON = $(ADD_TO_CART + SAUCE_LABS + "fleece-jacket");
    private static final SelenideElement ONESIE_ADD_BUTTON = $(ADD_TO_CART + SAUCE_LABS + "labs-onesie");
    private static final SelenideElement TEST_TSHIRT_ADD_BUTTON = $(ADD_TO_CART + SAUCE_LABS + "test\\.allthethings\\(\\)-t-shirt-\\(red\\)");
    private static final List<SelenideElement> ADD_BUTTON_LIST = Arrays.asList(
            BACKPACK_ADD_BUTTON,
            BIKE_LIGHT_ADD_BUTTON,
            BOLT_TSHIRT_ADD_BUTTON,
            FLEECE_JACKET_ADD_BUTTON,
            ONESIE_ADD_BUTTON,
            TEST_TSHIRT_ADD_BUTTON);

    private static final SelenideElement BACKPACK_REMOVE_BUTTON = $(REMOVE + SAUCE_LABS + "backpack");
    private static final SelenideElement BIKE_LIGHT_REMOVE_BUTTON = $(REMOVE + SAUCE_LABS + "bike-light");
    private static final SelenideElement BOLT_TSHIRT_REMOVE_BUTTON = $(REMOVE + SAUCE_LABS + "bolt-t-shirt");
    private static final SelenideElement FLEECE_JACKET_REMOVE_BUTTON = $(REMOVE + SAUCE_LABS + "fleece-jacket");
    private static final SelenideElement ONESIE_REMOVE_BUTTON = $(REMOVE + SAUCE_LABS + "labs-onesie");
    private static final SelenideElement TEST_TSHIRT_REMOVE_BUTTON = $(REMOVE + "test\\.allthethings\\(\\)-t-shirt-\\(red\\)");
    private static final List<SelenideElement> REMOVE_BUTTON_LIST = Arrays.asList(
            BACKPACK_REMOVE_BUTTON,
            BIKE_LIGHT_REMOVE_BUTTON,
            BOLT_TSHIRT_REMOVE_BUTTON,
            FLEECE_JACKET_REMOVE_BUTTON,
            ONESIE_REMOVE_BUTTON,
            TEST_TSHIRT_REMOVE_BUTTON);

    private static final SelenideElement SHOPPING_CART_BADGE = $(".shopping_cart_badge");

    public void addProductToCart(SelenideElement product) {
        product.click();
    }

    public void removeProductFromCart(SelenideElement product) {
        product.click();
    }

    public void addAllProductsToCart() {
        ADD_BUTTON_LIST.forEach(this::addProductToCart);
    }

    public void removeAllProductsFromCart() {
        REMOVE_BUTTON_LIST.forEach(this::removeProductFromCart);
    }

    public void shoppingCartIsEmpty() {
        emptyShoppingCart();
    }

    private void emptyShoppingCart() {
        if (BACKPACK_REMOVE_BUTTON.exists()) removeProductFromCart(BACKPACK_REMOVE_BUTTON);
        if (BIKE_LIGHT_REMOVE_BUTTON.exists()) removeProductFromCart(BIKE_LIGHT_REMOVE_BUTTON);
        if (BOLT_TSHIRT_REMOVE_BUTTON.exists()) removeProductFromCart(BOLT_TSHIRT_REMOVE_BUTTON);
        if (FLEECE_JACKET_REMOVE_BUTTON.exists()) removeProductFromCart(FLEECE_JACKET_REMOVE_BUTTON);
        if (ONESIE_REMOVE_BUTTON.exists()) removeProductFromCart(ONESIE_REMOVE_BUTTON);
        if (TEST_TSHIRT_REMOVE_BUTTON.exists()) removeProductFromCart(TEST_TSHIRT_REMOVE_BUTTON);
    }

    public void shoppingCartBadgeDoesNotDisplayNumber(){
        assertThat(SHOPPING_CART_BADGE).toString().isEmpty();
    }


}
