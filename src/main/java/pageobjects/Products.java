package pageobjects;

import com.codeborne.selenide.SelenideElement;

import java.util.Arrays;
import java.util.List;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class Products {

    private static final String ADD_TO_CART = "#add-to-cart-";
    private static final String REMOVE = "#remove-";
    private static final String SAUCE_LABS = "sauce-labs-";

    private final SelenideElement backpackAddButton = $(ADD_TO_CART + SAUCE_LABS + "backpack");
    private final SelenideElement bikeLightAddButton = $(ADD_TO_CART + SAUCE_LABS + "bike-light");
    private final SelenideElement boltTshirtAddButton = $(ADD_TO_CART + SAUCE_LABS + "bolt-t-shirt");
    private final SelenideElement fleeceJacketAddButton = $(ADD_TO_CART + SAUCE_LABS + "fleece-jacket");
    private final SelenideElement onesieAddButton = $(ADD_TO_CART + SAUCE_LABS + "onesie");
    private final SelenideElement testTshirtAddButton = $(byXpath("//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']"));
    private final List<SelenideElement> addButtonList = Arrays.asList(
            backpackAddButton,
            bikeLightAddButton,
            boltTshirtAddButton,
            fleeceJacketAddButton,
            onesieAddButton,
            testTshirtAddButton);

    private final SelenideElement backpackRemoveButton = $(REMOVE + SAUCE_LABS + "backpack");
    private final SelenideElement bikeLightRemoveButton = $(REMOVE + SAUCE_LABS + "bike-light");
    private final SelenideElement boltTshirtRemoveButton = $(REMOVE + SAUCE_LABS + "bolt-t-shirt");
    private final SelenideElement fleeceJacketRemoveButton = $(REMOVE + SAUCE_LABS + "fleece-jacket");
    private final SelenideElement onesieRemoveButton = $(REMOVE + SAUCE_LABS + "onesie");
    private final SelenideElement testTshirtRemoveButton = $(REMOVE + "test\\.allthethings\\(\\)-t-shirt-\\(red\\)");
    private final List<SelenideElement> removeButtonList = Arrays.asList(
            backpackRemoveButton,
            bikeLightRemoveButton,
            boltTshirtRemoveButton,
            fleeceJacketRemoveButton,
            onesieRemoveButton,
            testTshirtRemoveButton);

    private final SelenideElement shoppingCartBadge = $(".shopping_cart_badge");

    public void addAllProductsToCart() {
        addButtonList.forEach(SelenideElement::click);
    }

    public void allAddButtonsShouldNotBeVisible() {
        addButtonList.forEach(e -> e.shouldNotBe(visible));
    }

    public void shoppingCartIsEmpty() {
        emptyShoppingCart();
    }

    private void emptyShoppingCart() {
        removeButtonList.stream()
                .filter(SelenideElement::exists)
                .forEach(SelenideElement::click);
    }


}
