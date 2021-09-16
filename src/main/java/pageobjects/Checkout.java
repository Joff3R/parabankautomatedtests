package pageobjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.WebDriverRunner.url;
import static helper.UrlHelper.*;
import static java.util.Collections.singletonList;
import static org.assertj.core.api.Assertions.assertThat;
import static util.FormatUtil.extractProductAmount;
import static util.FormatUtil.getInnerTextsFromLocatorList;
import static util.MessageUtil.correctMessageShouldAppear;

public class Checkout {

    private final Inventory inventory = new Inventory();

    private final SelenideElement firstName = $("#first-name");
    private final SelenideElement lastName = $("#last-name");
    private final SelenideElement postalCode = $("#postal-code");
    private final SelenideElement continueButton = $("#continue");
    private final SelenideElement errorButton = $(".error-button");
    private final SelenideElement errorMessage = $("h3[data-test=error]");
    private final SelenideElement cancel = $("#cancel");
    private final SelenideElement finish = $("#finish");
    private final SelenideElement backHome = $("#back-to-products");
    private final SelenideElement completeHeader = $(".complete-header");
    private final SelenideElement itemTotal = $(".summary_subtotal_label");

    public void clickContinueButton(){
        continueButton.click();
    }

    public void clickCancelButton(){
        cancel.click();
    }

    public void clickFinishButton(){
        finish.click();
    }

    public void clickErrorButton(){
        errorButton.click();
    }

    public void clickBackHomeButton(){
        backHome.click();
    }

    public void fillInFirstName(){
        firstName.sendKeys("A");
    }

    public void fillInLastName(){
        lastName.sendKeys("B");
    }

    public void fillInPostalCode(){
        postalCode.sendKeys("000");
    }

    public void fillInCheckoutData(){
        fillInFirstName();
        fillInLastName();
        fillInPostalCode();
    }

    public void errorMessageShouldAppear(String message){
        correctMessageShouldAppear(errorMessage, message);
    }

    public void confirmationMessageShouldAppear(String message) {
        correctMessageShouldAppear(completeHeader, message);
    }

    public void checkoutStepTwoPageIsOpened(){
        clickContinueButton();
        assertThat(url()).isEqualTo(CHECKOUT_STEP_TWO);
    }

    public void cartPageIsOpened(){
        clickCancelButton();
        assertThat(url()).isEqualTo(CART);
    }

    public void checkoutCompletePageIsOpened(){
        clickFinishButton();
        assertThat(url()).isEqualTo(CHECKOUT_COMPLETE);
    }

    public void inventoryPageIsOpened(){
        clickBackHomeButton();
        assertThat(url()).isEqualTo(INVENTORY);
    }

    public void summedItemPriceIsEqualToItemLabel(float summedItemPrice){

        var itemTotalSingleton = singletonList(itemTotal);
        var itemTotalPriceText = getInnerTextsFromLocatorList(itemTotalSingleton);
        var itemTotalExtractedAmount = extractProductAmount(itemTotalPriceText);
        var finalValue = itemTotalExtractedAmount.get(0);
        assertThat(summedItemPrice).isEqualTo(finalValue);
    }
}
