package util;

import com.codeborne.selenide.SelenideElement;

import static org.assertj.core.api.Assertions.assertThat;

public class MessageUtil {

    public static void correctMessageShouldAppear(SelenideElement pageElement, String expectedMessage){
        assertThat(pageElement.innerText()).isEqualTo(expectedMessage);
    }


}
