import java.io.*;
import java.util.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class BuildingPalindromes_Solution implements Runnable {
    private static final void solution() throws IOException {
        InputReader input = new InputReader(new FileReader(System.getenv("INPUT")));
        PrintWriter output = new PrintWriter(new BufferedOutputStream(new FileOutputStream(System.getenv("OUTPUT"))));
        // InputReader input = new InputReader(in);
        // PrintWriter output = new PrintWriter(new BufferedOutputStream(out));

        int test = input.nextInt();
        for (int t = 1; t <= test; t++) {
            int N = input.nextInt(),
            Q = input.nextInt();
            char[] str = input.nextLine().toCharArray();
            int[][] queries = new int[Q][2];
            for (int i = 0; i < Q; i++) {
                queries[i] = input.readIntArray(2);
            }
            var result = 0;

        // Produced TLE for Test Set 2
            // for (int[] q : queries) {
            //     HashMap<Character, Integer> map = new HashMap<>();
            //     for (int i = q[0] - 1; i < q[1]; i++) {
            //         char ch = str[i];
            //         map.put(ch, map.getOrDefault(ch, 0) + 1);
            //     }
            //     for (Character ch : map.keySet()) {
            //         map.put(ch, map.get(ch) % 2);
            //     }
            //     int checkSum = 0;
            //     for (int v : map.values()) {
            //         checkSum += v;
            //     }
            //     if (checkSum <= 1)
            //         result++;
            // }

        // Optimized approach
            //Generate this just after getting str input
            int[][] PrefixSum = new int[N][26];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < 26; j++) {
                    if (i == 0) {
                        if (str[i] - 65 == j)
                            PrefixSum[i][j] = 1;
                        else
                            PrefixSum[i][j] = 0;
                    } else {
                        if (str[i] - 65 == j)
                            PrefixSum[i][j] = PrefixSum[i - 1][j] + 1;
                        else
                            PrefixSum[i][j] = PrefixSum[i - 1][j];
                    }
                }
            }
            for (int[] q : queries) {
                int odd = 0;
                for (int i = 0; i < 26; i++) {
                    int freq = PrefixSum[q[1] - 1][i];
                    if (q[0] > 1)
                        freq -= PrefixSum[q[0] - 1 - 1][i];

                    if ((freq & 1) != 0)
                        odd++;
                }
                boolean lenIsEven = ((q[1] - q[0] + 1) & 1) == 0;
                if ((lenIsEven && odd == 0)
                    || (!lenIsEven && odd == 1))
                    result++;
            }
            output.println("Case #" + t + ": " + result);
        }
        output.close();
        input.close();
    }

    @Override
    public void run() {
        try {
            solution();
        } catch (IOException ignore) {}
    }
    public static void main(String... args) throws IOException {
        new Thread(null, new BuildingPalindromes_Solution(), "Main", 1 << 26).start();
    }

    private static final void printArr(PrintWriter output, int...arr) {
        output.println(Arrays.toString(arr).replaceAll("\\[|]|, ", " ").trim());
    }
    private static final void printArr(PrintWriter output, double...arr) {
        output.println(Arrays.toString(arr).replaceAll("\\[|]|, ", " ").trim());
    }
    private static final void printArr(PrintWriter output, long...arr) {
        output.println(Arrays.toString(arr).replaceAll("\\[|]|, ", " ").trim());
    }
    private static final void printArr(PrintWriter output, String...arr) {
        output.println(Arrays.toString(arr).replaceAll("\\[|]|, ", " ").trim());
    }
    private static final boolean isPowerofTwo(long n){
        if (n <= 0) return false;
        int bit = (int) (Math.log(n) / Math.log(2));
        
        long expec = 1 << bit;
        return n % expec == 0;
    }
}

class InputReader {
    private StringTokenizer st;
    private BufferedReader br;

    public InputReader(InputStream s) {
        br = new BufferedReader(new InputStreamReader(s));
    }
    public InputReader(FileReader s) throws FileNotFoundException {
        br = new BufferedReader(s);
    }

    public final String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine());
        return st.nextToken();
    }
    public final String nextLine() throws IOException {
        return br.readLine();
    }
    public final byte nextByte() throws IOException {
        return Byte.parseByte(next());
    }
    public final short nextShort() throws IOException {
        return Short.parseShort(next());
    }
    public final int nextInt() throws IOException {
        return Integer.parseInt(next());
    }
    public final long nextLong() throws IOException {
        return Long.parseLong(next());
    }
    public final double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }
    public final char nextChar() throws IOException {
        return next().charAt(0);
    }
    public final boolean nextBoolean() throws IOException {
        return Boolean.parseBoolean(next());
        // return Boolean.getBoolean(next());
        // return Boolean.valueOf(next());
    }

    public int[] readIntArray(int n) throws IOException {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = nextInt();
        return arr;
    }
    public int[] readIntArray() throws IOException {
        return java.util.Arrays.stream(nextLine().split("\\s+")).
                mapToInt(Integer::parseInt).toArray();
    }
    public long[] readLongArray(int n) throws IOException {
        long[] arr = new long[n];
        for (int i = 0; i < n; i++)
            arr[i] = nextLong();
        return arr;
    }
    public long[] readLongArray() throws IOException {
        return java.util.Arrays.stream(nextLine().split("\\s+")).
                mapToLong(Long::parseLong).toArray();
    }
    public double[] readDoubleArray(int n) throws IOException {
        double[] arr = new double[n];
        for (int i = 0; i < n; i++)
            arr[i] = nextDouble();
        return arr;
    }
    public double[] readDoubleArray() throws IOException {
        return java.util.Arrays.stream(nextLine().split("\\s+")).
                mapToDouble(Double::parseDouble).toArray();
    }
    public String[] readStringArray(int n) throws IOException {
        String[] arr = new String[n];
        for (int i = 0; i < n; i++)
            arr[i] = next();
        return arr;
    }
    public String[] readStringArray() throws IOException {
        return nextLine().split("\\s+");
    }
    public boolean ready() throws IOException {
        return br.ready();
    }
    public void close() throws IOException {
        br.close();
    }
}