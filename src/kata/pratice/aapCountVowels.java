package pratice;

    import java.util.regex.Matcher;
    import java.util.regex.Pattern;

public class aapCountVowels {
    public static int getCount(String str) {
        String regex = "([aeiou])";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str.toLowerCase());
        int count = 0;
        while (matcher.find()) {
            System.out.println(matcher.group());
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        final int word = getCount("pear tree");
        System.out.println(word);
    }
}
