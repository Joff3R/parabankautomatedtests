package frontend.inventory;

import base.StandardBase;
import org.testng.annotations.Test;
import pageobjects.Inventory;
import pageobjects.ItemPreview;

@Test
public class InventoryTest extends StandardBase {

    private final Inventory inventory = new Inventory();
    private final ItemPreview itemPreview = new ItemPreview();


    public void itShouldBePossibleToAddAllProductsToCart() {

        //Given
        inventory.shoppingCartIsEmpty();

        //When
        inventory.addAllProductsToCart();

        //Then
        inventory.allAddButtonsShouldNotBeVisible();
        inventory.allRemoveButtonsShouldBeVisible();
        inventory.shoppingCartIconWithItemNumberShouldDisplayNumberOfAddedProducts(6);
    }

    public void itShouldBePossibleToAddProductFromPreview() {

        //Given
        inventory.shoppingCartIsEmpty();
        inventory.itemPreviewPageIsOpened();

        //When
        itemPreview.clickAddToCartButton();

        //Then
        itemPreview.addToCartButtonShouldNotBeVisible();
        inventory.shoppingCartIconWithItemNumberShouldDisplayNumberOfAddedProducts(1);
    }
}
