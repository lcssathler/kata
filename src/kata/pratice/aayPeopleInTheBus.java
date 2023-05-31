package pratice;

import java.util.ArrayList;
import java.util.Iterator;
public class aayPeopleInTheBus {
    public static int countPassengers(ArrayList<int[]> stops) {
        int people = 0;
        Iterator<int[]> iterator = stops.stream().iterator();
        while (iterator.hasNext()) {
            int[] next = iterator.next();
            people += next[0];
            people -= next[1];
        }

        return people;
    }
    public static void main(String[] args) {
        ArrayList<int[]> list = new ArrayList<>();
        list.add(new int[] {6, 0});
        list.add(new int[] {3, 2});
        list.add(new int[] {3, 4});
        list.add(new int[] {2, 1});
        System.out.println(countPassengers(list));
    }
}


