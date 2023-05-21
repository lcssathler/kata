package pratice;

public class aadHeroSurvive {
    public static boolean hero(double bullets, double dragons) {
        long bulletsL = (long) bullets;
        long dragonsL = (long) dragons;
        return bulletsL >= dragons * 2;
    }

    public static void main(String[] args) {
        boolean isSurvive = hero(1879646330, 1321621118);
        System.out.println(isSurvive);
    }
}
