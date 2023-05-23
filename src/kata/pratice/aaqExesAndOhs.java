package pratice;

import java.text.StringCharacterIterator;

public class aaqExesAndOhs {

    public static boolean getXO (String str) {
        StringCharacterIterator sci = new StringCharacterIterator(str.toLowerCase());
        int countX = 0;
        int countO = 0;
        for (char c = sci.first(); c != StringCharacterIterator.DONE; c = sci.next()) {
            if (c == 'x') {
                countX++;
            } else if (c == 'o') {
                countO++;
            }
        }

        return countX == countO;
    }
    public static void main(String[] args) {
        boolean str = getXO("oxO");
        System.out.println(str);
    }
}
