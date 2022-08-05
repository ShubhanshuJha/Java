import java.io.*;
import java.util.*;

public class Solution {
    static final long INF = Long.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        int test = Integer.parseInt(in.readLine());
        for (int t = 1; t <= test; t++) {
            long[] NXY = Arrays.stream(in.readLine().split("\\s+")).mapToLong(Long::parseLong).toArray();
            long sumOfFirstN = (NXY[0] * (NXY[0] + 1)) >> 1;
            NXY[1] += NXY[2];
            if (sumOfFirstN % NXY[1] == 0) {
                out.write("Case #" + t + ": " + "POSSIBLE" + "\n");
                NXY[1] = sumOfFirstN / NXY[1];
                NXY[2] *= NXY[1];
                long upperBound = NXY[0];
                long[] vals = new long[(int)upperBound];

                for (long i = 0; i < upperBound; i++)
                    vals[(int)i] = i + 1;
                for (long i = upperBound - 1; i >= 0; i--) {
                    if (vals[(int)i] <= NXY[2]) {
                        NXY[2] -= vals[(int)i];
                        vals[(int)i] = 0;
                    }
                }
                long currResult = Arrays.stream(vals).filter(i-> i != 0).count();
                out.write(currResult + "\n");
                for (int i = 0; i < (int)upperBound; i++) {
                    if (vals[i] > 0 || vals[i] < 0)
                        out.write((i + 1) + " ");
                }
                out.write("\n");
            } else {
                out.write("Case #" + t + ": " + "IMPOSSIBLE" + "\n");
            }
            out.flush();
        }
    }
}