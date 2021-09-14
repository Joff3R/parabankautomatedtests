package pageobjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.WebDriverRunner.url;
import static helper.UrlHelper.INVENTORY;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ItemPreview {

    private final Inventory inventory = new Inventory();

    private final SelenideElement addToCart = $(".btn_primary");
    private final SelenideElement backToProducts = $("#back-to-products");

    public void clickAddToCartButton(){
        addToCart.click();
    }

    public void clickBackToProductsButton(){
        backToProducts.click();
        assertThat(url()).isEqualTo(INVENTORY);
    }

    public void inventoryPageIsOpened(){
        clickBackToProductsButton();
    }

    public void addToCartButtonShouldNotBeVisibleInPreview(){
        addToCart.shouldNotBe(visible);
    }

    public void itemPreviewPageIsOpened(){
        inventory.openRandomItemPreview();
        assertThat(url()).isNotEqualTo(INVENTORY);

    }
}
