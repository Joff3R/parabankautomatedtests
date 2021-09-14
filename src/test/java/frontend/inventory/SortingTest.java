package frontend.inventory;

import base.StandardBase;
import org.testng.annotations.Test;
import pageobjects.Products;

@Test
public class SortingTest extends StandardBase {

    private final Products products = new Products();

    public void productsShouldBeSortedByNameAscWhenClicked() {

        //When
        products.clickSortByNameAscButton();

        //Then
        products.itemsShouldBeSortedByNameAsc();
    }

    public void productsShouldBeSortedByNameDescWhenClicked() {

        //When
        products.clickSortByNameDescButton();

        //Then
        products.itemsShouldBeSortedByNameDesc();
    }

    public void productsShouldBeSortedByPriceAscWhenClicked() {

        //When
        products.clickSortByNameAscButton();

        //Then
        products.itemsShouldBeSortedByNameAsc();
    }

    public void productsShouldBeSortedByPriceDescWhenClicked() {

        //When
        products.clickSortByNameAscButton();

        //Then
        products.itemsShouldBeSortedByNameAsc();
    }
}
