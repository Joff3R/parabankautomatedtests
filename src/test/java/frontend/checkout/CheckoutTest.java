package frontend.checkout;

import base.StandardBase;
import org.testng.annotations.Test;
import pageobjects.Cart;
import pageobjects.Checkout;
import pageobjects.Inventory;

import static common.StringConstants.THANK_YOU_FOR_YOUR_ORDER;

@Test
public class CheckoutTest extends StandardBase {

    private final Inventory inventory = new Inventory();
    private final Cart cart = new Cart();
    private final Checkout checkout = new Checkout();

    public void itShouldBePossibleToContinueWithCheckoutHavingAllFieldsFilledIn() {

        //Given
        inventory.cartPageIsOpened();
        cart.checkoutStepOnePageIsOpened();

        //When
        checkout.fillInCheckoutData();

        //Then
        checkout.checkoutStepTwoPageIsOpened();
    }

    public void itemsShouldRemainInCartWhenCancelButtonIsClicked() {

        //Given
        inventory.addAllProductsToCart();
        inventory.cartPageIsOpened();
        cart.checkoutStepOnePageIsOpened();

        //When
        checkout.cartPageIsOpened();

        //Then
        cart.numberOfItemsInCartShouldBeEqualTo(6);
        inventory.shoppingCartIconWithItemNumberShouldDisplayNumberOfAddedProducts(6);
    }

    public void itShouldBePossibleToPlaceValidOrder() {

        //Given
        inventory.addAllProductsToCart();
        inventory.cartPageIsOpened();
        cart.checkoutStepOnePageIsOpened();
        checkout.fillInCheckoutData();
        checkout.checkoutStepTwoPageIsOpened();

        //When
        checkout.checkoutCompletePageIsOpened();

        //Then
        checkout.confirmationMessageShouldAppear(THANK_YOU_FOR_YOUR_ORDER);
        inventory.shoppingCartIconWithItemNumberShouldNotBeVisible();

        //And When
        checkout.inventoryPageIsOpened();

        //Then
        inventory.allAddButtonsShouldBeVisible();
    }
}

