import java.io.*;
import java.util.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Parcels_Solution implements Runnable {

    static int n, m;

    private static final void solution() throws IOException {
        InputReader input = new InputReader(new FileReader(System.getenv("INPUT")));
        PrintWriter output = new PrintWriter(new BufferedOutputStream(new FileOutputStream(System.getenv("OUTPUT"))));
        // InputReader input = new InputReader(in);
        // PrintWriter output = new PrintWriter(new BufferedOutputStream(out));

        int test = input.nextInt();
        for (int t = 1; t <= test; t++) {
            n = input.nextInt();
            m = input.nextInt();
            int[][] cost = new int[n][m];
            for (int i = 0; i < n; i++)
                cost[i] = input.readIntArray(m);

            Queue<Pair> q = new LinkedList<>();
            // q.offer(new Pair(1, 1));
            var distances = getDistances(cost, n, m);
            var result = minimumTime(cost, q);
            output.println("Case #" + t + ": " + 0);
        }
        output.close();
        input.close();
    }
    private static Queue<Pair> getDistances(int[][] cost, int n, int m) {
        
    }

    private static final int BFS(int[][] cost, Queue<Pair> q) {
        int[] dx = {+1, +0, -1, +0};
        int[] dy = {+0, +1, +0, -1};
        int maxCost = 0;

        while (!q.isEmpty()) {
            Pair curr = q.poll();
            maxCost = max(maxCost, cost[curr.first][curr.second]);
            for (int k = 0; k < 4; k++) {
                Pair next = new Pair(curr.first + dx[k], curr.second + dy[k]);
                if (next.first >= 0 && next.first < n && next.second >= 0 && next.second < m) {
                    if (cost[curr.first][curr.second] + 1 < cost[next.first][next.second]) {
                        cost[next.first][next.second] = cost[curr.first][curr.second] + 1;
                        q.offer(next);
                    }
                }
            }
        }

        return maxCost;
    }

    private static final int minimumTime(int[][] cost, Queue<Pair> q) {
        int ans = BFS(cost, q);
        int low = 0, high = ans - 1;
        while (low < high) {
            int mid = (low + high) >> 1;
            if (possible(cost, mid)) {
                ans = mid;
                high = mid - 1;
            } else
                low = mid + 1;
        }
        return ans;
    }

    private static final boolean possible(int[][] cost, int d) {
        int maxSum = Integer.MIN_VALUE, minSum = Integer.MAX_VALUE;
        int maxDiff = Integer.MIN_VALUE, minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (cost[i][j] > d) {
                    maxSum = max(maxSum, i + j);
                    minSum = min(minSum, i + j);
                    maxDiff = max(maxDiff, i - j);
                    minDiff = min(minDiff, i - j);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int curr = 0;
                curr = max(curr, abs(maxSum - (i + j)));
                curr = max(curr, abs(minSum - (i + j)));
                curr = max(curr, abs(maxDiff - (i - j)));
                curr = max(curr, abs(minDiff - (i - j)));

                if (curr <= d) return true;
            }
        }
        return false;
    }


    @Override
    public void run() {
        try {
            solution();
        } catch (IOException ignore) {}
    }
    public static void main(String... args) throws IOException {
        new Thread(null, new Parcels_Solution(), "Main", 1 << 26).start();
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

class Pair {
    int first, second;
    Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}
