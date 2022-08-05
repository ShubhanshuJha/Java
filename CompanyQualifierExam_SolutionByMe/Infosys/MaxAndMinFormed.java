// 42%
import java.util.*;

public class MaxAndMinFormed {
    public static void main(String[] args) {
        // int n = 555;
        // int n = 9;
        int n = 98;
        System.out.println(solution(n));
    }
    private static List<Integer> solution(int n) {
        List<Integer> res = new ArrayList<>();
        String str = String.valueOf(n);

        if (str.length() == 1) {
            res.add(1);
            res.add(9);
            return res;
        }

        String min = String.valueOf("1");
        String max = String.valueOf("9");
        String firstBit = "";

        int f = Integer.parseInt(String.valueOf(str.charAt(0)));

        String minVal = "";
        String maxVal = "";

        if (f == 1) {
            firstBit = String.valueOf(str.charAt(1));
        } else {
            firstBit = String.valueOf(str.charAt(0));
        }

        minVal = str.replaceAll(firstBit, min);

        if (f == 9) {
            firstBit = String.valueOf(str.charAt(1));
        } else {
            firstBit = String.valueOf(str.charAt(0));
        }

        maxVal = str.replaceAll(firstBit, max);

        res.add(Integer.parseInt(minVal));
        res.add(Integer.parseInt(maxVal));

        return res;
    }
}