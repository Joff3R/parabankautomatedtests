package util;

import lombok.NoArgsConstructor;

import java.util.concurrent.ThreadLocalRandom;

import static lombok.AccessLevel.PRIVATE;

@NoArgsConstructor(access = PRIVATE)
public class RandomUtil {

    public static int generateRandomNumber(int origin, int bound){
        return ThreadLocalRandom.current().nextInt(origin, bound + 1);
        //
    }
}
