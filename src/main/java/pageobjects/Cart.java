package pageobjects;

import com.codeborne.selenide.SelenideElement;
import lombok.extern.java.Log;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static org.assertj.core.api.Assertions.assertThat;

@Log
public class Cart {

    private final SelenideElement checkout = $("#checkout");

    private final List<SelenideElement> removeFromCart = $$(".btn_secondary");
    private final List<SelenideElement> cartQuantity = $$(".cart_quantity");

    public void clickCheckoutButton() {
        checkout.click();
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
