package frontend.checkout;

import base.StandardBase;
import org.testng.annotations.Test;
import pageobjects.Cart;
import pageobjects.Checkout;
import pageobjects.Inventory;

import static common.ErrorConstants.FIRST_NAME_IS_REQUIRED;
import static common.ErrorConstants.LAST_NAME_IS_REQUIRED;
import static common.ErrorConstants.POSTAL_CODE_IS_REQUIRED;

@Test
public class CheckoutNegativeTest extends StandardBase {

    private final Inventory inventory = new Inventory();
    private final Cart cart = new Cart();
    private final Checkout checkout = new Checkout();

    public void itShouldNotBePossibleToContinueWithCheckoutHavingFirstNameFieldLeftBlank(){

        //Given
        inventory.shoppingCartIsEmpty();
        inventory.cartPageIsOpened();
        cart.checkoutStepOnePageIsOpened();

        //When
        checkout.fillInLastName();
        checkout.fillInPostalCode();
        checkout.clickContinueButton();

        //Then
        checkout.errorMessageShouldAppear(FIRST_NAME_IS_REQUIRED);
    }

    public void itShouldNotBePossibleToContinueWithCheckoutHavingLastNameFieldLeftBlank(){

        //Given
        inventory.shoppingCartIsEmpty();
        inventory.cartPageIsOpened();
        cart.checkoutStepOnePageIsOpened();

        //When
        checkout.fillInFirstName();
        checkout.fillInPostalCode();
        checkout.clickContinueButton();

        //Then
        checkout.errorMessageShouldAppear(LAST_NAME_IS_REQUIRED);
    }

    public void itShouldNotBePossibleToContinueWithCheckoutHavingPostalCodeFieldLeftBlank(){

        //Given
        inventory.shoppingCartIsEmpty();
        inventory.cartPageIsOpened();
        cart.checkoutStepOnePageIsOpened();

        //When
        checkout.fillInFirstName();
        checkout.fillInLastName();
        checkout.clickContinueButton();

        //Then
        checkout.errorMessageShouldAppear(POSTAL_CODE_IS_REQUIRED);
    }

    public void itShouldNotBePossibleToContinueWithCheckoutHavingAllFieldsLeftBlank(){

        //Given
        inventory.shoppingCartIsEmpty();
        inventory.cartPageIsOpened();
        cart.checkoutStepOnePageIsOpened();

        //When
        checkout.clickContinueButton();

        //Then
        checkout.errorMessageShouldAppear(FIRST_NAME_IS_REQUIRED);
    }
}
