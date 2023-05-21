package pratice;

public class aamCenturyFromYear {
    public static int century(int number) {
        int centuryYear;
        if (number % 100 >= 1) {
            centuryYear = (number / 100) + 1;
        } else {
            centuryYear = number/ 100;
        }
        return centuryYear;
    }

    public static void main(String[] args) {
        System.out.println(century(1705));
        System.out.println(century(1900));
        System.out.println(century(1601));
        System.out.println(century(2000));
        System.out.println(century(89));
    }
}
