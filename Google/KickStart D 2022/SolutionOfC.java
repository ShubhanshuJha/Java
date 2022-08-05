// Passes only 1 set i.e. partially correct
import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        int test = Integer.parseInt(in.readLine());
        for (int t = 1; t <= test; t++) {
            int N = Integer.parseInt(in.readLine());
            int[] S = Arrays.stream(in.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            int M = Integer.parseInt(in.readLine());
            int[] K = Arrays.stream(in.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            int minTime = 0;

            HashMap<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>(){
                {
                    for (int i = 0; i < M; i++) {
                        if (!containsKey(K[i]))
                            put(K[i], new ArrayList<Integer>());
                        get(K[i]).add(i);
                    }
                }
            };
            int prev = Integer.MAX_VALUE;
            if (N == 1 || map.get(S[0]).size() == 1)
                prev = map.get(S[0]).get(0);
            else {
                int nxt = Integer.MAX_VALUE;
                for (int i : map.get(S[1])) nxt = Math.min(nxt, i);
                int min = Integer.MAX_VALUE;
                for (int i : map.get(S[0])) {
                    int diff = Math.abs(nxt - i);
                    if (diff < min) {
                        min = diff;
                        prev = i;
                    }
                }
            }
            for (int i = 1; i < N; i++) {
                int curr = map.get(S[i]).get(0);
                minTime += Math.abs(curr - prev);
                prev = curr;
            }
            
            out.write("Case #" + t + ": " + minTime + "\n");
            out.flush();
        }
    }
}