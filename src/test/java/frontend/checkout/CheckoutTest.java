package frontend.checkout;

import base.StandardBase;
import org.testng.annotations.Test;
import pageobjects.Cart;
import pageobjects.Checkout;
import pageobjects.Inventory;

@Test
public class CheckoutTest extends StandardBase {

    private final Inventory inventory = new Inventory();
    private final Cart cart = new Cart();
    private final Checkout checkout = new Checkout();

    public void itShouldBePossibleToContinueWithCheckoutHavingAllFieldsFilledIn(){

        //Given
        inventory.cartPageIsOpened();
        cart.checkoutStepOnePageIsOpened();

        //When
        checkout.fillInCheckoutData();

        //Then
        checkout.checkoutStepTwoPageIsOpened();
    }
}
