package pratice;

public class aahReverse {
    public static int[] reverse(int n){
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = n - i;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] ints = reverse(10);
        for (int anInt : ints) {
            System.out.println(anInt);
        }

    }
}
