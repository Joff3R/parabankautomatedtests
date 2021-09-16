package base;

import lombok.NoArgsConstructor;

import static com.codeborne.selenide.Configuration.*;
import static lombok.AccessLevel.PRIVATE;

@NoArgsConstructor(access = PRIVATE)
public class TestConfiguration {

    public static void setBrowserConfiguration() {
        headless = false;
        timeout = 10_000;
        screenshots = false;
    }
}
