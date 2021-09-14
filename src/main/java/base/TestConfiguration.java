package base;

import com.codeborne.selenide.Configuration;
import lombok.NoArgsConstructor;

import static lombok.AccessLevel.PRIVATE;

@NoArgsConstructor(access = PRIVATE)
public class TestConfiguration {

    public static void setBrowserConfiguration() {
        Configuration.startMaximized = true;
        Configuration.timeout = 10_000;
    }
}
