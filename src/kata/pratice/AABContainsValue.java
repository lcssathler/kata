package pratice;

public class AABContainsValue {
    public static boolean check(Object[] a, Object x) {
        for (Object obj : a) {
            if (x.equals(obj)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String[] names = {"Lucas", "Sathler", "de", "Aguiar", "Policarpo"};
        String lastName = "Policarpo";

        boolean isContain = check(names, lastName);
        System.out.println(isContain);
    }
}
