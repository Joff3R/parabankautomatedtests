package pageobjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class Products {

    private static final String ADD_TO_CART = "add-to-cart-";
    private static final String ADD_TO_CART_SAUCE_LABS = "sauce-labs-";
    private static final SelenideElement BACKPACK_ADD_TO_CART_BUTTON = $(ADD_TO_CART_SAUCE_LABS + "#backpack");
    private static final SelenideElement BIKE_LIGHT_ADD_TO_CART_BUTTON = $(ADD_TO_CART_SAUCE_LABS + "#bike-light");
    private static final SelenideElement BOLT_TSHIRT_ADD_TO_CART_BUTTON = $(ADD_TO_CART_SAUCE_LABS + "#bolt-t-shirt");
    private static final SelenideElement FLEECE_JACKET_ADD_TO_CART_BUTTON = $(ADD_TO_CART_SAUCE_LABS + "#fleece-jacket");
    private static final SelenideElement ONESIE_ADD_TO_CART_BUTTON = $(ADD_TO_CART_SAUCE_LABS + "#labs-onesie");
    private static final SelenideElement TEST_TSHIRT_ADD_TO_CART_BUTTON = $(ADD_TO_CART + "#submit-button");

    public void addItemToCart(SelenideElement selenideElement) {
        selenideElement.click();
    }


}
