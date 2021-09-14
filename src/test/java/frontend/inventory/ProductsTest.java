package frontend.inventory;

import base.StandardBase;
import org.testng.annotations.Test;
import pageobjects.Products;

@Test
public class ProductsTest extends StandardBase {

    private final Products products = new Products();

    public void itShouldBePossibleToAddAllProductsToCart() {

        //Given
        products.shoppingCartIsEmpty();

        //When
        products.addAllProductsToCart();

        //Then
        products.allAddButtonsShouldNotBeVisible();
        products.allRemoveButtonsShouldBeVisible();
        products.shoppingCartBadgeShouldDisplayNumberOfAddedProducts(6);
    }
}
