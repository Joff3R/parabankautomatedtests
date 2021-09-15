package pageobjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
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

    public void errorShouldAppear(String message){
        assertThat(errorMessage.innerText()).isEqualTo(message);
    }
}
