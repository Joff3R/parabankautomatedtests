package frontend.inventory;

import base.StandardBase;
import org.testng.annotations.Test;
import pageobjects.Inventory;
import pageobjects.ItemPreview;

import static org.assertj.core.api.Assertions.assertThat;

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

    public void abc() {

        //Given
        inventory.shoppingCartIsEmpty();

        //When
        inventory.addAllProductsToCart();

        //Then
        var a = inventory.addInventoryPrices();
        var b = 129.94f;

        assertThat(a).isEqualTo(b);
    }
}
