package pratice;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalTime;

public class aaeHourMinSec {
    public static long past(int h, int m, int s){
        long hourMs = (long) h * 60 * 60 * 1000;
        long minMs = (long) m * 60 * 1000;
        int secMs =  s * 1000;
        return hourMs + minMs + secMs;
    }

    public static void main(String[] args) {
        System.out.println(past(2, 30, 10));
    }
}
