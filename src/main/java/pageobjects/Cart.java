package pageobjects;

import com.codeborne.selenide.SelenideElement;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.WebDriverRunner.url;
import static helper.UrlHelper.CART;
import static org.assertj.core.api.Assertions.assertThat;

public class Cart {

    private final SelenideElement checkout = $("#checkout");

    private final List<SelenideElement> removeFromCart = $$(".btn_secondary");
    private final List<SelenideElement> cartQuantity = $$(".cart_quantity");

    public void clickCheckoutButton() {
        checkout.click();
    }

    public void checkOutPageIsOpened(){
        clickCheckoutButton();
        assertThat(url()).isEqualTo(CART);
    }

    public void removeAllProductsFromCart() {
        removeFromCart.forEach(SelenideElement::click);
    }

    public void productQuantityForAllProductsInTheCartIsOne() {
        cartQuantity.forEach(e -> assertThat(e.innerText()).isEqualTo("1"));
    }

    public int getNumberOfProductsInCart() {
        return cartQuantity.size();
    }

    public void numberOfItemsInCartShouldBeEqualTo(int value) {
        assertThat(getNumberOfProductsInCart()).isEqualTo(value);
    }


}
