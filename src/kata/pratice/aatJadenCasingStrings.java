package pratice;


public class aatJadenCasingStrings {
    public static String toJadenCase(String phrase) {
        String[] words = phrase.split(" ");
        String capitalizedPhrase = "";
        for (String word : words) {
            if (!word.isEmpty()) {
                String firstLetter = word.substring(0, 1).toUpperCase();
                String otherLetters = word.substring(1).toLowerCase();
                capitalizedPhrase = capitalizedPhrase.concat(firstLetter).concat(otherLetters).concat(" ");
            }
        }
        capitalizedPhrase = capitalizedPhrase.trim();
        return capitalizedPhrase;
    }

    public static void main(String[] args) {
        String capitalString = toJadenCase("i love        programming    ");
        System.out.println(capitalString);
    }
}
