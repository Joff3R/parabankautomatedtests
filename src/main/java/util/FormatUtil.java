package util;

import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

import static lombok.AccessLevel.PRIVATE;

@NoArgsConstructor(access = PRIVATE)
public class FormatUtil {

    public static List<Float> extractProductAmount(List<String> priceList) {
        return priceList
                .stream()
                .map(e -> e.replace("$", ""))
                .map(Float::valueOf)
                .collect(Collectors.toList());
    }
}
