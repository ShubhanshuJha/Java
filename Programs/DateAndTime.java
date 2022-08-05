import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.lang.*;

public class DateAndTime{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the date(MM/DD/YYYY): ");
        int month = in.nextInt();
        int day = in.nextInt();
        int year = in.nextInt();
        System.out.print(findDay(month, day, year));
    }
    // Approach 1
    // public static String findDay(int month, int day, int year){
    // 	LocalDate dt = LocalDate.of(year, month, day);
    //     return dt.getDayOfWeek();
    // }
    // Approach 2
    public static String findDay(int month, int day, int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MONTH, month-1);
        cal.set(Calendar.DAY_OF_MONTH, day);
        cal.set(Calendar.YEAR, year);

        String[] day_of_week = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY",
                                "THURSDAY", "FRIDAY","SATURDAY"};
        return day_of_week[cal.get(Calendar.DAY_OF_WEEK)-1];
    }
}