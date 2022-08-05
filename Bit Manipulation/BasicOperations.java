import java.io.*;
import java.util.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class BasicOperations implements Runnable {
	private static int bitwiseAND(int a, int b) {
		return a & b;
	}
	private static int bitwiseOR(int a, int b) {
		return a | b;
	}
	private static int bitwiseXOR(int a, int b) {
		return a ^ b;
	}
	private static int bitwiseLS(int a, int b) {
		return a << b;
	}
	private static int bitwiseRS(int a, int b) {
		return a >> b;
	}
	private static int bitwiseURS(int a, int b) {
		return a >>> b;
	}
	private static int bitwiseComplement(int a) {
		return ~a;
	}
    private static final void solution() throws IOException {
        InputReader input = new InputReader(new FileReader(System.getenv("INPUT")));
        PrintWriter output = new PrintWriter(new BufferedOutputStream(new FileOutputStream(System.getenv("OUTPUT"))));
        // InputReader input = new InputReader(in);
        // PrintWriter output = new PrintWriter(new BufferedOutputStream(out));

        int test = input.nextInt();
        while (test-- > 0) {
            int a = input.nextInt(),
            b = input.nextInt();
            output.println("Bitwise AND of A and B is: " + bitwiseAND(a, b));
            output.println("Bitwise OR of A and B is: " + bitwiseOR(a, b));
            output.println("Bitwise XOR of A and B is: " + bitwiseXOR(a, b));
            output.println("Bitwise LeftShift of A by 1 is: " + bitwiseLS(a, 1));
            output.println("Bitwise RightShift of A by 1 is: " + bitwiseRS(a, 1));
            output.println("Bitwise UnsignedRS of A by 1 is: " + bitwiseURS(a, 1));
            output.println("Bitwise Complement of A is: " + bitwiseComplement(a));
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
        new Thread(null, new BasicOperations(), "Main", 1 << 26).start();
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