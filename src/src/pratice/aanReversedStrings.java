package pratice;

public class aanReversedStrings {
    public static String solution(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    public static void main(String[] args) {
        System.out.println(solution("lucas"));
    }
}
