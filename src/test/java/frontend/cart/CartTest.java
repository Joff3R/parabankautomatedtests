package frontend.cart;

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
        inventory.shoppingCartIsEmpty();
        inventory.addAllProductsToCart();

        //When
        inventory.shoppingCartIsEmpty();
        inventory.cartPageIsOpened();

        //Then
        cart.itemQuantityForAllProductsInTheCartIsOne();
    }

    public void itShouldBePossibleToRemoveProductsFromCart() {

        //Given
        inventory.shoppingCartIsEmpty();
        inventory.addAllProductsToCart();
        inventory.cartPageIsOpened();

        //When
        cart.removeAllProductsFromCart();

        //Then
        cart.numberOfItemsInCartShouldBeEqualTo(0);
    }

    public void itemsShouldRemainInCartWhenContinueShoppingButtonIsClicked(){

        //Given
        inventory.shoppingCartIsEmpty();
        inventory.addAllProductsToCart();
        inventory.cartPageIsOpened();

        //When
        cart.inventoryPageIsOpened();

        //Then
        inventory.shoppingCartIconWithItemNumberShouldDisplayNumberOfAddedProducts(6);
    }
}
