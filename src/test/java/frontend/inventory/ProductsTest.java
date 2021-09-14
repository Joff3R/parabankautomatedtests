package frontend.inventory;

import base.StandardBase;
import org.testng.annotations.Test;
import pageobjects.LoginPage;
import pageobjects.Products;

@Test
public class ProductsTest extends StandardBase {

    private final Products products = new Products();
    LoginPage loginPage = new LoginPage();

    public void itShouldBePossibleToAddAllProductsToCart() {

//        loginPage.userIsLoggedIn(STANDARD_USER);
        //Given
        products.shoppingCartIsEmpty();

        //When
        products.addAllProductsToCart();

        //Then
        products.shoppingCartBadgeDoesNotDisplayNumber();
    }
}
