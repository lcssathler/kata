package pratice;

public class AAAMaxMinimumValue {
    public static int min(int[] list) {
        int min = 0;
        for (int i = 0; i < list.length; i++) {
            if (i == 0) {
                min = list[i];
            } else {
                if (list[i] < min) {
                    min = list[i];
                }
            }
        }
        return min;
    }

    public static int max(int[] list) {
        int max = 0;
        for (int i = 0; i < list.length; i++) {
            if (i == 0) {
                max = list[i];
            } else {
                if (list[i] > max) {
                    max = list[i];
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] numbers = {2, 5, 124, 22, 5345, 4, 1245};
        int maxNumber = max(numbers);
        int minNumber = min(numbers);
    }
}
