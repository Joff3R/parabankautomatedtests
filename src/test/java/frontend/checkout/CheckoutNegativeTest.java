package frontend.checkout;

import org.testng.annotations.Test;
import pageobjects.Cart;
import pageobjects.Inventory;

@Test
public class CheckoutNegativeTest {

    private final Inventory inventory = new Inventory();
    private final Cart cart = new Cart();

    public void itShouldNotBePossibleToContinueWithCheckoutHavingFirstNameFieldLeftBlank(){

        //Given
        inventory.cartPageIsOpened();
        cart.checkOutPageIsOpened();

    }
}
