import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        int test = Integer.parseInt(in.readLine());
        for (int t = 1; t <= test; t++) {
            int N = Integer.parseInt(in.readLine());
            long[] A = Arrays.stream(in.readLine().split("\\s+")).mapToLong(Long::parseLong).toArray();
            int M = Integer.parseInt(in.readLine());
            long[] B = Arrays.stream(in.readLine().split("\\s+")).mapToLong(Long::parseLong).toArray();
            int K = Integer.parseInt(in.readLine());
            K = N + M - K;
            long maxValue = 0L;
            long sumA = Arrays.stream(A).sum();
            long sumB = Arrays.stream(B).sum();
            
            for (int i = 0; i <= K; i++) {
                if (i > N || K - i > M) continue;
                long sum = 0L;
                int j = 0;
                for (; j < i; j++) 
                    sum += A[j];
                long temp = sum;
                for (; j < N; j++) {
                    sum += A[j] - A[j - i];
                    temp = Math.min(temp, sum);
                }
                sum = 0;
                for (j = 0; j < K - i; j++)
                    sum += B[j];
                long temp2 = sum;
                for (; j < M; j++) {
                    sum += B[j] - B[j - K + i];
                    temp2 = Math.min(temp2, sum);
                }
                maxValue = Math.max(maxValue, (sumA - temp) + (sumB - temp2));
            }

            out.write("Case #" + t + ": " + maxValue + "\n");
            out.flush();
        }
    }
}