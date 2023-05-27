package pratice;

public class aaxSumOddNumbers {
    public static int rowSumOddNumbers(int n) {
        int firstNumbLine = 1 +( n * (n - 1));
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += firstNumbLine;
            firstNumbLine += 2;
        }
        System.out.println(sum);
        return 0;
    }

    public static void main(String[] args) {
        rowSumOddNumbers(2);
    }
}
