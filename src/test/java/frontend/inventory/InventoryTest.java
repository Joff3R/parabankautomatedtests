package frontend.inventory;

import base.StandardBase;
import org.testng.annotations.Test;
import pageobjects.Inventory;
import pageobjects.ItemPreview;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static util.FormatUtil.extractProductAmount;

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

    public void cba() {

        List<String> list = new ArrayList<>();
        list.add("$21.22"); list.add("$asdfda12h24.212$a");
        var text = extractProductAmount(list);
        text.forEach(System.out::println);

        var listt = inventory.getInnerTextsFromLocatorList(inventory.inventoryItemPrices);
        listt.forEach(System.out::println);
        var secondList = extractProductAmount(listt);
        secondList.forEach(System.out::println);

    }

    public void alasd() {

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
