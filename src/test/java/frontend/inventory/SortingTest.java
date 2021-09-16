package frontend.inventory;

import base.StandardBase;
import org.testng.annotations.Test;
import pageobjects.Inventory;

@Test
public class SortingTest extends StandardBase {

    private final Inventory inventory = new Inventory();


    public void productsShouldBeSortedByNameDescWhenClicked() {

        //When
        inventory.shoppingCartIsEmpty();
        inventory.clickSortByNameDescButton();

        //Then
        inventory.itemsShouldBeSortedByNameDesc();
    }

    public void productsShouldBeSortedByNameAscWhenClicked() {

        //When
        inventory.shoppingCartIsEmpty();
        inventory.clickSortByNameAscButton();

        //Then
        inventory.itemsShouldBeSortedByNameAsc();
    }

    public void productsShouldBeSortedByPriceAscWhenClicked() {

        //When
        inventory.shoppingCartIsEmpty();
        inventory.clickSortByPriceAscButton();

        //Then
        inventory.itemsShouldBeSortedByPriceAsc();
    }

    public void productsShouldBeSortedByPriceDescWhenClicked() {

        //When
        inventory.shoppingCartIsEmpty();
        inventory.clickSortByPriceDescButton();

        //Then
        inventory.itemsShouldBeSortedByPriceDesc();
    }
}
