package pratice;

public class abaShortestWord {
    public static int findShort(String s) {
        int shortestWord = 0;
        String[] splitString = s.split(" ");
        for (int i = 0; i < splitString.length; i++) {
            if (i == 0) {
                shortestWord = splitString[i].length();
            } else  {
                if (splitString[i].length() < shortestWord) {
                    shortestWord = splitString[i].length();
                }
            }
        }
        return shortestWord;
    }
}
