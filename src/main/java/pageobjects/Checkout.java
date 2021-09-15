package pageobjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.WebDriverRunner.url;
import static helper.UrlHelper.CHECKOUT_STEP_TWO;
import static org.assertj.core.api.Assertions.assertThat;

public class Checkout {

    private final SelenideElement firstName = $("#first-name");
    private final SelenideElement lastName = $("#last-name");
    private final SelenideElement postalCode = $("#postal-code");
    private final SelenideElement continueButton = $("#continue");
    private final SelenideElement errorButton = $(".error-button");
    private final SelenideElement errorMessage = $("h3[data-test=error]");



    public void clickContinueButton(){
        continueButton.click();
    }

    public void clickErrorButton(){
        errorButton.click();
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
        assertThat(errorMessage.innerText()).isEqualTo(message);
    }

    public void checkoutStepTwoPageIsOpened(){
        clickContinueButton();
        assertThat(url()).isEqualTo(CHECKOUT_STEP_TWO);
    }
}
