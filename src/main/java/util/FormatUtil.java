package util;

import lombok.NoArgsConstructor;

import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import static lombok.AccessLevel.PRIVATE;
import static org.testng.Assert.assertTrue;

@NoArgsConstructor(access = PRIVATE)
public class FormatUtil {

    public static final String PRICE_FORMAT = "\\d{2}[.]\\d{2}";

    public static String extractRegexMatch(String text, String regexPattern) {
        var regex = Pattern.compile(regexPattern);
        var matcher = regex.matcher(text);
        assertTrue(matcher.find(), "No match found in text");
        return matcher.group(0);
    }

    public static List<Float> extractProductAmount(List<String> priceList) {
        return priceList
                .stream()
                .map(e -> extractRegexMatch(e, PRICE_FORMAT))
                .map(Float::valueOf)
                .collect(Collectors.toList());
    }
}
