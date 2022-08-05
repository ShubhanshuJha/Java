// 10 15 -> 2
// 10215 12165 -> 4
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class CountCommonFactorsOfTwoNumbers {
    public static void main(String args[] ) throws Exception {
        long[] ab = Arrays.stream((new BufferedReader(new InputStreamReader(System.in))).readLine().split("\\s+")).mapToLong(Long::parseLong).toArray();
        long count = 0L;
        long g = gcd(ab[0], ab[1]);
        for (long l = 1L; l <= Math.sqrt(g); l++)
            if (g % l == 0) {
                if (g / l == l) count++;
                else count += 2L;
            }
        System.out.println(count);
    }
    private static final long gcd(long a, long b) {
        return a == 0 ? b : gcd(b % a, a);
    }
}
