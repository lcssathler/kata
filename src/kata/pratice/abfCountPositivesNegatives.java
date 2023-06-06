package pratice;

import java.util.ArrayList;
import java.util.List;

public class abfCountPositivesNegatives {
    public static int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) return new int[0];
        int countPositives = 0;
        int sumNegatives =  0;
        for (int i : input) {
            if (i > 0) countPositives++; else sumNegatives+= i;
        }

        return new int[]{countPositives, sumNegatives};
    }

    public static void main(String[] args) {
        int[] ints = countPositivesSumNegatives(null);
        List<Integer> numsList = new ArrayList<>();
        for (int anInt : ints) {
            numsList.add(anInt);
        }
        System.out.println(numsList);
    }
}
