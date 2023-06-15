package pratice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class abjFiendCheating {
    public static List<long[]> removNb(long n) {
        List<long[]> results = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (i * j == sumSequence(n) - i - j) {
                    results.add(new long[]{i, j});
                }
            }
        }
        return results;
    }

    public static long sumSequence(long n) {
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
