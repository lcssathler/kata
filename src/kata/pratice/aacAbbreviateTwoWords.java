package pratice;

public class aacAbbreviateTwoWords {
    public static String abbrevName(String name) {
        String[] splitName = name.split(" ");
        String newName = "";
        for (int i = 0; i < splitName.length; i++) {
            String n = String.valueOf(splitName[i].toUpperCase().charAt(0));
            if (i == splitName.length - 1) {
                newName = newName.concat(n);
            } else {
                newName = newName.concat(n).concat(".");
            }
        }
        return newName;
    }
    public static void main(String[] args) {
        System.out.println(abbrevName("lucas sathler de aguiar policarpo"));
    }
}
