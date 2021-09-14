package frontend.inventory;

import base.StandardBase;
import org.testng.annotations.Test;
import pageobjects.Inventory;
import pageobjects.ItemPreview;

@Test
public class InventoryNegativeTest extends StandardBase {

    private final Inventory inventory = new Inventory();
    private final ItemPreview itemPreview = new ItemPreview();

    public void itShouldNotBePossibleToAddTheSameProductTwiceInPreviewAndMainPage(){

        //Given
        inventory.shoppingCartIsEmpty();

        //When
        inventory.clickBackpackAddButton();
        inventory.clickBackpackItemName();

        //Then
        itemPreview.addToCartButtonShouldNotBeVisible();

        //And When
        itemPreview.inventoryPageIsOpened();

        //Then
        inventory.backpackAddButtonShouldNotBeVisible();
    }
}
