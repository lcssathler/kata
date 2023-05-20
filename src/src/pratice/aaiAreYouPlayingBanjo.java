package pratice;

public class aaiAreYouPlayingBanjo {
    public static String areYouPlayingBanjo(String name) {
        if (name.toUpperCase().startsWith("R")) {
            return name + " plays banjo";
        }
        return name + " doesn't play banjo";
    }

    public static void main(String[] args) {
        System.out.println(areYouPlayingBanjo("Martin"));
    }
}
