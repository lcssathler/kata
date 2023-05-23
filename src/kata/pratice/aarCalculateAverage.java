package pratice;

public class aarCalculateAverage {
    public static double find_average(int[] listNums){
        double sum = 0;
        for (int num : listNums) {
            sum += num;
        }
        return Math.floor( sum / listNums.length);
    }

    public static void main(String[] args) {
        int[] nums = {};
        double average = find_average(nums);
        System.out.println(average);
    }

}
