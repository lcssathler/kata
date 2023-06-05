package pratice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class abeRegexPINCode {
    public static boolean validatePin(String pin) {
        String regex  = "(\\d){4}|(\\d){6}";
        Pattern compile = Pattern.compile(regex);
        Matcher matcher = compile.matcher(pin);
        return matcher.matches();
    }

    public static void main(String[] args) {
        System.out.println(validatePin("a12345"));
    }
}
