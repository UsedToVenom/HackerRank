package OldExercises;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Cal {
    public static String getDay(String day, String month, String year){
      Calendar kal = Calendar.getInstance();
      kal.set(Integer.valueOf(year), Integer.valueOf(month)-1, Integer.valueOf(day));
      int dayOfWeek = kal.get(Calendar.DAY_OF_WEEK);
    String s [] = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
    return s[dayOfWeek-1];


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();

        System.out.println(getDay(day, month, year));
    }
}

