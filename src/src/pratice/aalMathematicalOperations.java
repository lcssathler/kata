package pratice;

public class aalMathematicalOperations {
    public static double basicMath(String op, int v1, int v2) {
        String operators = "+, -, *, /";
        if (!operators.contains(op)) {
            System.out.println("Invalid operator!");
            return 0;
        }
        double result = 0D;
        if (op.equals("+")) {
            result = v1 + v2;
        } else if (op.equals("-")) {
            result = v1 - v2;
        } else if (op.equals("*")) {
            result = v1 * v2;
        }else if (op.equals("/")){
            result = (double) v1 / v2;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(basicMath("/", 1, -10));
    }

}
