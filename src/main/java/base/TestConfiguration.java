package base;

import lombok.NoArgsConstructor;

import static com.codeborne.selenide.Configuration.headless;
import static com.codeborne.selenide.Configuration.timeout;
import static lombok.AccessLevel.PRIVATE;

@NoArgsConstructor(access = PRIVATE)
public class TestConfiguration {

    public static void setBrowserConfiguration() {
        headless = false;
        timeout = 10_000;
    }
}
