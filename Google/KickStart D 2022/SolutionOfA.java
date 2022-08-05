import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        int test = Integer.parseInt(in.readLine());
        for (int t = 1; t <= test; t++) {
            int[] NM = Arrays.stream(in.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            int[] A = Arrays.stream(in.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            // Sorted and reversed the array
            Arrays.sort(A);
            int i = 0, j = NM[0] - 1;
            while (i < j) {
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
                i++; j--;
            }
            double maxValue = 0D;
            for (i = 0; i < NM[1] - 1; i++)
                maxValue += A[i];
            List<Integer> lst = new ArrayList<>() {
                {
                    for (int id = NM[1] - 1; id < NM[0]; id++)
                        add(A[id]);
                }
            };
            int s = lst.size();
            if ((s & 1) == 1) {
                maxValue += lst.get((s >> 1));
            } else {
                int h = s >> 1;
                maxValue += ((double)lst.get(h) + (double)lst.get(h - 1)) / 2D;
            }
            
            out.write("Case #" + t + ": " + maxValue + "\n");
            out.flush();
        }
    }
}
