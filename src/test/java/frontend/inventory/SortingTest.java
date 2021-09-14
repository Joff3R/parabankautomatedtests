package frontend.inventory;

import base.StandardBase;
import org.testng.annotations.Test;
import pageobjects.Inventory;

@Test
public class SortingTest extends StandardBase {

    private final Inventory inventory = new Inventory();


    public void productsShouldBeSortedByNameDescWhenClicked() {

        //When
        inventory.clickSortByNameDescButton();

        //Then
        inventory.itemsShouldBeSortedByNameDesc();
    }

    public void productsShouldBeSortedByNameAscWhenClicked() {

        //When
        inventory.clickSortByNameAscButton();

        //Then
        inventory.itemsShouldBeSortedByNameAsc();
    }

    public void productsShouldBeSortedByPriceAscWhenClicked() {

        //When
        inventory.clickSortByPriceAscButton();

        //Then
        inventory.itemsShouldBeSortedByPriceAsc();
    }

    public void productsShouldBeSortedByPriceDescWhenClicked() {

        //When
        inventory.clickSortByPriceDescButton();

        //Then
        inventory.itemsShouldBeSortedByPriceDesc();

    }
}
