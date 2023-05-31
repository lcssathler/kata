package pratice;

import java.math.MathContext;

public class abdReturnNegative {
    public static int makeNegative(final int x) {
        return Math.abs(x) * - 1;
    }

    public static void main(String[] args) {
        System.out.println(makeNegative(-7));
    }
}
