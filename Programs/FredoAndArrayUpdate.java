/*  5
    1 2 3 4 5
    => 4
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FredoAndArrayUpdate {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        long sum = Arrays.stream(arr).sum();
        long result = (sum / n) + 1;
        System.out.println(result);
    }
}
