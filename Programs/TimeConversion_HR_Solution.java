import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class TimeConversion_HR_Solution {
    static void timeConversion(String time, String timeZ, String hour) {
        if (timeZ.charAt(0) == 'P'){
            if (Integer.parseInt(hour) != 12) {
                int t = Integer.parseInt(hour);
                t += 12;
                hour = String.valueOf(t);
            }
            String newTime = hour + time;
            System.out.println(newTime);
        }
        else if(timeZ.charAt(0) == 'A'){
            if (hour.charAt(1) == '2') {
                String t = "00";
                hour = t;
            }
            System.out.println(hour+time);
        }
    }
                 //0123456789
    //Sample Time: 07:05:45PM

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String timeMeridian = s.substring(8,10);
        String hr = s.substring(0,2);
        String time = s.substring(2,8);
        timeConversion(time, timeMeridian, hr);
        sc.close();
    }
}