package pageobjects;

import com.codeborne.selenide.SelenideElement;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.WebDriverRunner.url;
import static helper.UrlHelper.CHECKOUT_STEP_ONE;
import static helper.UrlHelper.INVENTORY;
import static org.assertj.core.api.Assertions.assertThat;

public class Cart {

    private final SelenideElement checkout = $("#checkout");
    private final SelenideElement continueShopping = $("#continue-shopping");

    private final List<SelenideElement> removeFromCart = $$(".btn_secondary");
    private final List<SelenideElement> cartQuantity = $$(".cart_quantity");

    public void inventoryPageIsOpened() {
        clickContinueShoppingButton();
        assertThat(url()).isEqualTo(INVENTORY);
    }

    public void checkoutStepOnePageIsOpened() {
        clickCheckoutButton();
        assertThat(url()).isEqualTo(CHECKOUT_STEP_ONE);
    }

    public void removeAllProductsFromCart() {
        removeFromCart.forEach(SelenideElement::click);
    }

    public void itemQuantityForAllProductsInTheCartIsOne() {
        cartQuantity.forEach(e -> assertThat(e.innerText()).isEqualTo("1"));
    }

    public void numberOfItemsInCartShouldBeEqualTo(int value) {
        assertThat(getNumberOfProductsInCart()).isEqualTo(value);
    }

    private int getNumberOfProductsInCart() {
        return cartQuantity.size();
    }

    private void clickCheckoutButton() {
        checkout.click();
    }

    private void clickContinueShoppingButton() {
        continueShopping.click();
    }

}
