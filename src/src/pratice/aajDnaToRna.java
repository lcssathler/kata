package pratice;

public class aajDnaToRna {
    public static String dnaToRna(String dna) {
        String replaced = dna.replace("T", "U");
        return replaced;
    }

    public static void main(String[] args) {
        System.out.println(dnaToRna("GCAT"));
    }
}
