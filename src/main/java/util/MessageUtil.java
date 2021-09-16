package util;

import com.codeborne.selenide.SelenideElement;
import lombok.NoArgsConstructor;

import static lombok.AccessLevel.PRIVATE;
import static org.assertj.core.api.Assertions.assertThat;

@NoArgsConstructor(access = PRIVATE)
public class MessageUtil {

    public static void correctMessageShouldAppear(SelenideElement pageElement, String expectedMessage){
        assertThat(pageElement.innerText()).isEqualTo(expectedMessage);
    }


}
