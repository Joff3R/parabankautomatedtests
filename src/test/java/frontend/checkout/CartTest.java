package frontend.checkout;

import base.StandardBase;
import org.testng.annotations.Test;
import pageobjects.Cart;
import pageobjects.Inventory;

@Test
public class CartTest extends StandardBase {

    private final Inventory inventory = new Inventory();
    private final Cart cart = new Cart();

    public void itemsQuantityInCartShouldBeEqualToOne() {

        //Given
        inventory.addAllProductsToCart();

        //When
        inventory.cartPageIsOpened();

        //Then
        cart.productQuantityForAllProductsInTheCartIsOne();
    }

    public void itShouldBePossibleToRemoveProductsFromCart() {

        //Given
        inventory.addAllProductsToCart();
        inventory.cartPageIsOpened();

        //When
        cart.removeAllProductsFromCart();

        //Then
        cart.numberOfItemsInCartShouldBeEqualTo(0);

    }


}
