package frontend.navigation;

import base.StandardBase;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.title;
import static org.assertj.core.api.Assertions.assertThat;

@Test
public class NavigationTest extends StandardBase {

    public void webpageTitleShouldMatch() {

        //Given
        String webpageTitle = "Swag Labs";

        //Then
        assertThat(title()).isEqualTo(webpageTitle);
    }
}
