package pratice;

public class aafRemoveSpaces {
    public static String noSpace(final String x) {
        return x.replace(" ", "");
    }

    public static void main(String[] args) {
        System.out.println(noSpace("8 j 8   mBliB8g  imjB8B8  jl  B"));
    }
}
