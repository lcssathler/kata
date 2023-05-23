package pratice;

public class aasCalculateBMI {
    public static String bmi(double weight, double height) {
        double bmiBody = weight / (Math.pow(height, 2));
        String phrase;
        if (bmiBody <= 18.5) {
            phrase = "Underweight";
        } else if (bmiBody <= 25) {
            phrase = "Normal";
        } else if (bmiBody <= 30) {
            phrase = "Overweight";
        }else {
            phrase = "Obese";
        }
        return phrase;
    }

    public static void main(String[] args) {
        final String bmi = bmi(80, 1.80);
        System.out.println(bmi);
    }
}
